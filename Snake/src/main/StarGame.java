package main;

import javax.swing.*;

//”Œœ∑∆Ù∂Ø¿‡
public class StarGame {
    public static void main(String[] args) {
        JFrame jFrame = new JFrame();

        jFrame.setBounds(10,10,850,600);

        jFrame.add(new GamePanel());

        jFrame.setVisible(true);
        jFrame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
    }
}
