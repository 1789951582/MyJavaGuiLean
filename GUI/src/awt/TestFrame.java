package awt;

import java.awt.*;

//GUI的第一个界面
public class TestFrame {
    public static void main(String[] args) {
        //Frame对象，(看源码)
        Frame myfram = new Frame("我的第一个JAVA图像界面窗口");
        //需要设置可见性
        myfram.setVisible(true);
        //设置窗口大小
        myfram.setSize(400,400);
        //设置背景颜色
        myfram.setBackground(Color.white);
        //弹出的初始位置
        myfram.setLocation(200,200);
        //设置大小固定
        myfram.setResizable(false);
    }
}
