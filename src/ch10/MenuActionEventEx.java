package ch10;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class MenuActionEventEx extends JFrame{
    private JLabel imgLabel = new JLabel();
    public MenuActionEventEx(){
        setTitle("Menu에 Action 리스너 만들기 예제");
        getContentPane().add(imgLabel,BorderLayout.CENTER);
        createMenu();
        setSize(250,200);
        setVisible(true);
    }

    public void createMenu(){
        JMenuItem[] menuItem = new JMenuItem[4];
        String[] menuTitle = {"Load","Hide","ReShow","Exit"};
        
        myActionListener listener = new myActionListener();
        JMenuBar mb = new JMenuBar();
        JMenu screenMenu = new JMenu("Screen");
        for(int i=0;i<menuItem.length;i++){
            menuItem[i] = new JMenuItem(menuTitle[i]);
            menuItem[i].addActionListener(listener);
            screenMenu.add(menuItem[i]);
        }
        mb.add(screenMenu);
        setJMenuBar(mb);
    }

    class myActionListener implements ActionListener{
        public void actionPerformed(ActionEvent e){
            String cmd = e.getActionCommand();
            switch(cmd){
                case "Load":
                    if(imgLabel.getIcon() != null) return;
                    imgLabel.setIcon(new ImageIcon("src/ch10/image/img.jpg"));
                    break;
                case "Hide":
                    imgLabel.setVisible(false);
                    break;
                case "ReShow":
                    imgLabel.setVisible(true);
                    break;
                case "Exit":
                    System.exit(0);
                    break;
            }
        }
    }

    public static void main(String[] args) {
        new MenuActionEventEx();
    }
}
