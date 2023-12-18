package gui;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

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

    public MainFrame(){
        super();
        this.setContentPane(mainPanel);
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
    }

    private void actionQuit(){
        this.dispose();
    }
    private void actionCredits(){
        JOptionPane.showMessageDialog(this,"Developed by MS", "Credits",
                JOptionPane.INFORMATION_MESSAGE);
    }
}
