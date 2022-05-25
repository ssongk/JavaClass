package ch06.exercise;

import java.util.Scanner;
import java.util.StringTokenizer;

public class WordCount {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        while(true){
            String word = s.nextLine();
            if(word.equals("exit")){
                System.out.println("종료합니다...");
                break;
            }
            StringTokenizer st = new StringTokenizer(word," ");
            System.out.println("어절 개수는 "+st.countTokens());
        }
        s.close();
    }
}
