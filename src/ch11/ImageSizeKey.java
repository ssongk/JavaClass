package ch11;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class ImageSizeKey extends JFrame{
    public ImageSizeKey(){
        setTitle("그래픽 이미지 10% 확대 축소");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setContentPane(new myImagePanel());
        setSize(300,300);
        setVisible(true);
        getContentPane().setFocusable(true);
        getContentPane().requestFocus();
    }

    public static void main(String[] args) {
        new ImageSizeKey();
    }

    class myImagePanel extends JPanel{
        private ImageIcon icon = new ImageIcon("src/ch11/img.jpg");
        private Image image = icon.getImage();
        private double width;
        private double height;

        public myImagePanel(){
            width = image.getWidth(this);
            height = image.getHeight(this);

            addKeyListener(new KeyAdapter(){
                public void keyPressed(KeyEvent e){
                    if(e.getKeyChar()=='+'){
                        width *= 1.1;
                        height *= 1.1;
                        repaint();
                    }
                    else if(e.getKeyChar()=='-'){
                        if(width*0.9<20 || height*0.9<20)
                            return;
                        width *= 0.9;
                        height *= 0.9;
                        repaint();
                    }
                }
            });
        }
        
        public void paintComponent(Graphics g){
            super.paintComponent(g);
            g.drawImage(image, 10, 10, (int)width, (int)height, this);
        }
    }
}
