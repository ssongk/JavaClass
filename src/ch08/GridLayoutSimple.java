package ch08;

import java.awt.*;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class GridLayoutSimple extends JFrame{
    public GridLayoutSimple(){
        setTitle("GridLayout Simple");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // GridLayout grid = new GridLayout(4,2);
        // grid.setVgap(5);
        // contentPane.setLayout(grid);
        Container contentPane = getContentPane();

        contentPane.setLayout(new GridLayout(4,2,0,5));
        contentPane.add(new JLabel("이름"));
        contentPane.add(new JTextField(""));
        contentPane.add(new JLabel("학번"));
        contentPane.add(new JTextField(""));
        contentPane.add(new JLabel("학과"));
        contentPane.add(new JTextField(""));
        contentPane.add(new JLabel("과목"));
        contentPane.add(new JTextField(""));

        setSize(400,300);
        setVisible(true);
    }

    public static void main(String[] args) {
        new GridLayoutSimple();
    }
}
