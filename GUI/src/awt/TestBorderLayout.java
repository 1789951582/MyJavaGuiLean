package awt;

import java.awt.*;

public class TestBorderLayout {
    public static void main(String[] args) {
        Frame frame = new Frame("TestBorderLayout");
        Button eastBt = new Button("East");
        Button westBt = new Button("West");
        Button SouthBt = new Button("South");
        Button northBt = new Button("North");
        Button centerBt = new Button("Center");

        frame.setLayout(new BorderLayout());

        frame.add(eastBt,BorderLayout.EAST);
        frame.add(westBt,BorderLayout.WEST);
        frame.add(SouthBt,BorderLayout.SOUTH);
        frame.add(northBt,BorderLayout.NORTH);
        frame.add(centerBt,BorderLayout.CENTER);

        frame.setSize(200,200);
        frame.setVisible(true);
    }
}
