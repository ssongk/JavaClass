package ch09;

import java.awt.*;
import java.awt.event.*;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class GridLayout12Color extends JFrame{
    public GridLayout12Color(){
        setTitle("3x4 Color Frame");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        Container c = getContentPane();
        c.setLayout(new GridLayout(4,3));

        for(int i=0;i<12;i++){
            JLabel la = new JLabel(Integer.toString(i));
            la.setForeground(Color.BLACK);
            la.setBackground(Color.WHITE);
            la.setOpaque(true);
            la.addMouseListener(new MyMouseListener());
            c.add(la);
        }

        setSize(500,400);
        setVisible(true);
    }

    class MyMouseListener extends MouseAdapter{
        public void mouseClicked(MouseEvent e){
            JLabel la = (JLabel)e.getSource();
            int r = (int)(Math.random()*256);
            int g = (int)(Math.random()*256);
            int b = (int)(Math.random()*256);
            la.setBackground(new Color(r,g,b));
        }
    }

    public static void main(String[] args) {
        new GridLayout12Color();
    }
}
