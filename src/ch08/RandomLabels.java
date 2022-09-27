package ch08;

import java.awt.*;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class RandomLabels extends JFrame{
    public RandomLabels(){
        setTitle("Ramdom Labels");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        Container c = getContentPane();
        c.setLayout(null);

        for(int i=0;i<20;i++){
            JLabel label = new JLabel(Integer.toString(i));
            int x = (int)(Math.random()*220)+30;
            int y = (int)(Math.random()*220)+30;
            label.setLocation(x,y);
            label.setSize(20,20);
            label.setBackground(Color.BLUE);
            label.setOpaque(true);
            label.setForeground(Color.MAGENTA);
            c.add(label);
        }

        setSize(500,300);
        setVisible(true);
    }
    public static void main(String[] args) {
        new RandomLabels();
    }
}
