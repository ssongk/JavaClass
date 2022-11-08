package ch11;

import java.awt.*;
import javax.swing.*;

public class GridFrame extends JFrame{
    public GridFrame(){
        setTitle("격자 그리기");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setContentPane(new MyGrid());
        setSize(300,300);
        setVisible(true);
    }

    class MyGrid extends JPanel{
        public void paintComponent(Graphics g){
            super.paintComponent(g);
            int dw = getWidth()/10;
            int dh = getHeight()/10;

            for(int i=1;i<10;i++){
                g.drawLine(dw*i, 0, dw*i, getHeight());
                g.drawLine(0, dh*i, getWidth(), dh*i);
            }
        }
    }

    public static void main(String[] args) {
        new GridFrame();
    }
}
