package snake;

import javax.swing.*;
import java.awt.*;

public class GamePanel extends JPanel {

    //绘制面板,游戏中所有东西都用这个画笔来画
    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);//清屏
        setBackground(Color.BLACK);
    }
}
