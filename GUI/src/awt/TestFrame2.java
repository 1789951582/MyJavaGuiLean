package awt;

import java.awt.*;

public class TestFrame2 {
    public static void main(String[] args) {
        //展示多个窗口
        MyFrameClass myFrameClass1 = new MyFrameClass(100, 100, 200, 200, Color.blue);
        MyFrameClass myFrameClass2 = new MyFrameClass(300, 100, 200, 200, Color.yellow);
        MyFrameClass myFrameClass3 = new MyFrameClass(100, 300, 200, 200, Color.red);
        MyFrameClass myFrameClass4 = new MyFrameClass(300, 300, 200, 200, Color.MAGENTA);
    }
}

class MyFrameClass extends Frame{
    static int id =0;//可能存在多个窗口，我们需要一个计数器
    public MyFrameClass(int x,int y,int w,int h,Color color){
        super("Myframe"+(++id));
        setBackground(color);
        setBounds(x, y, w, h);
        setVisible(true);
    }
}