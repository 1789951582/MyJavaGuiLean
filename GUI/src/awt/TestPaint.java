package awt;

import java.awt.*;

public class TestPaint {
    public static void main(String[] args) {
        new MyPaint().loadFrame();
    }
}

class MyPaint extends Frame{

    public void loadFrame(){
        setBounds(200,200,600,400);
        setVisible(true);
    }

    //����
    @Override
    public void paint(Graphics g) {
        //����,��Ҫ����ɫ
        g.setColor(Color.red);
        g.drawOval(100,100,100,100);
        g.fillOval(100,100,100,100);//ʵ�ĵ�Բ
        g.setColor(Color.GREEN);
        g.fillRect(150,200,200,200);

        //����ϰ��,�������꽫����ԭΪ�������ɫ
    }
}