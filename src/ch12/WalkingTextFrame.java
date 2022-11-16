package ch12;

import java.awt.*;
import javax.swing.*;

public class WalkingTextFrame extends JFrame{
    public WalkingTextFrame(){
        super("걸어서 나타나는 텍스트를 가진 레이블");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        Container c = getContentPane();
        c.setLayout(new FlowLayout());
        c.add(new WalkingLabel("나는 당신을 사랑합니다."));
        setSize(250,150);
        setVisible(true);
    }

    class WalkingLabel extends JLabel implements Runnable{
        private String text;
        private int count = 1;

        public WalkingLabel(String text){
            this.text = text;
            new Thread(this).start();
        }

        @Override
        public void run() {
            while(true){
                try{
                    Thread.sleep(500);
                } catch(InterruptedException e) { return; }
                String s = text.substring(0,count);
                setText(s);

                count %= text.length();
                count++;
            }
        }
    }

    public static void main(String[] args) {
        new WalkingTextFrame();
    }
}
