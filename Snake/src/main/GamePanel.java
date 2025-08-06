package main;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.util.Random;

public class GamePanel extends JPanel implements KeyListener, ActionListener {

    //�����ߵ����ݽṹ
    int length;//�ߵĳ���
    int[] snakeX = new int[600];
    int[] snakeY = new int[500];
    char fx = 'R';//��ʼ����
    boolean isStart = false;//��Ϸ״̬
    boolean isFail = false;

    //��ʱ�����Ժ���Ϊ��λ 1000ms = 1s
    Timer timer = new Timer(100,this);//100����һ��

    //ʳ������
    int foodX;
    int foodY;

    Random random = new Random();

    //������
    public GamePanel() {
        init();
        //��ý���ͼ����¼�
        setFocusable(true);//��õ���¼�
        addKeyListener(this);//��ȡ�����¼�
    }

    //��ʼ������
    public void init(){
        length = 3;
        snakeX[0] = 100;snakeY[0] = 100;//�Դ�������
        snakeX[1] = 75;snakeY[1] = 100;//��һ�����������
        snakeX[2] = 50;snakeY[2] = 100;//�ڶ������������
        //�������ʳ���
        foodX = random.nextInt(33)*25;
        foodX = random.nextInt(23)*25;
    }

    //�������,��Ϸ�����ж������������������
    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);//����

        setBackground(Color.GRAY);

        //��С�߻���ȥ
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

        //��Ϸ״̬
        if (isFail){
            g.setFont(new Font("΢���ź�",Font.BOLD,40));
            g.setColor(Color.red);
            g.drawString("��Ϸʧ�ܰ��¿ո����¿�ʼ",300,300);
        }else if(!isStart){
            g.setColor(Color.white);
            g.setFont(new Font("΢���ź�",Font.BOLD,40));
            g.drawString("���¿ո�ʼ��Ϸ",300,300);
        }else {
            timer.getActionCommand();
            timer.start();
        }


        //��ʳ�ﻭ��ȥ
        Data.food.paintIcon(this,g,foodX,foodY);
    }

    @Override
    public void keyTyped(KeyEvent e) {

    }

    //���̼����¼�
    @Override
    public void keyPressed(KeyEvent e) {
        int keyCode = e.getKeyCode();
        switch (keyCode){
            case KeyEvent.VK_SPACE :
                isStart = !isStart;//ȡ��
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

    //�¼�������--��Ҫͨ���̶��¼����жϣ�1s=10��
    @Override
    public void actionPerformed(ActionEvent e) {
        if (isStart){//�����Ϸ�ǿ�ʼ״̬������С�߶�������

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
            //�ж��Ƿ�Ե�ʳ��
            if (snakeX[0]==foodX && snakeY[0]==foodY){
                length++;
                foodX = random.nextInt(33)*25;
                foodY = random.nextInt(23)*25;
            }
            //�ж��Ƿ�����
            for(int i = 1; i<length; i++){
                if (snakeX[0] == snakeX[i] && snakeY[0] == snakeY[i]){
//                    drawString("���¿ո�ʼ��Ϸ",300,300);
                    isStart = false;
                    isFail = true;
                }
            }
            repaint();
        }
    }
}
