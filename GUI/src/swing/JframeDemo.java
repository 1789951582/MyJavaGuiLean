package swing;

import javax.swing.*;
import java.awt.*;

public class JframeDemo {
    public static void main(String[] args) {
        //建立一个窗口
        new JframeDemo().init();
    }

    public void init(){
        JFrame jFrame = new JFrame("这是一个JFrame窗口");
        jFrame.setVisible(true);
        jFrame.setBounds(100,100,200,200);
//        jFrame.setBackground(Color.blue);

        //设置文字Jlabel
        JLabel label = new JLabel("hello world");

        jFrame.add(label);

        //让文本居中
        label.setHorizontalAlignment(SwingConstants.CENTER);

        //容器实例化
        Container contentPane = jFrame.getContentPane();//获得一个容器
        contentPane.setBackground(Color.BLUE);

        //关闭事件
        jFrame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
    }
}
