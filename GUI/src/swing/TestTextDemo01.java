package swing;

import javax.swing.*;
import java.awt.*;

public class TestTextDemo01 extends JFrame {

    public TestTextDemo01() throws HeadlessException {
        Container contentPane = getContentPane();
        JTextField textField1 = new JTextField("hello");
        JTextField textField2 = new JTextField("world",20);

        contentPane.setLayout(new FlowLayout());

        contentPane.add(textField1);
        contentPane.add(textField2);

        pack();
        setVisible(true);
    }

    public static void main(String[] args) {
        new TestTextDemo01();
    }
}
