package awt;

import java.awt.*;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class TestWindow {
    public static void main(String[] args) {
        new WindowFrame();
    }
}

class WindowFrame extends Frame {
    public WindowFrame() {
        setBackground(Color.black);
        setBounds(100,100,200,200);
//        addWindowListener(new WindowAdapter() {
//            @Override
//            public void windowClosing(WindowEvent e) {
//                System.exit(0);//正常退出
////                setVisible(false);//隐藏窗口，通过按钮，隐藏当前窗口
//            }
//        });
        addWindowListener(new WindowAdapter() {
            //关闭窗口
            @Override
            public void windowClosing(WindowEvent e) {
                System.out.println("windowClosing");
            }

            @Override
            public void windowClosed(WindowEvent e) {
                System.out.println("windowClosed");
            }

            //激活窗口
            @Override
            public void windowActivated(WindowEvent e) {
                System.out.println("windowActivated");
            }
        });
        setVisible(true);
    }
//    class MyWindowListenter extends WindowAdapter {
//        @Override
//        public void windowClosing(WindowEvent e) {
////            System.exit(0);//正常退出
//            setVisible(false);//隐藏窗口，通过按钮，隐藏当前窗口
//        }
//    }
}