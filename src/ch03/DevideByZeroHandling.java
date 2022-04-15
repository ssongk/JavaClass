package ch03;
import java.util.Scanner;
// p.118 예제 3-13
public class DevideByZeroHandling {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int dividend;
        int divisor;

        System.out.print("나뉨수를 입력하시오.");
        dividend = s.nextInt();
        System.out.print("나눗수를 입력하시오.");
        divisor = s.nextInt();
        try{
            System.out.println(dividend+"를"+divisor+"로 나누면 몫은 "+dividend/divisor+"입니다.");
        }
        catch(ArithmeticException e){
            System.out.println("0으로 나눌 수 없습니다!");
        }
        finally{
            s.close();
        }
    }
}
