package ch10;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class ComboActionEx extends JFrame{
    private String[] fruits = {"apple","banana","mango"};
    private ImageIcon[] images = {new ImageIcon("src/ch10/image/apple.jpg"),
                                new ImageIcon("src/ch10/image/banana.jpg"),
                                new ImageIcon("src/ch10/image/mango.jpg")};
    private JLabel imgLabel = new JLabel(images[0]);

    public ComboActionEx(){
        setTitle("콤보박스 활용 예제");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        Container c = getContentPane();
        c.setLayout(new FlowLayout());
        JComboBox<String> combo = new JComboBox<>(fruits);
        c.add(combo);
        c.add(imgLabel);

        combo.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                JComboBox<String> cb = (JComboBox<String>)e.getSource();
                int index = cb.getSelectedIndex();
                imgLabel.setIcon(images[index]);
            }
        });

        setSize(300,250);
        setVisible(true);
    }

    public static void main(String[] args) {
        new ComboActionEx();
    }
}
