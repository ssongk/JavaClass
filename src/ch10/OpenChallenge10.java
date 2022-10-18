package ch10;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class OpenChallenge10 extends JFrame{
    private Container contentPane;
    private JLabel imageLabel;
    private ImageIcon[] images = new ImageIcon[4];
    private int currentId;
    public OpenChallenge10(){
        setTitle("Open Challenge 10");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        contentPane = getContentPane();
        contentPane.setLayout(new BorderLayout());
        for(int i=0;i<images.length;i++){
            images[i] = new ImageIcon("src/ch10/image/image"+i+".jpg");
        }

        currentId = 0;
        imageLabel = new JLabel(images[currentId]);
        contentPane.add(imageLabel,BorderLayout.CENTER);
        contentPane.add(new MenuPanel(),BorderLayout.SOUTH);

        setSize(300,400);
        setVisible(true);
    }

    class MenuPanel extends JPanel{
        JButton left = new JButton(new ImageIcon("src/ch10/image/left.png"));
        JButton right = new JButton(new ImageIcon("src/ch10/image/right.png"));

        public MenuPanel(){
            setLayout(new FlowLayout());
            setBackground(Color.DARK_GRAY);
            add(left);
            add(right);

            left.addActionListener(new ActionListener(){
                public void actionPerformed(ActionEvent e){
                    // if(currentId<=0){
                    //     currentId = 3;
                    //     imageLabel.setIcon(images[currentId]);
                    // }
                    // else{
                    //     currentId --;
                    //     imageLabel.setIcon(images[currentId]);
                    // }

                    currentId --;
                    currentId += images.length;
                    currentId %= images.length;
                    imageLabel.setIcon(images[currentId]);
                }
            });

            right.addActionListener(new ActionListener(){
                public void actionPerformed(ActionEvent e){
                    // if(currentId>=3){
                    //     currentId = 0;
                    //     imageLabel.setIcon(images[currentId]);
                    // }
                    // else{
                    //     currentId ++;
                    //     imageLabel.setIcon(images[currentId]);
                    // }

                    currentId ++;
                    currentId %= images.length;
                    imageLabel.setIcon(images[currentId]);
                }
            });        
        }
    }

    public static void main(String[] args) {
        new OpenChallenge10();
    }
}