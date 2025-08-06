package swing;

import javax.swing.*;
import java.awt.*;

public class TestComboboxDemo01 extends JFrame {

    public TestComboboxDemo01(){
        Container contentPane = getContentPane();

        JComboBox<String> objectJComboBox = new JComboBox<>();

        objectJComboBox.addItem("����");
        objectJComboBox.addItem("�Ⱦ�");
        objectJComboBox.addItem("������");

        contentPane.add(objectJComboBox);

//        setBounds(100,100,200,200);
        pack();
        setVisible(true);
    }

    public static void main(String[] args) {
        new TestComboboxDemo01();
    }
}
