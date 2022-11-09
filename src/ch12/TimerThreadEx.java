package ch12;

import java.awt.*;
import javax.swing.*;

class TimerThread implements Runnable{
    private JLabel timerLabel;

    public TimerThread(JLabel timerLabel){
        this.timerLabel = timerLabel;
    }

    @Override
    public void run() {
        int n = 0;
        while(true){
            timerLabel.setText(Integer.toString(n));
            n++;
            try{
                Thread.sleep(1000);
            }
            catch(InterruptedException e){
                return;
            }
        }
    }
}

public class TimerThreadEx extends JFrame{
    public TimerThreadEx(){
        setTitle("Thread를 상속받은 타이머 스레드");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        Container c = getContentPane();
        c.setLayout(new FlowLayout());

        JLabel timerJLabel = new JLabel();
        timerJLabel.setFont(new Font("Gothic",Font.ITALIC,80));
        c.add(timerJLabel);

        setSize(250,150);
        setVisible(true);

        TimerThread th = new TimerThread(timerJLabel);
        Thread t = new Thread(th);
        t.start();
    }

    public static void main(String[] args) {
        new TimerThreadEx();
    }
}
