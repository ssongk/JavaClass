package ch10;

import java.awt.*;
import javax.swing.*;

public class ListEx extends JFrame{
    private String[] fruits = {"apple","banana","kiwi","mango","pear","peach","berry","strawberry","blackberry"};
    private ImageIcon[] iamges = {new ImageIcon("/Users/ssongk/Documents/GitHub/JavaClass/src/ch10/image/icon1.png"),
                                new ImageIcon("/Users/ssongk/Documents/GitHub/JavaClass/src/ch10/image/icon2.png"),
                                new ImageIcon("/Users/ssongk/Documents/GitHub/JavaClass/src/ch10/image/icon3.png"),
                                new ImageIcon("/Users/ssongk/Documents/GitHub/JavaClass/src/ch10/image/icon4.png")};

    public ListEx() {
        setTitle("리스트 만들기 예제");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        Container c = getContentPane();
        c.setLayout(new FlowLayout());
        
        JList<String> strList = new JList<>(fruits);
        c.add(strList);

        JList<ImageIcon> imgList = new JList<>(iamges);
        // imgList.setListData(iamges);
        c.add(imgList);

        JList<String> scroolList = new JList<>(fruits);
        c.add(new JScrollPane(scroolList));

        setSize(300,250);
        setVisible(true);
    }

    public static void main(String[] args) {
        new ListEx();
    }
}
