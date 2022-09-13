package ch08;

import java.awt.*;
import javax.swing.JButton;
import javax.swing.JFrame;

public class ContentPanEx extends JFrame{
    public ContentPanEx(){
        setTitle("ContentPane과 JFrame 예제");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        Container contentPane = getContentPane();
        contentPane.setBackground(Color.ORANGE);
        contentPane.setLayout(new FlowLayout());

        contentPane.add(new JButton("OK"));
        contentPane.add(new JButton("Cancel"));
        contentPane.add(new JButton("Ignore"));

        setSize(300,150);
        setVisible(true);
    }

    public static void main(String[] args) {
        new ContentPanEx();
    }
}
