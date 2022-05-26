package ch06.exercise;

import java.util.Scanner;

public class StringRotate {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("문자열을 입력하세요");
        String text = s.nextLine();
        for(int i=0;i<text.length();i++){
            String first = text.substring(0, 1);
            String last = text.substring(1);
            text = last + first;
            System.out.println(text);
        }
        s.close();
    }
    
}
