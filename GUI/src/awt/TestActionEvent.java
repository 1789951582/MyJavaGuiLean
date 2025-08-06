package awt;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

/**
 * �����¼�
 */
public class TestActionEvent {
    public static void main(String[] args) {
        //���°�ť������һЩ�¼�

        Frame frame = new Frame();
        Button button = new Button();

        button.addActionListener(new MyActionListener());

        frame.add(button);
        frame.pack();

        windowClose(frame);//�رմ���
        frame.setVisible(true);


    }

    //�رմ�����¼�
    private static void windowClose(Frame frame){
        frame.addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent e) {
                System.exit(0);
            }
        });
    }
}

//�¼�����
class MyActionListener implements ActionListener{

    @Override
    public void actionPerformed(ActionEvent e) {
        System.out.println("aaa");
    }
}
