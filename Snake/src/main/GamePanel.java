package main;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.util.Random;

public class GamePanel extends JPanel implements KeyListener, ActionListener {

    //定义蛇的数据结构
    int length;//蛇的长度
    int[] snakeX = new int[600];
    int[] snakeY = new int[500];
    char fx = 'R';//初始方向
    boolean isStart = false;//游戏状态
    boolean isFail = false;

    //定时器，以毫秒为单位 1000ms = 1s
    Timer timer = new Timer(100,this);//100毫秒一次

    //食物坐标
    int foodX;
    int foodY;

    Random random = new Random();

    //构造器
    public GamePanel() {
        init();
        //获得焦点和键盘事件
        setFocusable(true);//获得点击事件
        addKeyListener(this);//获取键盘事件
    }

    //初始化方法
    public void init(){
        length = 3;
        snakeX[0] = 100;snakeY[0] = 100;//脑袋的坐标
        snakeX[1] = 75;snakeY[1] = 100;//第一个身体的坐标
        snakeX[2] = 50;snakeY[2] = 100;//第二个身体的坐标
        //生产随机食物点
        foodX = random.nextInt(33)*25;
        foodX = random.nextInt(23)*25;
    }

    //绘制面板,游戏中所有东西都用这个画笔来画
    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);//清屏

        setBackground(Color.GRAY);

        //把小蛇画上去
        switch (fx){
            case 'R' :
                Data.right.paintIcon(this,g,snakeX[0],snakeY[0]);
                break;
            case 'L' :
                Data.left.paintIcon(this,g,snakeX[0],snakeY[0]);
                break;
            case 'U' :
                Data.up.paintIcon(this,g,snakeX[0],snakeY[0]);
                break;
            case 'D' :
                Data.down.paintIcon(this,g,snakeX[0],snakeY[0]);
                break;
        }

        for (int i = 1; i<length; i++){
            Data.body.paintIcon(this,g,snakeX[i],snakeY[i]);
        }

        //游戏状态
        if (isFail){
            g.setFont(new Font("微软雅黑",Font.BOLD,40));
            g.setColor(Color.red);
            g.drawString("游戏失败按下空格重新开始",300,300);
        }else if(!isStart){
            g.setColor(Color.white);
            g.setFont(new Font("微软雅黑",Font.BOLD,40));
            g.drawString("按下空格开始游戏",300,300);
        }else {
            timer.getActionCommand();
            timer.start();
        }


        //把食物画上去
        Data.food.paintIcon(this,g,foodX,foodY);
    }

    @Override
    public void keyTyped(KeyEvent e) {

    }

    //键盘监听事件
    @Override
    public void keyPressed(KeyEvent e) {
        int keyCode = e.getKeyCode();
        switch (keyCode){
            case KeyEvent.VK_SPACE :
                isStart = !isStart;//取反
                isFail = false;
                repaint();
                break;
            case KeyEvent.VK_DOWN :
                fx = 'D';
                break;
            case KeyEvent.VK_UP:
                fx = 'U';
                break;
            case KeyEvent.VK_LEFT:
                fx = 'L';
                break;
            case KeyEvent.VK_RIGHT:
                fx = 'R';
                break;
        }

    }

    @Override
    public void keyReleased(KeyEvent e) {

    }

    //事件监听器--需要通过固定事件来判断，1s=10次
    @Override
    public void actionPerformed(ActionEvent e) {
        if (isStart){//如果游戏是开始状态，就让小蛇动起来！

            for (int i = length;i>=1;i--){
                    snakeX[i] = snakeX[i-1];
                    snakeY[i] = snakeY[i-1];
            }
            switch (fx){
                case 'R':
                    snakeX[0] = (snakeX[0] + 25) % 825;
                    break;
                case 'L':
                    snakeX[0] = (snakeX[0] - 25 + 825) % 825;
                    break;
                case 'U':
                    snakeY[0] = (snakeY[0] - 25 + 575) % 575;
                    break;
                case 'D':
                    snakeY[0] = (snakeY[0]+25)%575;
                    break;
            }
            //判断是否吃到食物
            if (snakeX[0]==foodX && snakeY[0]==foodY){
                length++;
                foodX = random.nextInt(33)*25;
                foodY = random.nextInt(23)*25;
            }
            //判断是否死亡
            for(int i = 1; i<length; i++){
                if (snakeX[0] == snakeX[i] && snakeY[0] == snakeY[i]){
//                    drawString("按下空格开始游戏",300,300);
                    isStart = false;
                    isFail = true;
                }
            }
            repaint();
        }
    }
}
