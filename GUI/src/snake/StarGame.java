package snake;

import javax.swing.*;

//��Ϸ������
public class StarGame {
    public static void main(String[] args) {
        JFrame jFrame = new JFrame();

        jFrame.setBounds(10,10,900,720);

        jFrame.add(new GamePanel());

        jFrame.setVisible(true);
    }
}
