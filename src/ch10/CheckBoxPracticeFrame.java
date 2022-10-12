package ch10;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*; 

public class CheckBoxPracticeFrame extends JFrame{
    public CheckBoxPracticeFrame(){
        setTitle("CheckBox와 Item 이벤트 Frame");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        Container c = getContentPane();
        c.setLayout(new FlowLayout());
        JCheckBox cb1 = new JCheckBox("버튼 비활성화");
        JCheckBox cb2 = new JCheckBox("버튼 감추기");
        JButton btn = new JButton("test button");

        c.add(cb1);
        c.add(cb2);
        c.add(btn);

        cb1.addItemListener(new ItemListener(){
            public void itemStateChanged(ItemEvent e){
                // if(btn.isEnabled()==true)
                if(e.getStateChange() == ItemEvent.SELECTED)
                    btn.setEnabled(false);
                else    
                    btn.setEnabled(true);
            }
        });

        cb2.addItemListener(new ItemListener(){
            public void itemStateChanged(ItemEvent e){
                // if(btn.isVisible()==true)
                if(e.getStateChange() == ItemEvent.SELECTED)
                    btn.setVisible(false);
                else    
                    btn.setVisible(true);
            }
        });

        setSize(250,150);
        setVisible(true);
    }
    public static void main(String[] args) {
        new CheckBoxPracticeFrame();
    }
}
