package swing;

import javax.swing.*;
import java.awt.*;
import java.net.URL;

public class JButtonDemo01 extends JFrame {

    public JButtonDemo01() {
        Container contentPane = getContentPane();
        URL resource = this.getClass().getResource("tx.png");
        ImageIcon imageIcon = new ImageIcon(resource);
        JButton jButton = new JButton();
        jButton.setIcon(imageIcon);
        jButton.setToolTipText("Í¼Æ¬°´Å¥");
        contentPane.add(jButton);

        pack();
        setVisible(true);
    }

    public static void main(String[] args) {
        new JButtonDemo01();
    }
}
