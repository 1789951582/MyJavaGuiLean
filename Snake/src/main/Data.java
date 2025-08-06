package main;

import javax.swing.*;
import java.net.URL;

//数据中心
public class Data {

    private static URL top_right = Data.class.getResource("static/top_right.png");

    private static URL top_left = Data.class.getResource("static/top_left.png");
    private static URL top_up = Data.class.getResource("static/top_up.png");
    private static URL top_down = Data.class.getResource("static/top_down.png");

    public static ImageIcon right = new ImageIcon(top_right);
    public static ImageIcon left = new ImageIcon(top_left);
    public static ImageIcon up = new ImageIcon(top_up);
    public static ImageIcon down = new ImageIcon(top_down);

    public static ImageIcon body = new ImageIcon(Data.class.getResource("static/body.png"));
    public static ImageIcon food = new ImageIcon(Data.class.getResource("static/food.png"));


}
