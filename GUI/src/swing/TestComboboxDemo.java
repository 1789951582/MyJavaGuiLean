package swing;

import javax.swing.*;
import java.awt.*;
import java.util.Vector;

public class TestComboboxDemo extends JFrame {

    public TestComboboxDemo() {
        Container contentPane = getContentPane();

        //生成列表的内容,稀疏数组
//        String[] contents = {"1","2","3"};

        Vector<String> contents = new Vector<>();


        JList<String> stringJList = new JList<>(contents);

        contents.add("1");
        contents.add("2");
        contents.add("3");

        contentPane.add(stringJList);

        setVisible(true);
        pack();
    }

    public static void main(String[] args) {
        new TestComboboxDemo();
    }
}
