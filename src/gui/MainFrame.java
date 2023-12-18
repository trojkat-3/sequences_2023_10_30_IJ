package gui;

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

    private Sequence currentSq=null;

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
