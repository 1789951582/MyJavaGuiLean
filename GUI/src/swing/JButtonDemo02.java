package swing;

import javax.swing.*;
import java.awt.*;
import java.net.URL;

public class JButtonDemo02 extends JFrame {

    public JButtonDemo02() {
        Container contentPane = getContentPane();
        //��һ��ͼƬ��Ϊͼ��
        URL resource = this.getClass().getResource("tx.png");
        ImageIcon imageIcon = new ImageIcon(resource);

        //��ѡ��
        JRadioButton jRadioButton01 = new JRadioButton("JRadioButton01");
        JRadioButton jRadioButton02 = new JRadioButton("JRadioButton02");
        JRadioButton jRadioButton03 = new JRadioButton("JRadioButton03");

        //���ڵ�ѡ��ֻ��ѡ��һ��������,һ������ֻ��ѡ��һ��
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
