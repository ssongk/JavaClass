package ch02;
import java.util.Scanner;
// p.89 문제 10
public class CafeVer2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("커피 주문하세요>>");
        String coffee = scanner.next();
        int count = scanner.nextInt();
        
        if(coffee.equals("에스프레소")){
            if(count>=10){
                System.out.print(2000*count*95/100+"원입니다.");
            }
            else
                System.out.print(2000*count+"원입니다.");
        }

        if(coffee.equals("아메리카노")){
            if(count>=10){
                System.out.print(2500*count*95/100+"원입니다.");
            }
            else
                System.out.print(2500*count+"원입니다.");
        }

        if(coffee.equals("카푸치노")){
            if(count>=10){
                System.out.print(3000*count*95/100+"원입니다.");
            }
            else
                System.out.print(3000*count+"원입니다.");
        }

        if(coffee.equals("카페라떼")){
            if(count>=10){
                System.out.print(3500*count*95/100+"원입니다.");
            }
            else
                System.out.print(3500*count+"원입니다.");
        }
        scanner.close();
    }
}
