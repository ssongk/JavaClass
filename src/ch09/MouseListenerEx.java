package ch09;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class MouseListenerEx extends JFrame{
    private JLabel label = new JLabel("Hello");

    public MouseListenerEx(){
        setTitle("Mouse 이벤트 예제");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        Container c = getContentPane();
        c.setLayout(null);
        c.addMouseListener(new MyMouseListener());

        int x = 30;
        int y = 30;
        label.setLocation(x,y);
        label.setSize(50,20);
        c.add(label);

        setSize(200,200);
        setVisible(true);
    }

    class MyMouseListener implements MouseListener{
        public void mousePressed(MouseEvent e){
            int x = e.getX();
            int y = e.getY();
            label.setLocation(x,y);
        }
        public void mouseReleased(MouseEvent e){}
        public void mouseClicked(MouseEvent e){}
        public void mouseEntered(MouseEvent e){}
        public void mouseExited(MouseEvent e){}
    }

    public static void main(String[] args) {
        new MouseListenerEx();
    }
}

