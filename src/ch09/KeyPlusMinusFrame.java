package ch09;

import javax.swing.JFrame;

public class KeyPlusMinusFrame extends JFrame{
    public KeyPlusMinusFrame(){
        setTitle("+,- 키로 폰트 크기 조절");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
    }

    public static void main(String[] args) {
        new KeyPlusMinusFrame();
    }
}
