package swing;

import javax.swing.*;
import java.awt.*;

public class JframeDemo {
    public static void main(String[] args) {
        //����һ������
        new JframeDemo().init();
    }

    public void init(){
        JFrame jFrame = new JFrame("����һ��JFrame����");
        jFrame.setVisible(true);
        jFrame.setBounds(100,100,200,200);
//        jFrame.setBackground(Color.blue);

        //��������Jlabel
        JLabel label = new JLabel("hello world");

        jFrame.add(label);

        //���ı�����
        label.setHorizontalAlignment(SwingConstants.CENTER);

        //����ʵ����
        Container contentPane = jFrame.getContentPane();//���һ������
        contentPane.setBackground(Color.BLUE);

        //�ر��¼�
        jFrame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
    }
}
