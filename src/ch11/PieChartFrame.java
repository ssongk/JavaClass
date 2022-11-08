package ch11;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
// OpenChallenge11
public class PieChartFrame extends JFrame{
    Container contentPane;
    int data[] = {0,0,0,0};
    int arcAngle[] = new int[4];
    Color c[] = {Color.RED,Color.BLUE,Color.MAGENTA,Color.ORANGE};
    String itemNmae[] = {"apple","cherry","strawberry","prune"};
    JTextField tf[] = new JTextField[4];
    ChartPanel chartpanel = new ChartPanel();

    public PieChartFrame(){
        setTitle("Open Challenge 11");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        contentPane = getContentPane();
        contentPane.add(new InputPanel(),BorderLayout.NORTH);
        contentPane.add(chartpanel,BorderLayout.CENTER);
        setSize(500,350);
        setVisible(true);
        drawChart();
    }

    void drawChart(){
        int sum=0;
        for(int i=0;i<data.length;i++){
            data[i] = Integer.parseInt(tf[i].getText());
            sum += data[i];
        }
        if(sum==0) return;
        for(int i=0;i<data.length;i++)
            arcAngle[i] = (int)Math.round((double)data[i]/(double)sum*360);
        chartpanel.repaint();
    }

    class InputPanel extends JPanel{
        InputPanel(){
            this.setBackground(Color.GRAY);
            for(int i=0;i<tf.length;i++){
                tf[i] = new JTextField("0",5);
                tf[i].addActionListener(new MyActionListener(){

                });
                add(new JLabel(itemNmae[i]));
                add(tf[i]);
            }
        }
        class MyActionListener implements ActionListener{
            public void actionPerformed(ActionEvent e){
                JTextField t = (JTextField)e.getSource();
                int n;
                try{
                    n = Integer.parseInt(t.getText());
                }
                catch(NumberFormatException ex){
                    t.setText("0");
                    return;
                }
                drawChart();
            }
        }
    }

    class ChartPanel extends JPanel{
        public void paintComponent(Graphics g){
            super.paintComponent(g);
            int startAngle = 0;
            for(int i=0;i<data.length;i++){
                g.setColor(c[i]);
                g.drawString(itemNmae[i]+" "+Math.round(arcAngle[i]*100./360.)+"%", 50+i*100, 20);
            }
            for(int i=0;i<data.length;i++){
                g.setColor(c[i]);
                g.fillArc(150, 50, 200, 200, startAngle, arcAngle[i]);
                startAngle += arcAngle[i];
            }
        }
    }

    public static void main(String[] args) {
        new PieChartFrame();
    }
}
