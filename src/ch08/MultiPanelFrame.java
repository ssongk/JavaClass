package ch08;

import java.awt.*;
import javax.swing.JButton;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.JFrame;
import javax.swing.JLabel;

class Panel1 extends JPanel{
    Panel1(){
        setBackground(Color.YELLOW);
        // setLayout(new FlowLayout());
        add(new JButton("새로 배치"));
        add(new JButton("종료"));
    }
}

class Panel2 extends JPanel{
    Panel2(){
        setBackground(Color.WHITE);
        setLayout(null);
        for(int i=0;i<10;i++){
            JLabel l = new JLabel("*");
            int x = (int)(Math.random()*200);
            int y = (int)(Math.random()*200);
            l.setLocation(x,y);
            l.setForeground(Color.RED);
            l.setSize(20,20);
            add(l);
        }
    }
}

class Panel3 extends JPanel{
    Panel3(){
        setBackground(Color.LIGHT_GRAY);
        // setLayout(new FlowLayout());
        add(new JButton("별 개수 수정"));
        add(new JTextField("",20));
    }
}

public class MultiPanelFrame extends JFrame{
    public MultiPanelFrame(){
        setTitle("3개의 패널을 가진 JFrame");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        add(new Panel1(),BorderLayout.NORTH);
        add(new Panel2(),BorderLayout.CENTER);
        add(new Panel3(),BorderLayout.SOUTH);

        setSize(600,500);
        setVisible(true);
    }

    public static void main(String[] args) {
        new MultiPanelFrame();
    }
}
