package swing;

import javax.swing.*;
import java.awt.*;

public class JButtonDemo03 extends JFrame {

    public JButtonDemo03() {
        Container contentPane = getContentPane();

        //¸´Ñ¡¿ò
        JCheckBox jCheckBox01 = new JCheckBox("jCheckBox01");
        JCheckBox jCheckBox02 = new JCheckBox("jCheckBox02");
        JCheckBox jCheckBox03 = new JCheckBox("jCheckBox03");

        contentPane.add(jCheckBox01,BorderLayout.NORTH);
        contentPane.add(jCheckBox02,BorderLayout.CENTER);
        contentPane.add(jCheckBox03,BorderLayout.SOUTH);

        pack();
        setVisible(true);
    }

    public static void main(String[] args) {
        new JButtonDemo03();
    }
}
