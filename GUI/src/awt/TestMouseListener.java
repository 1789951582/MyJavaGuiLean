package awt;

import java.awt.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.util.ArrayList;
import java.util.Iterator;

public class TestMouseListener {
    public static void main(String[] args) {
        new MyFrame("画图");
    }
}

class MyFrame extends Frame {
    //画画需要画笔，需要监听鼠标当前位置，需要集合来存储这个点
    ArrayList<Point> points;

    public MyFrame(String title) {
        super(title);
        setBounds(200,200,400,300);

        //存鼠标的点
        points = new ArrayList();

//        鼠标监听器，正对这个窗口
        this.addMouseListener(new MyMouseListener());
        setVisible(true);

    }

    @Override
    public void paint(Graphics g) {
        //画画，监听鼠标的事件
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
            //这里在点击的时候会在屏幕上产生一个点
            //这个点就是鼠标的点
            points.add(new Point(e.getX(),e.getY()));

            //每次点击鼠标都需要重新画一遍
            myFrame.repaint();//刷新
        }
    }
}
