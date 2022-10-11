package ch10;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class TwoRadioFrame extends JFrame{
    private JRadioButton[] rb = new JRadioButton[2];
    private String[] str = {"Red","Blue"};
    public TwoRadioFrame(){
        setTitle("Two Radio Button");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        Container c = getContentPane();
        c.setLayout(new FlowLayout());
        ButtonGroup group = new ButtonGroup();
        for(int i=0;i<rb.length;i++){
            rb[i] = new JRadioButton(str[i]);
            rb[i].addActionListener(new ActionListener(){
                public void actionPerformed(ActionEvent e){
                    String name = e.getActionCommand();
                    if(name.equals("Red"))
                        c.setBackground(Color.RED);
                    else if(name.equals("Blue"))
                        c.setBackground(Color.BLUE);
                }
            });
            group.add(rb[i]);
            c.add(rb[i]);
        }

        setSize(300,200);
        setVisible(true);
    }

    public static void main(String[] args) {
        new TwoRadioFrame();
    }
}
