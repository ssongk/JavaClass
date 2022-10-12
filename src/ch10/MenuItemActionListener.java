package ch10;

import java.awt.*;
import java.awt.event.*;
import java.io.FileWriter;
import java.io.IOException;
import java.util.StringTokenizer;

import javax.swing.*;

public class MenuItemActionListener extends JFrame{
    private JTextArea ta = new JTextArea();
    public MenuItemActionListener(){
        setTitle("파일 저장");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        createMenu();
        Container c = getContentPane();
        c.add(new JScrollPane(ta));
        setSize(300,300);
        setVisible(true);
    }

    private void createMenu(){
        JMenuBar mb = new JMenuBar();
        JMenu fileMenu = new JMenu("파일");
        JMenuItem save = new JMenuItem("저장");

        save.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                if(ta.getText().length()==0){
                    JOptionPane.showMessageDialog(MenuItemActionListener.this, "입력된 내용이 없습니다.", "Warning",JOptionPane.WARNING_MESSAGE);
                    return;
                }
                String fileName = JOptionPane.showInputDialog(MenuItemActionListener.this,"저장할 파일명을 입력하세요");
                if(fileName==null || fileName.equals("")){
                    JOptionPane.showMessageDialog(MenuItemActionListener.this, "파일을 저장하지 않습니다.", "Warning", JOptionPane.WARNING_MESSAGE);
                    return;
                }

                try{
                    FileWriter fout = new FileWriter("src/ch10/"+fileName+".txt");
                    String t = ta.getText();
                    StringTokenizer st = new StringTokenizer(t,"\n");

                    while(st.hasMoreTokens()){
                        fout.write(st.nextToken());
                        fout.write("\r\n");
                    }
                    fout.close();
                }
                catch(IOException e1){}
            }
        });

        fileMenu.add(save);
        mb.add(fileMenu);
        setJMenuBar(mb);
    }

    public static void main(String[] args) {
        new MenuItemActionListener();
    }
}
