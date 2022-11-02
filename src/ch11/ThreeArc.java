package ch11;

import java.awt.*;
import javax.swing.*;

public class ThreeArc extends JFrame{
    public ThreeArc(){
        setTitle("삼색원");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setContentPane(new MyArc());
        setSize(300,300);
        setVisible(true);
    }

    class MyArc extends JPanel{
        public void paintComponent(Graphics g){
            super.paintComponent(g);
            g.setColor(Color.YELLOW);
            g.fillArc(30, 30, 200, 200, 330, 120);
            g.setColor(Color.BLUE);
            g.fillArc(30, 30, 200, 200, 90, 120);
            g.setColor(Color.RED);
            g.fillArc(30, 30, 200, 200, 210, 120);
        }
    }

    public static void main(String[] args) {
        new ThreeArc();
    }
}
