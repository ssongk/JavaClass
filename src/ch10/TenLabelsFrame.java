package ch10;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class TenLabelsFrame extends JFrame {
    private JLabel[] gameJLabels = new JLabel[10];
    private int nextPressed = 0;
    public TenLabelsFrame(){
        setTitle("Ten 레이블 클릭");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(null);
        Container c = getContentPane();

        for(int i=0;i<gameJLabels.length;i++){
            gameJLabels[i] = new JLabel(Integer.toString(i));
            gameJLabels[i].setForeground(Color.MAGENTA);
            c.add(gameJLabels[i]);

            gameJLabels[i].addMouseListener(new MouseAdapter(){
                public void mousePressed(MouseEvent e){
                    JLabel l = (JLabel)e.getSource();
                    if(Integer.parseInt(l.getText())==nextPressed){
                        nextPressed++;
                        if(nextPressed==10){
                            nextPressed=0;
                            configure();
                        }
                        else
                            l.setVisible(false);
                    }
                }
            });
        }
        setSize(300,300);
        setVisible(true);
        configure();
    }
    void configure(){
        Container c = getContentPane();
        for(int i=0;i<gameJLabels.length;i++){
            int xBound = c.getWidth() - gameJLabels[i].getWidth();
            int yBound = c.getHeight() - gameJLabels[i].getHeight();
            int x = (int)(Math.random()*xBound);
            int y = (int)(Math.random()*yBound);
            gameJLabels[i].setLocation(x,y);
            gameJLabels[i].setSize(20,20);
            gameJLabels[i].setVisible(true);
        }
    }

    public static void main(String[] args) {
        new TenLabelsFrame();
    }
}
