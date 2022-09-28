package ch10;

import java.awt.*;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;

public class ButtonImageEx extends JFrame{
    public ButtonImageEx(){
        setTitle("이미지 버튼 예제");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        Container c = getContentPane();
        c.setLayout(new FlowLayout());

        ImageIcon normalIcon = new ImageIcon("src/ch10/image/normalIcon.gif");
        ImageIcon rolloverIcon = new ImageIcon("src/ch10/image/rolloverIcon.gif");
        ImageIcon pressedIcon = new ImageIcon("src/ch10/image/pressedIcon.gif");

        JButton btn = new JButton("call~~",normalIcon);
        btn.setRolloverIcon(rolloverIcon);
        btn.setPressedIcon(pressedIcon);
        c.add(btn);

        setSize(250,150);
        setVisible(true);
    }

    public static void main(String[] args) {
        new ButtonImageEx();
    }
}
