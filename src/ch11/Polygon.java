package ch11;

import java.awt.*;
import javax.swing.*;

public class Polygon extends JFrame{
    public Polygon(){
        setTitle("마름모");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setContentPane(new MyPoly());
        setSize(300,300);
        setVisible(true);
    }

    class MyPoly extends JPanel{
        private int x[] = new int[4];
        private int y[] = new int[4];
        public void paintComponent(Graphics g){
            super.paintComponent(g);
            x[0] = getWidth()/2;
            x[1] = 0;
            x[2] = getWidth()/2;
            x[3] = getWidth();
            
            y[0] = 0;
            y[1] = getHeight()/2;
            y[2] = getHeight();
            y[3] = getHeight()/2;
            g.setColor(Color.BLUE);
            g.drawPolygon(x,y,4);
        }
    }

    public static void main(String[] args) {
        new Polygon();
    }
}
