package awt;

import java.awt.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.util.ArrayList;
import java.util.Iterator;

public class TestMouseListener {
    public static void main(String[] args) {
        new MyFrame("��ͼ");
    }
}

class MyFrame extends Frame {
    //������Ҫ���ʣ���Ҫ������굱ǰλ�ã���Ҫ�������洢�����
    ArrayList<Point> points;

    public MyFrame(String title) {
        super(title);
        setBounds(200,200,400,300);

        //�����ĵ�
        points = new ArrayList();

//        ���������������������
        this.addMouseListener(new MyMouseListener());
        setVisible(true);

    }

    @Override
    public void paint(Graphics g) {
        //���������������¼�
        Iterator iterator = points.iterator();
        while (iterator.hasNext()){
            Point nextP = (Point) iterator.next();
            g.setColor(Color.BLUE);
            g.fillOval(nextP.x,nextP.y,10,10);
        }
    }

    private class MyMouseListener extends MouseAdapter {
        @Override
        public void mouseClicked(MouseEvent e) {
            MyFrame myFrame = (MyFrame) e.getSource();
            //�����ڵ����ʱ�������Ļ�ϲ���һ����
            //�����������ĵ�
            points.add(new Point(e.getX(),e.getY()));

            //ÿ�ε����궼��Ҫ���»�һ��
            myFrame.repaint();//ˢ��
        }
    }
}
