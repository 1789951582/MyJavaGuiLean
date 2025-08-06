package swing;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class DialogDemo extends JFrame {

    public DialogDemo() {
        this.setVisible(true);
        this.setSize(700,500);
        this.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);

        //JFrame�Ŷ���������
        Container container = this.getContentPane();
//        ���Բ���
        container.setLayout(null);

        //��ť
        JButton button = new JButton("�������һ���Ի���");
        button.setBounds(30,30,200,50);//��λд��

//        ��������ť��ʱ�򵯳�������
        container.add(button);

        button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                //����
                new MyDialogDemo();
            }
        });
    }

    public static void main(String[] args) {
        new DialogDemo();
    }
}

//�����Ĵ���
class MyDialogDemo extends JDialog{
    public MyDialogDemo() {
        this.setVisible(true);
        this.setBounds(100,100,500,500);

        Container container = this.getContentPane();
        container.setLayout(null);

        container.add(new Label("hello world"));
    }
}