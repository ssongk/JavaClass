package ch11;

import java.awt.*;
import javax.swing.*;

public class PaintPanelEx extends JFrame{
    public PaintPanelEx(){
        setTitle("JPanel의 paintComponent() 예제");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setContentPane(new Mypanel());
        setSize(300,300);
        setVisible(true);
    }

    class Mypanel extends JPanel{
        public void paintComponent(Graphics g){
            super.paintComponent(g);
            g.setColor(Color.RED);
            g.setFont(new Font("Arial",Font.ITALIC,25));
            g.drawString("Java Study", 30, 30);
            g.setColor(Color.BLUE);
            g.drawRect(10, 15, 170, 25);
            g.setColor(Color.GREEN);
            g.fillRoundRect(10, 50, 50, 50, 20, 20);
            g.setColor(Color.MAGENTA);
            g.fillArc(10, 110, 50, 50, 0, 270);
            g.setColor(Color.ORANGE);
            int []x = {30,10,30,60};
            int []y = {175,200,225,200};
            g.fillPolygon(x,y,4);
        }
    }

    public static void main(String[] args) {
        new PaintPanelEx();
    }
}
