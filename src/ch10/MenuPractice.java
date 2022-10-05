package ch10;

import javax.swing.*;

public class MenuPractice extends JFrame{
    public MenuPractice(){
        setTitle("메뉴 만들기");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        createMenu();
        setSize(250,200);
        setVisible(true);
    }

    public void createMenu(){
        JMenuBar mb = new JMenuBar();
        mb.add(new JMenu("파일"));
        mb.add(new JMenu("편집"));
        JMenu showItem = new JMenu("보기");
        showItem.add(new JMenuItem("화면확대"));
        showItem.addSeparator();
        showItem.add(new JMenuItem("쪽윤곽"));
        mb.add(showItem);
        mb.add(new JMenu("입력"));
        setJMenuBar(mb);
    }

    public static void main(String[] args) {
        new MenuPractice();
    }
}
