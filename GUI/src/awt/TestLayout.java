package awt;

import java.awt.*;

/**
 * 练习布局
 */
public class TestLayout {

    //MyWrite
//    public static void main(String[] args) {
//        Frame frame = new Frame("testLayout");
//
//        Panel panel1 = new Panel();
//        Panel panel2 = new Panel();
//        Panel panel3 = new Panel();
//        Panel panel4 = new Panel();
//        Panel panel5 = new Panel();
//        Panel panel6 = new Panel();
//
//        Button b1 = new Button("bt1");
//        Button b2 = new Button("bt2");
//        Button b3 = new Button("bt3");
//        Button b4 = new Button("bt4");
//        Button b5 = new Button("bt5");
//        Button b6 = new Button("bt6");
//        Button b7 = new Button("bt7");
//        Button b8 = new Button("bt8");
//        Button b9 = new Button("bt9");
//        Button b10 = new Button("bt10");
//
//        frame.add(panel1,BorderLayout.WEST);
//        panel1.setLayout(new GridLayout(2,1));
//        panel1.add(b1);
//        panel1.add(b2);
//        frame.add(panel2,BorderLayout.EAST);
//        panel2.setLayout(new GridLayout(2,1));
//        panel2.add(b3);
//        panel2.add(b4);
//        frame.add(panel3,BorderLayout.CENTER);
//        panel3.add(panel4);
//        panel4.setLayout(new GridLayout(2,1));
//        panel4.add(panel5);
//        panel5.setLayout(new GridLayout(2,1));
//        panel5.add(b5);
//        panel5.add(b6);
//        panel4.add(panel6);
//        panel6.setLayout(new GridLayout(2,2));
//        panel6.add(b7);
//        panel6.add(b8);
//        panel6.add(b9);
//        panel6.add(b10);
//
//        frame.pack();
//        frame.setVisible(true);
//    }

    //answer

    public static void main(String[] args) {
//        总Frame
        Frame frame = new Frame();
        frame.setLayout(new GridLayout(2,1));

        //4个面板
        Panel p1 = new Panel(new BorderLayout());
        Panel p2 = new Panel(new BorderLayout());
        Panel p3 = new Panel(new GridLayout(2,1));
        Panel p4 = new Panel(new GridLayout(2,2));

        frame.add(p1);
        frame.add(p2);

        p1.add(new Button(),BorderLayout.WEST);
        p1.add(new Button(),BorderLayout.EAST);
        p1.add(p3,BorderLayout.CENTER);

        p2.add(new Button(),BorderLayout.WEST);
        p2.add(new Button(),BorderLayout.EAST);
        p2.add(p4,BorderLayout.CENTER);

        p3.add(new Button());
        p3.add(new Button());

        p4.add(new Button());
        p4.add(new Button());
        p4.add(new Button());
        p4.add(new Button());

        frame.pack();
        frame.setVisible(true);

    }

}

