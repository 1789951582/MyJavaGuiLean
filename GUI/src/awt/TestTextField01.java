package awt;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class TestTextField01 {
    public static void main(String[] args) {
        //启动
        new Myframe();
    }
}

class Myframe extends Frame{
    public Myframe(){
        TextField textField = new TextField();
        add(textField);

        //监听这个文本框输入的文字
        //按下enter就会触发这个监听事件
        textField.addActionListener(new MyActionListener2());

        //设置替换编码
        textField.setEchoChar('*');

        pack();
        setVisible(true);
    }
}

class MyActionListener2 implements ActionListener{

    @Override
    public void actionPerformed(ActionEvent e) {
        TextField textField = (TextField) e.getSource();//获得一些资源，返回一个对象
        String text = textField.getText();//获得输入框的文本
        System.out.println(text);
        textField.setText("");
    }
}
