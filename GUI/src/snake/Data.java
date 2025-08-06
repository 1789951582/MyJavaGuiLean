package snake;

import javax.swing.*;
import java.net.URL;

//数据中心
public class Data {

    public static URL top_right = Data.class.getResource("/static/top_right.png");
    public static URL top_left = Data.class.getResource("/static/top_left.png");
    public static URL top_up = Data.class.getResource("/static/top_up.png");
    public static URL top_down = Data.class.getResource("/static/top_down.png");

    public static ImageIcon header = new ImageIcon(top_right);

    public static ImageIcon body = new ImageIcon(Data.class.getResource("/static/body.png"));
    public static ImageIcon food = new ImageIcon(Data.class.getResource("/static/food.png"));

    
}
