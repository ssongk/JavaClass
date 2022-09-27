package ch08;

import java.awt.*;
import javax.swing.*;

public class PlateFrame extends JFrame{
    public PlateFrame(){
        setTitle("4x4 Color Frame");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        Container c = getContentPane();
        c.setLayout(new GridLayout(4,4));

        JLabel[] label = new JLabel[16];
        Color[] color = {Color.RED,Color.ORANGE, Color.YELLOW, Color.GREEN, Color.CYAN, Color.BLUE, Color.MAGENTA, Color.GRAY, Color.PINK, Color.LIGHT_GRAY, Color.GREEN, Color.RED, Color.ORANGE, Color.YELLOW, Color.CYAN, Color.BLUE};

        for(int i=0;i<16;i++){
            label[i] = new JLabel(Integer.toString(i));
            label[i].setForeground(Color.BLACK);
            label[i].setBackground(color[i]);
            label[i].setOpaque(true);
            c.add(label[i]);
        }

        setSize(500,500);
        setVisible(true);
    }

    public static void main(String[] args) {
        new PlateFrame();
    }
}
