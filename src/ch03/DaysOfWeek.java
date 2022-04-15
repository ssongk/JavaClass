package ch03;
import java.util.InputMismatchException;
import java.util.Scanner;
// p.126 문제4
public class DaysOfWeek {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        String week[] = {"일","월","화","수","목","금","토"};
        int num = 0, size = week.length;
        while(true){
            System.out.print("정수를 입력하세요>>");
            try{
                num = s.nextInt();
            }
            catch(InputMismatchException e){
                System.out.println("경고! 수를 입력하지 않았습니다.");
                s.next();
                continue;
            }
            if(num == -1){
                System.out.println("프로그램을 종료합니다...");
                break;
            }
            else
                System.out.println(week[num%size]);
        }
        s.close();
    }
}
