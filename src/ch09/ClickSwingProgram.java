package ch09;

import java.awt.*;
import java.awt.event.*;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class ClickSwingProgram extends JFrame{
    private JLabel la = new JLabel("C");

    public ClickSwingProgram(){
        setTitle("클릭 연습");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        Container c = getContentPane();
        c.setLayout(null);
        la.setLocation(50,50);
        la.setSize(30,30);
        la.addMouseListener(new MyMouseListener());
        c.add(la);

        setSize(250,150);
        setVisible(true);
    }

    class MyMouseListener extends MouseAdapter{
        public void mouseClicked(MouseEvent e){
            JLabel la = (JLabel)e.getSource();
            Container c = la.getParent();
            int xBound = c.getWidth() - la.getWidth();
            int yBound = c.getHeight() - la.getHeight();
            int x = (int)(Math.random()*xBound);
            int y = (int)(Math.random()*yBound);
            la.setLocation(x,y);
        }
    }

    public static void main(String[] args) {
        new ClickSwingProgram();
    }
}
