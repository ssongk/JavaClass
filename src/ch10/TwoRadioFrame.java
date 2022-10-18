package ch10;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class TwoRadioFrame extends JFrame{
    private JRadioButton red = new JRadioButton("Red");
    private JRadioButton blue = new JRadioButton("Blue");
    public TwoRadioFrame(){
        setTitle("Two Radio Button");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        Container c = getContentPane();
        c.setLayout(new FlowLayout());
        ButtonGroup group = new ButtonGroup();
        group.add(red);
        group.add(blue);
        c.add(red);
        c.add(blue);
    
        MyItemListener listener = new MyItemListener();
        red.addActionListener(listener);
        blue.addActionListener(listener);

        setSize(300,200);
        setVisible(true);
    }
    class MyItemListener implements ActionListener{
        public void actionPerformed(ActionEvent e){
            String name = e.getActionCommand();
            if(name.equals("Red"))
                getContentPane().setBackground(Color.RED);
            else if(name.equals("Blue"))
                getContentPane().setBackground(Color.BLUE);
        }
    }

    public static void main(String[] args) {
        new TwoRadioFrame();
    }
}
