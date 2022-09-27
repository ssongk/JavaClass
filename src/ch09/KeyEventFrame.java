package ch09;

import java.awt.*;
import java.awt.event.*;
import javax.swing.JFrame;

public class KeyEventFrame extends JFrame{
    public KeyEventFrame(){
        setTitle("키 누르기 떼기 연습");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        Container c = getContentPane();
        c.setBackground(Color.RED);
        c.addKeyListener(new MyKeyListener());

        setSize(250,150);
        setVisible(true);
        
        c.setFocusable(true);
        c.requestFocus();
    }

    class MyKeyListener extends KeyAdapter{
        public void keyPressed(KeyEvent e){
            if(e.getKeyChar()=='r'){
                Component comp = (Component)e.getSource();
                comp.setBackground(Color.CYAN);
            }
        }
        
        public void keyReleased(KeyEvent e){
            if(e.getKeyChar()=='r'){
                Component comp = (Component)e.getSource();
                comp.setBackground(Color.RED);
            }
        }
    }

    public static void main(String[] args) {
        new KeyEventFrame();
    }
}
