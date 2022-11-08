package ch11;

import java.awt.*;
import java.awt.event.*;
import java.util.Vector;
import javax.swing.*;

public class GraphicsDrawLineMouseEx extends JFrame{
    public GraphicsDrawLineMouseEx(){
        setTitle("마우스로 여러 개의 선 그리기 예제");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setContentPane(new MyLinePanel());
        setSize(300,300);
        setVisible(true);
    }

    public static void main(String[] args) {
        new GraphicsDrawLineMouseEx();
    }

    class MyLinePanel extends JPanel{
        private Vector<Point> vStart = new Vector<Point>();
        private Vector<Point> vEnd = new Vector<Point>();

        public MyLinePanel(){
            addMouseListener(new MouseAdapter(){
                public void mousePressed(MouseEvent e){
                    Point startP = e.getPoint();
                    vStart.add(startP);
                }
                public void mouseReleased(MouseEvent e){
                    Point endP = e.getPoint();
                    vEnd.add(endP);

                    repaint();
                }
            });
        }

        public void paintComponent(Graphics g){
            super.paintComponent(g);    
            g.setColor(new Color(100,100,100));

            for(int i=0;i<vStart.size();i++){
                Point s = vStart.elementAt(i);
                Point e = vEnd.elementAt(i);
                g.drawLine((int)s.getX(), (int)s.getY(), (int)e.getX(), (int)e.getY());
            }
        }
    }
}
