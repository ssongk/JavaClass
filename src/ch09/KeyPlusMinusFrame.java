package ch09;

import java.awt.*;
import java.awt.event.*;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class KeyPlusMinusFrame extends JFrame{
    private JLabel la = new JLabel("Love Java");

    public KeyPlusMinusFrame(){
        setTitle("+,- 키로 폰트 크기 조절");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        Container c = getContentPane();
        c.addKeyListener(new MyKeyListener());
        c.setLayout(new FlowLayout());
        la.setFont(new Font("Arial",Font.PLAIN,10));
        c.add(la);
        c.setFocusable(true);
        c.requestFocus();

        setSize(250,150);
        setVisible(true);
    }

    class MyKeyListener extends KeyAdapter{
        public void keyPressed(KeyEvent e){
            if(e.getKeyChar()=='-'){
                int size = la.getFont().getSize();
                if(size<=5) return;
                la.setFont(new Font("Arial",Font.PLAIN,size-5));
            }
            else if(e.getKeyChar()=='+'){
                int size = la.getFont().getSize();
                la.setFont(new Font("Arial",Font.PLAIN,size+5));
            }
        }
    }

    public static void main(String[] args) {
        new KeyPlusMinusFrame();
    }
}
