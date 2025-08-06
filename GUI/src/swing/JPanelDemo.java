package swing;

import javax.swing.*;
import java.awt.*;

public class JPanelDemo extends JFrame {

    public JPanelDemo() {
        Container contentPane = this.getContentPane();

        contentPane.setLayout(new GridLayout(2,1,10,10));//后面两个参数的意思是间距

        JPanel jPanel1 = new JPanel(new GridLayout(1, 3));
        JPanel jPanel2 = new JPanel(new GridLayout(1, 2));
//        JPanel jPanel3 = new JPanel(new GridLayout(1, 1));
//        JPanel jPanel4 = new JPanel(new GridLayout(1, 2));

        jPanel1.add(new JButton("1"));
        jPanel1.add(new JButton("1"));
        jPanel1.add(new JButton("1"));
        jPanel2.add(new JButton("2"));
        jPanel2.add(new JButton("2"));

        contentPane.add(jPanel1);
        contentPane.add(jPanel2);

        pack();
        setVisible(true);
    }

    public static void main(String[] args) {
        new JPanelDemo();
    }
}
