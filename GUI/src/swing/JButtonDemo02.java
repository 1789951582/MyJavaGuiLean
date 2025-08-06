package swing;

import javax.swing.*;
import java.awt.*;
import java.net.URL;

public class JButtonDemo02 extends JFrame {

    public JButtonDemo02() {
        Container contentPane = getContentPane();
        //将一个图片变为图标
        URL resource = this.getClass().getResource("tx.png");
        ImageIcon imageIcon = new ImageIcon(resource);

        //单选框
        JRadioButton jRadioButton01 = new JRadioButton("JRadioButton01");
        JRadioButton jRadioButton02 = new JRadioButton("JRadioButton02");
        JRadioButton jRadioButton03 = new JRadioButton("JRadioButton03");

        //由于单选框只能选择一个，分组,一个组中只能选择一个
        ButtonGroup buttonGroup = new ButtonGroup();
        buttonGroup.add(jRadioButton01);
        buttonGroup.add(jRadioButton02);
        buttonGroup.add(jRadioButton03);

        jRadioButton01.setIcon(imageIcon);

        contentPane.add(jRadioButton01,BorderLayout.CENTER);
        contentPane.add(jRadioButton02,BorderLayout.EAST);
        contentPane.add(jRadioButton03,BorderLayout.WEST);

        pack();
        setVisible(true);
    }

    public static void main(String[] args) {
        new JButtonDemo02();
    }
}
