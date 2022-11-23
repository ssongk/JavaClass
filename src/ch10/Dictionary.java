package ch10;

import java.awt.*;
import java.awt.event.*;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;

import javax.swing.*;

public class Dictionary extends JFrame{
    JTextField engField = new JTextField(10);
    JTextField korField = new JTextField(10);
    JButton save = new JButton("저장");
    JButton search = new JButton("찾기");
    JButton delete = new JButton("삭제");
    JButton showAll = new JButton("모두 보기");
    JLabel countLabel = new JLabel("0");
    TextArea dic = new TextArea(10,35);

    HashMap<String,String> dicMap = new HashMap<>();

    public Dictionary(){
        setTitle("단어 사전 만들기");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        Container c = getContentPane();
        c.setLayout(new FlowLayout());

        save.setBackground(Color.YELLOW);
        save.setBorderPainted(false);
        save.setOpaque(true);
        search.setBackground(Color.GREEN);
        search.setBorderPainted(false);
        search.setOpaque(true);
        delete.setBackground(Color.MAGENTA);
        delete.setBorderPainted(false);
        delete.setOpaque(true);
        showAll.setBackground(Color.CYAN);
        showAll.setBorderPainted(false);
        showAll.setOpaque(true);

        c.add(new JLabel("영어"));
        c.add(engField);
        c.add(new JLabel("한글"));
        c.add(korField);
        c.add(save);
        c.add(search);
        c.add(delete);
        c.add(showAll);
        c.add(countLabel);
        c.add(new JScrollPane(dic));

        MyActionListener my = new MyActionListener();
        save.addActionListener(my);
        search.addActionListener(my);
        delete.addActionListener(my);
        showAll.addActionListener(my);

        setSize(400,400);
        setVisible(true);
    }

    class MyActionListener implements ActionListener{
        public void actionPerformed(ActionEvent e){
            Object obj = e.getSource();
            if(obj==save){
                String eng = engField.getText();
                String kor = korField.getText();

                if(eng.length()==0 || kor.length()==0){
                    dic.append("단어 미 입력 {"+eng+","+kor+"}\n");
                    return;
                }

                if(dicMap.get(eng) == null){
                    dic.append("삽입 {"+eng+","+kor+"}\n");
                    dicMap.put(eng, kor);

                    int count = Integer.parseInt(countLabel.getText());
                    count++;
                    countLabel.setText(Integer.toString(count));
                }
                else{
                    dic.append("변경 {"+eng+","+kor+"}\n");
                    dicMap.put(eng, kor);
                }
            }


            else if(obj==search){
                String kor = dicMap.get(engField.getText());
                if(kor == null)
                    kor = "단어 없음";
                korField.setText(kor);
            }


            else if(obj==delete){
                String engKey = engField.getText();
                if(engKey.length()==0){
                    dic.append("단어 미 입력 {"+engKey+"}\n");
                    return;
                }

                String res = dicMap.remove(engKey);
                if(res == null){
                    dic.append("단어 미 처리 {"+engKey+"}\n");
                }
                else{
                    int count = Integer.parseInt(countLabel.getText());
                    count--;
                    countLabel.setText(Integer.toString(count));
                    dic.append("삭제 {"+engKey+","+res+"}\n");
                }
            }


            else if(obj==showAll){
                Set<String> s = dicMap.keySet();
                Iterator<String> it = s.iterator();
                dic.setText("");
                while(it.hasNext()){
                    String engKey = it.next();
                    dic.append("단어 {"+engKey+","+dicMap.get(engKey)+"}\n");
                }
            }
        }
    }

    public static void main(String[] args) {
        new Dictionary();
    }
}
