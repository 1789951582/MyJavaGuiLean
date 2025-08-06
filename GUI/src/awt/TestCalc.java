package awt;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

//public class TestCalc {
//    public static void main(String[] args) {
//        new Calculator().loadFrame();
//    }
//}
////��������
//class Calculator extends Frame{
//
//    TextField textField1,textField2,textField3;
//
//    public void loadFrame(){
//        //3���ı���
//        textField1 = new TextField(10);
//        textField2 = new TextField(10);
//        textField3 = new TextField(20);
//
//        //1����ť
//        Button button = new Button("=");
//
////        button.addActionListener(new MyCalculatorListener(textField1,textField2,textField3));
//        button.addActionListener(new MyCalculatorListener(this));
//
//        //1����ǩ
//
//        Label label = new Label("+");
//
//        //������
//        setLayout(new FlowLayout());
//
//        add(textField1);
//        add(label);
//        add(textField2);
//        add(button);
//        add(textField3);
//
//        pack();
//        setVisible(true);
//    }
//}
//
////��������
//class MyCalculatorListener implements ActionListener{
//
//    //��ȡ��������
////    private TextField num1,num2,num3;
////
////    public MyCalculatorListener(TextField num1, TextField num2, TextField num3) {
////        this.num1 = num1;
////        this.num2 = num2;
////        this.num3 = num3;
////    }
//
////    ��ȡ�������������
//    private Calculator calculator;
//
//    public MyCalculatorListener(Calculator calculator) {
//        this.calculator = calculator;
//    }
//
//    @Override
//    public void actionPerformed(ActionEvent e) {
//        //1.��ü����ͱ�����
////        Integer n1 = Integer.parseInt(num1.getText());
////        Integer n2 = Integer.parseInt(num2.getText());
//        Integer n1 = Integer.parseInt(calculator.textField1.getText());
//        Integer n2 = Integer.parseInt(calculator.textField2.getText());
//
////        �����ֵ+�������ŵ���������
//        calculator.textField3.setText(Integer.toString(n1+n2));
//
//        //���ǰ������
//        calculator.textField1.setText("");
//        calculator.textField2.setText("");
//    }
//}

//��ȫ����Ϊ�������д��

public class TestCalc {
    public static void main(String[] args) {
        new Calculator().loadFrame();
    }
}
//��������
class Calculator extends Frame{

    TextField textField1,textField2,textField3;

    public void loadFrame(){
        //3���ı���
        textField1 = new TextField(10);
        textField2 = new TextField(10);
        textField3 = new TextField(20);

        //1����ť
        Button button = new Button("=");

        button.addActionListener(new MyCalculatorListener());

        //1����ǩ
        Label label = new Label("+");

        //������
        setLayout(new FlowLayout());

        add(textField1);
        add(label);
        add(textField2);
        add(button);
        add(textField3);

        pack();
        setVisible(true);
    }

    //��������
    private class MyCalculatorListener implements ActionListener{

        @Override
        public void actionPerformed(ActionEvent e) {
            //1.��ü����ͱ�����
            Integer n1 = Integer.parseInt(textField1.getText());
            Integer n2 = Integer.parseInt(textField2.getText());

//        �����ֵ+�������ŵ���������
            textField3.setText(Integer.toString(n1+n2));

            //���ǰ������
            textField1.setText("");
            textField2.setText("");
        }
    }

}