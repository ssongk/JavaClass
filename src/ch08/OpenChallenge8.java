package ch08;

import java.awt.*;
import javax.swing.JButton;
import javax.swing.JPanel;
import javax.swing.JFrame;

class NorthPanel extends JPanel{
    NorthPanel(){
        setBackground(Color.LIGHT_GRAY);
        setLayout(new FlowLayout());
        add(new JButton("Open"));
        add(new JButton("Send"));
        add(new JButton("Close"));
    }
}

class SouthPanel extends JPanel{
    SouthPanel(){
        setLayout(null);
        Label l = new Label("Hello Java!");
        l.setBounds(200,200,100,20);
        add(l);
    }
}

public class OpenChallenge8 extends JFrame{
    public OpenChallenge8(){
        setTitle("Open Challenge 8");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        // setLayout(new BorderLayout());
        add(new NorthPanel(),BorderLayout.NORTH);
        add(new SouthPanel(),BorderLayout.CENTER);

        setSize(500,500);
        setVisible(true);
    }

    public static void main(String[] args) {
        new OpenChallenge8();
    }
}
