package ch03;
import java.util.Scanner;
// p.127 문제 6번
public class EnglishToKorean {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in); 
        String eng[] = {"student","love","java","happy","future"};
        String kor[] = {"학생","사랑","자바","행복한","미래"};
        while(true){
            System.out.print("영어 단어를 입력하세요>>");
            String word = s.next();
            if(word.equals("exit")){
                System.out.println("종료합니다...");
                break;
            }
            int i;
            for(i=0; i<eng.length; i++){
                if(word.equals(eng[i])){
                    System.out.println(kor[i]);
                    break;
                }       
            }
            if(i==eng.length)
                System.out.println("그런 영어 단어가 없습니다.");
        }
        s.close();
    }
}
