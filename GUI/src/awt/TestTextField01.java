package awt;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class TestTextField01 {
    public static void main(String[] args) {
        //����
        new Myframe();
    }
}

class Myframe extends Frame{
    public Myframe(){
        TextField textField = new TextField();
        add(textField);

        //��������ı������������
        //����enter�ͻᴥ����������¼�
        textField.addActionListener(new MyActionListener2());

        //�����滻����
        textField.setEchoChar('*');

        pack();
        setVisible(true);
    }
}

class MyActionListener2 implements ActionListener{

    @Override
    public void actionPerformed(ActionEvent e) {
        TextField textField = (TextField) e.getSource();//���һЩ��Դ������һ������
        String text = textField.getText();//����������ı�
        System.out.println(text);
        textField.setText("");
    }
}
