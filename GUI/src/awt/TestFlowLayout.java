package awt;

import java.awt.*;
//��ʽ����
public class TestFlowLayout {
    public static void main(String[] args) {
        Frame frame = new Frame();

        //���-��ť
        Button button1 = new Button("button1");
        Button button2 = new Button("button2");
        Button button3 = new Button("button3");

        //����Ϊ��ʽ����
//        frame.setLayout(new FlowLayout());//Ĭ�Ͼ���
        frame.setLayout(new FlowLayout(FlowLayout.LEFT));//����
        frame.setLayout(new FlowLayout(FlowLayout.RIGHT));//����

        frame.setSize(200,200);

        //�Ѱ�ť�����ȥ
        frame.add(button1);
        frame.add(button2);
        frame.add(button3);

        frame.setSize(200,200);
        frame.setVisible(true);
    }
}
