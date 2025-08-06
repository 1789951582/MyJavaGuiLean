package awt;

import java.awt.*;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

//Panel ���Կ�����һ���ռ䣬���ǲ��ܵ�������
public class TestPanel1 {
    public static void main(String[] args) {
        Frame frame = new Frame();
        //���ֵĸ���
        Panel panel = new Panel();


        //���ò���
        frame.setLayout(null);
        //����
        frame.setBounds(300,300,500,500);
        frame.setBackground(new Color(102, 204, 255));

        //panel�������꣬�����frame
        panel.setBounds(50,50,400,400);
        panel.setBackground(new Color(0,0,0));

        //frame.add()
        frame.add(panel);

        frame.setVisible(true);

        //�����¼����������ڹر��¼� System.exit(0)
        frame.addWindowListener(new WindowAdapter() {//������ģʽ����ֻʵ����Ҫ������Listener����
            //���ڹرյ�ʱ����Ҫ��������
            @Override
            public void windowClosing(WindowEvent e) {
                //��������
                System.exit(0);
            }
        });
    }
}
