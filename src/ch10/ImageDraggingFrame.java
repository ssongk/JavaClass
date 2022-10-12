package ch10;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*; 

public class ImageDraggingFrame extends JFrame{
    private JLabel label;
    public ImageDraggingFrame(){
        setTitle("이미지 드래깅");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        Container c = getContentPane();
        c.setLayout(null);

        ImageIcon icon = new ImageIcon("src/ch10/image/img.jpg");
        label = new JLabel(icon);
        label.setSize(icon.getIconWidth(),icon.getIconHeight());
        label.setLocation(100,100);
        myMouseListener listener = new myMouseListener();
        label.addMouseListener(listener);
        label.addMouseMotionListener(listener);
        c.add(label);

        setSize(300,300);
        setVisible(true);
    }

    class myMouseListener extends MouseAdapter{
        private int x = 0, y = 0;
        public void mouseClicked(MouseEvent e){
            x = e.getX();
            y = e.getY();
        }
        public void mouseDragged(MouseEvent e){
            // x = x + e.getX();
            // y = y + e.getY();
            // label.setLocation(x,y);

            System.out.println(e.getX()+","+e.getY());
            int distanceX = e.getX() - x;
            int distanceY = e.getY() - y;
            label.setLocation(label.getX()+distanceX,label.getY()+distanceY);
        }
    }

    public static void main(String[] args) {
        new ImageDraggingFrame();
    }
}
