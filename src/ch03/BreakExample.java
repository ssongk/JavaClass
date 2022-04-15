package ch03;
import java.util.Scanner;

public class BreakExample {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("exit을 입력하면 종료합니다.");
        while(true){
            System.out.print(">>");
            String text = s.next();
            if(text.equals("exit"))
                break;
        }
        System.out.println("종료합니다...");
        s.close();
    }
}
