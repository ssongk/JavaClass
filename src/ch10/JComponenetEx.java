package ch10;

import java.awt.*;
import java.awt.event.*;
import javax.swing.JButton;
import javax.swing.JFrame;

public class JComponenetEx extends JFrame {
    public JComponenetEx(){
        setTitle("JComponent의 공통 메소드 예제");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        Container c = getContentPane();
        c.setLayout(new FlowLayout());

        JButton b1 = new JButton("Magenta/Yellow Button");
        JButton b2 = new JButton("  Disabled Button  ");
        JButton b3 = new JButton("getX(), getY()");

        b1.setOpaque(true);
        b1.setBorderPainted(false);
        b1.setBackground(Color.YELLOW);
        b1.setForeground(Color.RED);
        b1.setFont(new Font("Arial",Font.ITALIC,20));
        b2.setEnabled(false);
        b3.addMouseListener(new MouseAdapter(){
            public void mouseClicked(MouseEvent e){
                JButton b = (JButton)e.getSource();
                setTitle(b.getX()+","+b.getY());
            }
        });
        c.add(b1);
        c.add(b2);
        c.add(b3);

        setSize(260,200);
        setVisible(true);
    }

    public static void main(String[] args) {
        new JComponenetEx();
    }
}
