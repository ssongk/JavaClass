package ch11;

import java.awt.*;
import java.awt.event.*;
import java.util.Vector;
import javax.swing.*;

public class GrapicsDrawPolygonMouse extends JFrame{
    public GrapicsDrawPolygonMouse(){
        setTitle("마우스로 폐다각형 그리기");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setContentPane(new MyPolygonPanel());
        setSize(300,300);
        setVisible(true);
    }

    public static void main(String[] args) {
        new GrapicsDrawPolygonMouse();
    }

    class MyPolygonPanel extends JPanel{
        private Vector<Integer> x = new Vector<>();
        private Vector<Integer> y = new Vector<>();

        public MyPolygonPanel(){
            this.addMouseListener(new MouseAdapter(){
                public void mousePressed(MouseEvent e){
                    x.add(e.getX());
                    y.add(e.getY());
                    repaint();
                }
            });
        }

        public void paintComponent(Graphics g){
            super.paintComponent(g);
            g.setColor(new Color(200,30,110));
            int xs[] = new int[x.size()];
            int ys[] = new int[y.size()];
            for(int i=0;i<xs.length;i++){
                xs[i] = x.get(i);
                ys[i] = y.get(i);
            }
            g.drawPolygon(xs,ys,xs.length);
        }

    }
}
