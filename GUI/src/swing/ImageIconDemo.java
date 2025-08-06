package swing;

import javax.swing.*;
import java.awt.*;
import java.net.URL;

public class ImageIconDemo extends JFrame {

    public ImageIconDemo() {

        URL resource = ImageIconDemo.class.getResource("tx.png");

        ImageIcon imageIcon = new ImageIcon(resource);
//        JLabel label = new JLabel("ImageIcon",imageIcon,SwingConstants.CENTER);
        JLabel label = new JLabel("ImageIcon");
        label.setIcon(imageIcon);
        label.setHorizontalAlignment(SwingConstants.CENTER);

        Container contentPane = getContentPane();
        contentPane.add(label);

        pack();
        setVisible(true);
    }

    public static void main(String[] args) {
        new ImageIconDemo();
    }
}
