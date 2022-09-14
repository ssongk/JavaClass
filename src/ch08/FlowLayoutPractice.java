package ch08;

import java.awt.*;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class FlowLayoutPractice extends JFrame{
    public FlowLayoutPractice(){
        setTitle("FlowLayout Practice");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        Container contentPane = getContentPane();
        contentPane.setLayout(new FlowLayout());
        contentPane.add(new JLabel("100+200"));
        contentPane.add(new JButton("="));
        contentPane.add(new JLabel("300"));

        setSize(600,200);
        setVisible(true);
    }

    public static void main(String[] args) {
        new FlowLayoutPractice();
    }
}
