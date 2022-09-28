package ch09;

import java.awt.*;
import java.awt.event.*;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class OpenChallenge9 extends JFrame{
    public OpenChallenge9(){
        setTitle("Open Challenge 9");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        setContentPane(new GamePanel());

        setSize(600,500);
        setVisible(true);

        getContentPane().setFocusable(true);
        getContentPane().requestFocus();
    }

    class GamePanel extends JPanel{
        private JLabel la[] = new JLabel[3];
        private JLabel result = new JLabel("시작합니다.");
    
        public GamePanel(){
            setLayout(null);
            for(int i=0;i<3;i++){
                la[i] = new JLabel("\t0");
                la[i].setSize(100,50);
                la[i].setLocation(120*(i+1),100);
                la[i].setFont(new Font("Tahoma",Font.ITALIC,30));
                la[i].setOpaque(true);
                la[i].setForeground(Color.YELLOW);
                la[i].setBackground(Color.MAGENTA);
                add(la[i]);
            }
            result.setSize(300,100);
            result.setLocation(200,300);
            result.setFont(new Font("Tahoma",Font.PLAIN,50));
            add(result);
    
            addKeyListener(new KeyAdapter(){
                public void keyPressed(KeyEvent e){
                    if(e.getKeyChar()=='\n'){
                        int x1 = (int)(Math.random()*5);
                        la[0].setText("\t"+Integer.toString(x1));
                        int x2 = (int)(Math.random()*5);
                        la[1].setText("\t"+Integer.toString(x2));
                        int x3 = (int)(Math.random()*5);
                        la[2].setText("\t"+Integer.toString(x3));

                        if(x1==x2 && x2==x3)
                            result.setText("축하합니다!");
                        else
                            result.setText("아쉽군요.");
                    }
                }
            });

            addMouseListener(new MouseAdapter(){
                public void mouseClicked(MouseEvent e){
                    Component c = (Component)e.getSource();
                    c.requestFocus();
                }
            });
        }
    }
    public static void main(String[] args) {
        new OpenChallenge9();
    }
}