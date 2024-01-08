package gui;

import javax.swing.*;

public class TextArea extends JDialog {
    private JPanel contentPane;
    private JPanel mainPanel;
    private JTextArea textArea1;

    public void setText(String text){
        textArea1.setText(text);
    }


    public TextArea() {
        setContentPane(contentPane);
        setModal(true);
        this.pack();
        this.setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
        this.setSize(800,600);
    }

    public static void main(String[] args) {
        TextArea dialog = new TextArea();
        dialog.pack();
        dialog.setVisible(true);
        System.exit(0);
    }
}
