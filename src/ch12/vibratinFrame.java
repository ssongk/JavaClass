package ch12;

import java.awt.event.*;
import java.util.Random;
import javax.swing.*;

public class vibratinFrame extends JFrame implements Runnable{
    private Thread th;
    public vibratinFrame(){
        setTitle("진동하는 프레임 만들기");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(200,200);
        setLocation(300,300);
        setVisible(true);

        getContentPane().addMouseListener(new MouseAdapter(){
            public void mousePressed(MouseEvent e){
                if(!th.isAlive()) return;
                th.interrupt();
            }
        });
        th = new Thread(this);
        th.start();
    }
    
    @Override
    public void run() {
        Random r = new Random();
        while(true){
            try{
                Thread.sleep(200);
            }
            catch(InterruptedException e){
                return;
            }
            int x = getX() + r.nextInt();
            int y = getY() + r.nextInt();
            setLocation(x,y);
        }
    }

    public static void main(String[] args) {
        new vibratinFrame();
    }
}
