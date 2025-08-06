package awt;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

//public class TestCalc {
//    public static void main(String[] args) {
//        new Calculator().loadFrame();
//    }
//}
////计算器类
//class Calculator extends Frame{
//
//    TextField textField1,textField2,textField3;
//
//    public void loadFrame(){
//        //3个文本框
//        textField1 = new TextField(10);
//        textField2 = new TextField(10);
//        textField3 = new TextField(20);
//
//        //1个按钮
//        Button button = new Button("=");
//
////        button.addActionListener(new MyCalculatorListener(textField1,textField2,textField3));
//        button.addActionListener(new MyCalculatorListener(this));
//
//        //1个标签
//
//        Label label = new Label("+");
//
//        //流布局
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
////监听器类
//class MyCalculatorListener implements ActionListener{
//
//    //获取三个变量
////    private TextField num1,num2,num3;
////
////    public MyCalculatorListener(TextField num1, TextField num2, TextField num3) {
////        this.num1 = num1;
////        this.num2 = num2;
////        this.num3 = num3;
////    }
//
////    获取计算器这个对象
//    private Calculator calculator;
//
//    public MyCalculatorListener(Calculator calculator) {
//        this.calculator = calculator;
//    }
//
//    @Override
//    public void actionPerformed(ActionEvent e) {
//        //1.获得加数和被加数
////        Integer n1 = Integer.parseInt(num1.getText());
////        Integer n2 = Integer.parseInt(num2.getText());
//        Integer n1 = Integer.parseInt(calculator.textField1.getText());
//        Integer n2 = Integer.parseInt(calculator.textField2.getText());
//
////        将这个值+法运算后放到第三个框
//        calculator.textField3.setText(Integer.toString(n1+n2));
//
//        //清除前两个框
//        calculator.textField1.setText("");
//        calculator.textField2.setText("");
//    }
//}

//完全改造为面向对象写法

public class TestCalc {
    public static void main(String[] args) {
        new Calculator().loadFrame();
    }
}
//计算器类
class Calculator extends Frame{

    TextField textField1,textField2,textField3;

    public void loadFrame(){
        //3个文本框
        textField1 = new TextField(10);
        textField2 = new TextField(10);
        textField3 = new TextField(20);

        //1个按钮
        Button button = new Button("=");

        button.addActionListener(new MyCalculatorListener());

        //1个标签
        Label label = new Label("+");

        //流布局
        setLayout(new FlowLayout());

        add(textField1);
        add(label);
        add(textField2);
        add(button);
        add(textField3);

        pack();
        setVisible(true);
    }

    //监听器类
    private class MyCalculatorListener implements ActionListener{

        @Override
        public void actionPerformed(ActionEvent e) {
            //1.获得加数和被加数
            Integer n1 = Integer.parseInt(textField1.getText());
            Integer n2 = Integer.parseInt(textField2.getText());

//        将这个值+法运算后放到第三个框
            textField3.setText(Integer.toString(n1+n2));

            //清除前两个框
            textField1.setText("");
            textField2.setText("");
        }
    }

}