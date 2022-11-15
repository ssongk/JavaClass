package ch12;

import java.awt.Color;
import java.awt.Graphics;
import java.util.Random;

import javax.swing.*;

public class RandomCircle extends JFrame{
    public RandomCircle(){
        setTitle("원을 0.5초");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setContentPane(new CirclePanel());
        setSize(300,300);
        setVisible(true);
    }
    
    class CirclePanel extends JPanel implements Runnable{
        private Random random = new Random();
        private int x = 100;
        private int y = 100;

        public CirclePanel(){
            new Thread(this).start();
        }        

        @Override
        protected void paintComponent(Graphics g) {
            super.paintComponent(g);
            g.setColor(Color.MAGENTA);
            g.drawOval(x, y, 50, 50);
        }

        @Override
        public void run() {
            while(true){
                try{
                    Thread.sleep(500);
                } catch(InterruptedException e) { return; }

                x =  random.nextInt(this.getWidth()-50);
                y =  random.nextInt(this.getHeight()-50);
                repaint();
            }
        }
    }

    public static void main(String[] args) {
        new RandomCircle();
    }
}
