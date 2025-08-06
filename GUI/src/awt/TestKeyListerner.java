package awt;

import java.awt.*;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

public class TestKeyListerner {
    public static void main(String[] args) {
        new KeyFrame();
    }
}

class KeyFrame extends Frame{
    public KeyFrame() {
        setBounds(1,2,300,400);
        setVisible(true);

        this.addKeyListener(new KeyAdapter() {
            @Override
            public void keyPressed(KeyEvent e) {
                //��ȡ���̰��µļ����ĸ�������ǰ���µļ���
                int keyCode = e.getKeyCode();
                if(keyCode == KeyEvent.VK_UP){
                    System.out.println("�㰴�����ϼ�");
                }
            }
        });
    }
}