package ch09;

import java.awt.*;
import java.awt.event.*;
import javax.swing.JFrame;

public class MouseDraggingFrame extends JFrame{
    public MouseDraggingFrame(){
        setTitle("드래깅동안 YELLOW로 변경");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        Container c = getContentPane();
        c.setBackground(Color.GREEN);
        MyMouseMotionListener listener = new MyMouseMotionListener();
        c.addMouseListener(listener);
        c.addMouseMotionListener(listener);

        setSize(250,150);
        setVisible(true);
    }
    class MyMouseMotionListener extends MouseAdapter{
        public void mousePressed(MouseEvent e){
            Component comp = (Component)e.getSource();
            comp.setBackground(Color.YELLOW);
        }
        public void mouseReleased(MouseEvent e){
            Component comp = (Component)e.getSource();
            comp.setBackground(Color.GREEN);
        }
        public void MouseDragged(MouseEvent e){
            Component comp = (Component)e.getSource();
            comp.setBackground(Color.YELLOW);
        }
    }
    public static void main(String[] args) {
        new MouseDraggingFrame();
    }
}
