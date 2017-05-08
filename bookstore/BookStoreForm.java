package bookstore;

import javax.swing.*;

/**
 * Created by WJF on 2016/12/2.
 */
public class BookStoreForm {

    public static void main(String[] args) {
        JFrame frame = new JFrame("BookStoreForm");
        frame.setContentPane(new BookStoreForm().panel1);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);
    }

    private JPanel panel1;
    private JButton button1;
    private JButton button2;
    private JButton button3;
    private JButton button4;
    private JButton button5;

    private void createUIComponents() {
        // TODO: place custom component creation code here
    }
}
