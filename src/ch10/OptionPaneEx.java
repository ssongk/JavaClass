package ch10;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class OptionPaneEx extends JFrame{
    public OptionPaneEx(){
        setTitle("옵션 팬 예제");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        Container c = getContentPane();
        c.add(new myPanel(),BorderLayout.NORTH);
        setSize(500,200);
        setVisible(true);
    }

    class myPanel extends JPanel{
        private JButton inputBtn = new JButton("Input Name");
        private JButton confirmBtn = new JButton("Confirm");
        private JButton messageBtn = new JButton("Message");
        private JTextField tf = new JTextField(10);

        public myPanel(){
            setBackground(Color.GRAY);
            add(inputBtn);
            add(confirmBtn);
            add(messageBtn);
            add(tf);

            inputBtn.addActionListener(new ActionListener(){
                public void actionPerformed(ActionEvent e){
                    String name =JOptionPane.showInputDialog("이름을 입력하세요");
                    if(name!=null)
                        tf.setText(name);
                    else
                        tf.setText("no!");
                }
            });

            confirmBtn.addActionListener(new ActionListener(){
                public void actionPerformed(ActionEvent e){
                    int result = JOptionPane.showConfirmDialog(null, "계속할 것입니까?", "Confirm", JOptionPane.YES_NO_OPTION);
                    if(result == JOptionPane.CLOSED_OPTION)
                        tf.setText("Just Closed without selection");
                    else if(result == JOptionPane.YES_OPTION)
                        tf.setText("Yes");
                    else
                        tf.setText("No");
                }
            });

            messageBtn.addActionListener(new ActionListener(){
                public void actionPerformed(ActionEvent e){
                    JOptionPane.showMessageDialog(null, "조심하세요", "Message", JOptionPane.ERROR_MESSAGE);
                }
            });
        }
    }

    public static void main(String[] args) {
        new OptionPaneEx();
    }
}
