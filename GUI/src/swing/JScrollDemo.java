package swing;

import javax.swing.*;
import java.awt.*;

public class JScrollDemo extends JFrame {
    public JScrollDemo() {
        Container contentPane = getContentPane();

        //�ı���
        JTextArea jTextArea = new JTextArea(20, 50);
        jTextArea.setText("��ӭѧϰJava");

        //Scroll���
        JScrollPane jScrollPane = new JScrollPane(jTextArea);
        contentPane.add(jScrollPane);

        pack();
        setVisible(true);
    }

    public static void main(String[] args) {
        new JScrollDemo();
    }
}
