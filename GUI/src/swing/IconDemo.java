package swing;

import javax.swing.*;
import java.awt.*;

//ͼ�꣬��Ҫʵ����frame�̳�
public class IconDemo extends JFrame implements Icon {

    private int width;
    private int height;

    public IconDemo() {//�޲ι���

    }

    public IconDemo(int width,int height) {
        this.width = width;
        this.height = height;
    }

    public static void main(String[] args) {
        new IconDemo().init();
    }

    public void init(){
        IconDemo iconDemo = new IconDemo(15, 15);
        //ͼ����ڱ�ǩ��Ҳ���Է��ڰ�ť�ϣ�
        JLabel label = new JLabel("icontest", iconDemo, SwingConstants.CENTER);
        Container contentPane = getContentPane();
        contentPane.add(label);
        pack();
        this.setVisible(true);
    }

    @Override
    public void paintIcon(Component c, Graphics g, int x, int y) {
        g.fillOval(x,y,this.width,this.height);
    }

    @Override
    public int getIconWidth() {
        return this.width;
    }

    @Override
    public int getIconHeight() {
        return this.height;
    }
}
