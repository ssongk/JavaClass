package ch11;

import java.awt.*;
import javax.swing.*;

public class OlympicFlag extends JFrame{
    public OlympicFlag(){
        setTitle("오륜기 그리기");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setContentPane(new MyOvalPanel());
        setSize(200,200);
        setVisible(true);
    }

    class MyOvalPanel extends JPanel{
        public void paintComponent(Graphics g){
            super.paintComponent(g);
            Color c[] = {Color.BLUE,Color.YELLOW,Color.BLACK,Color.GREEN,Color.RED};
            int x[] = {30,50,70,90,110};
            int y[] = {30,60,30,60,30};
            for(int i=0;i<x.length;i++){
                g.setColor(c[i]);
                g.drawOval(x[i], y[i], 50, 50);
            }
        }
    }

    public static void main(String[] args) {
        new OlympicFlag();
    }
}
