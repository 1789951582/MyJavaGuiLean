package awt;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class TestActionTwo {
    public static void main(String[] args) {
        //������ť��ʵ��ͬһ������
        Frame frame = new Frame("��ʼ-ֹͣ");
        Button start = new Button("start");
        Button stop = new Button("stop");

        //������ʾ�Ķ��崥���᷵�ص�����������ʾ���������Ĭ�ϵ�ֵ��
        //���Զ����ťֻдһ�������࣬�ڼ��������жϴ�������ֵ��ʲôȻ�����ж�
        start.setActionCommand("start");
        stop.setActionCommand("stop");

        MyMonitor myMonitor = new MyMonitor();
        start.addActionListener(myMonitor);
        stop.addActionListener(myMonitor);

        frame.add(start,BorderLayout.NORTH);
        frame.add(start,BorderLayout.SOUTH);
        frame.add(stop);

        frame.pack();
        frame.setVisible(true);
    }
}

class MyMonitor implements ActionListener{

    @Override
    public void actionPerformed(ActionEvent e) {
        String actionCommand = e.getActionCommand();
        System.out.println(actionCommand);
    }
}