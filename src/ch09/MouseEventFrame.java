package ch09;
// 실습 문제 1번

import java.awt.*;
import java.awt.event.*;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class MouseEventFrame extends JFrame{
    private JLabel la = new JLabel("자기야");
    public MouseEventFrame(){
        setTitle("마우스 올렸다 떼기 연습");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        Container c = getContentPane();
        c.setLayout(new FlowLayout());
        la.addMouseListener(new MyMouseListener());
        c.add(la);

        setSize(250,150);
        setVisible(true);
    }
    class MyMouseListener extends MouseAdapter{
        public void mouseEntered(MouseEvent e){
            la.setText("사랑해");
        }

        public void mouseExited(MouseEvent e){
            la.setText("자기야");
        }
    }
    public static void main(String[] args) {
        new MouseEventFrame();
    }
}
