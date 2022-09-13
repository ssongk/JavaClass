package ch08;

import java.awt.Color;
import java.awt.Container;
import java.awt.GridLayout;
import javax.swing.JButton;
import javax.swing.JFrame;

public class GridLayoutEx extends JFrame{

    public GridLayoutEx(){
        Color[] color = {Color.RED, Color.ORANGE, Color.YELLOW, Color.GREEN, Color.CYAN, Color.BLUE, Color.MAGENTA, Color.GRAY, Color.PINK, Color.LIGHT_GRAY};
        
        setTitle("Tem Color Buttons Frame");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        Container contentPane = getContentPane();
        contentPane.setLayout(new GridLayout(1,10));

        for(int i=0;i<10;i++){
            JButton button = new JButton(Integer.toString(i));
            button.setBorderPainted(false);
            button.setOpaque(true);
            button.setBackground(color[i]);
            contentPane.add(button);
        }

        setSize(1000,400);
        setVisible(true);
    }

    public static void main(String[] args) {
        new GridLayoutEx();
    }
}
