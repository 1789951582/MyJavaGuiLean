package awt;

import java.awt.*;

//GUI�ĵ�һ������
public class TestFrame {
    public static void main(String[] args) {
        //Frame����(��Դ��)
        Frame myfram = new Frame("�ҵĵ�һ��JAVAͼ����洰��");
        //��Ҫ���ÿɼ���
        myfram.setVisible(true);
        //���ô��ڴ�С
        myfram.setSize(400,400);
        //���ñ�����ɫ
        myfram.setBackground(Color.white);
        //�����ĳ�ʼλ��
        myfram.setLocation(200,200);
        //���ô�С�̶�
        myfram.setResizable(false);
    }
}
