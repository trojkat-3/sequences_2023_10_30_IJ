package gui;

import printer.Printer;
import printer.PrinterDummy;
import sequence.*;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

public class MainFrame extends JFrame {
    private JPanel mainPanel;
    private JPanel topPanel;
    private JPanel buttonPanel;
    private JPanel centralPanel;
    private JButton buttonQuit;
    private JButton buttonReset;
    private JButton buttonCredits;
    private JComboBox comboBox1;
    private JButton selectButton;
    private JTextField textField1;
    private JButton changeButton;
    private JButton showElementsButton;
    private JButton saveToFileButton;
    private JTextField textField2;
    private JTextField textField3;
    private JButton decomposeButton;
    private JButton sumButton;
    private JLabel LabelMax;

    private Sequence currentSq=new Primes();
    private Printer printer=new PrinterDummy();

    class ComboItem {
        Sequence sq;

        public ComboItem(Sequence sq){
            this.sq=sq;
        }

        Sequence getSequence(){
            return sq;
        }

        public String toString(){
            return sq.getName();
        }
    }

    public MainFrame(){
        super();
        this.setContentPane(mainPanel);

        ArrayList<ComboItem> sqList=new ArrayList<>();
        sqList.add(new ComboItem(new Integers()));
        sqList.add(new ComboItem(new Squares()));
        sqList.add(new ComboItem(new Primes()));
        sqList.add(new ComboItem(new Fibonacci()));
        DefaultComboBoxModel comboModel=new DefaultComboBoxModel(sqList.toArray());
        comboBox1.setModel(comboModel);

        textField1.setText("Input value");
        textField1.setSize(60,40);

        buttonQuit.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                actionQuit();
            }
        });
        buttonCredits.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                actionCredits();
            }
        });
        selectButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                actionSelect();
            }
        });
        buttonReset.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                actionReset();
            }
        });
        showElementsButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                actionShowElements();
            }
        });
        changeButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                actionChangeMax();
            }
        });
    }

    private void actionChangeMax(){

    }

    private void actionShowElements(){
        TextArea tArea=new TextArea();
        tArea.setText(printer.print(currentSq));
        tArea.setVisible(true);
    }

    private void actionReset(){
        //lockSequence(false);
    }
    private void actionSelect(){
        //lockSequence(true);
    }
    private void actionQuit(){
        this.dispose();
    }
    private void actionCredits(){
        JOptionPane.showMessageDialog(this,"Developed by MS", "Credits",
                JOptionPane.INFORMATION_MESSAGE);
    }
}
