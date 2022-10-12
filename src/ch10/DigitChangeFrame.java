package ch10;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*; 

public class DigitChangeFrame extends JFrame{
    private JTextField src = new JTextField(8);
    private JTextField dest = new JTextField(8);
    private JRadioButton[] radio = new JRadioButton[4];
    private String[] text = {"decimal","binary","octal","hex"};

    public DigitChangeFrame(){
        setTitle("Digit Changer");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        Container c = getContentPane();
        c.setLayout(new FlowLayout());

        c.add(src);
        c.add(new JLabel(" -> "));
        c.add(dest);

        ButtonGroup grp = new ButtonGroup();
        myItemListener listener = new myItemListener();

        for(int i=0;i<radio.length;i++){
            radio[i] = new JRadioButton(text[i]);
            radio[i].addItemListener(listener);
            grp.add(radio[i]);
            c.add(radio[i]);
        }

        setSize(300,150);
        setVisible(true);
    }

    class myItemListener implements ItemListener{
        public void itemStateChanged(ItemEvent e){
        if(e.getStateChange() != ItemEvent.SELECTED)
            return;
            
        int n = 0;
        try{
            n = Integer.parseInt(src.getText());
        }
        catch(NumberFormatException exp){
            dest.setText("변환할 수 없습니다.");
            return;
        } 
        
        String str = ((JRadioButton)e.getItem()).getText();
        switch(str){
            case "decimal":
                dest.setText(Integer.toString(n));
                break;
            case "binary":
                dest.setText(Integer.toBinaryString(n));
                break;
            case "octal":
                dest.setText(Integer.toOctalString(n));
                break;
            case "hex":
                dest.setText(Integer.toHexString(n));
                break;
            }       
        }
    }

    public static void main(String[] args) {
        new DigitChangeFrame();
    }
}
