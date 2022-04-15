package ch03;
import java.util.Scanner;
// p.98 예제 3-5
public class ContinueExample {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("정수 5개를 입력하세요.");
        int sum = 0;
        for(int i=0; i<5; i++){
            int num = s.nextInt();
            if(num<0) continue;
            else sum+=num;
        }
        System.out.println("양수의 합은 "+sum);
        s.close();
    }
}
