package ch11;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class GraphicsDrawingOvalMouseEx extends JFrame{
    public GraphicsDrawingOvalMouseEx(){
        setTitle("마우스 드래깅으로 타원 그리기 예제");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setContentPane(new MyOval());
        setSize(300,300);
        setVisible(true);
    }
    
    public static void main(String[] args) {
        new GraphicsDrawingOvalMouseEx();
    }

    class MyOval extends JPanel{
        private Point start=null, end=null;
        public MyOval(){
            MyMouseListener listener = new MyMouseListener();
            addMouseListener(listener);
            addMouseMotionListener(listener);
        }
        class MyMouseListener extends MouseAdapter{
            public void mousePressed(MouseEvent e){
                start = e.getPoint();
            }
            public void mouseDragged(MouseEvent e){
                end = e.getPoint();
                repaint();
            }
        }
        public void paintComponent(Graphics g){
            // super.paintComponent(g);
            if(start==null)
                return;

            g.setColor(Color.BLUE);
            int x = Math.min(start.x,end.x);
            int y = Math.min(start.y,end.y);
            int width = Math.abs(start.x-end.x);
            int height = Math.abs(start.y-end.y);
            g.drawOval(x, y, width, height);
        }
    }
}
