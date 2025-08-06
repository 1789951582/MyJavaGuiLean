package swing;

import javax.swing.*;
import java.awt.*;

public class TestTextDemo03 extends JFrame {

    public TestTextDemo03() {
        Container contentPane = getContentPane();

        JPasswordField jPasswordField = new JPasswordField();
        jPasswordField.setEchoChar('*');

        contentPane.add(jPasswordField);

        pack();
        setVisible(true);
    }

    public static void main(String[] args) {
        new TestTextDemo03();
    }
}
