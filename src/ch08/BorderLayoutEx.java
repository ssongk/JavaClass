package ch08;

import java.awt.Container;
import java.awt.BorderLayout;

import javax.swing.JButton;
import javax.swing.JFrame;

public class BorderLayoutEx extends JFrame{
    public BorderLayoutEx(){
        setTitle("BorderLayout Practice");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        Container contentPane = getContentPane();
        contentPane.setLayout(new BorderLayout(50,5));

        contentPane.add(new JButton("North"),BorderLayout.NORTH);
        contentPane.add(new JButton("West"),BorderLayout.WEST);
        contentPane.add(new JButton("Center"),BorderLayout.CENTER);
        contentPane.add(new JButton("East"),BorderLayout.EAST);
        contentPane.add(new JButton("South"),BorderLayout.SOUTH);

        setSize(500,400);
        setVisible(true);
    }

    public static void main(String[] args) {
        new BorderLayoutEx();
    }
}
