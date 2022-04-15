package ch03;
import java.util.Scanner;
// p.94 예제 3-2
public class WhileSample {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        double sum = 0;
        int num = 0, count = 0;
        System.out.println("정수를 입력하고 마지막에 0을 입력하세요.");
        while((num = s.nextInt()) != 0){
            sum += num;
            count ++; 
        }
        System.out.println("수의 개수는 "+count+"이며, 평균은 "+sum/count+"입니다.");
        s.close();
    }
}
