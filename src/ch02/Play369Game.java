package ch02;
import java.util.Scanner;
// p.89 문제9
public class Play369Game {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("1~99 사이의 정수를 입력하세요>> ");
        int userNum = scanner.nextInt();
        int first = userNum / 10;
        int second = userNum % 10;
        if (first == 3 | first == 6 | first == 9){
            if (second == 3 | second == 6 | second == 9)
                System.out.print("박수짝짝");
            else
                System.out.print("박수짝");
        }
        else 
            System.out.print("박수없음");
        scanner.close();
    }
}
