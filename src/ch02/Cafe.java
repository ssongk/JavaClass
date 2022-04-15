package ch02;
import java.util.Scanner;
//p.88 문제8 
public class Cafe {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("커피 주문하세요>>");
        String coffee = scanner.next();
        int count = scanner.nextInt();

        // if (coffee.equals("에스프레소"))
        //     System.out.print(2000*count+"원입니다.");
        // else if(coffee.equals("아메리카노"))
        //     System.out.print(2500*count+"원입니다.");
        // else if(coffee.equals("카푸치노"))
        //     System.out.print(3000*count+"원입니다.");
        // else if(coffee.equals("카페라떼"))
        //     System.out.print(3500*count+"원입니다.");
        // else
        //     System.out.print("다시 입력하세요.");

        switch(coffee){
            case "에스프레소" : 
                System.out.print(2000*count+"원입니다.");
                break;
            case "아메리카노" : 
                System.out.print(2500*count+"원입니다.");
                break;
            case "카푸치노" : 
                System.out.print(3000*count+"원입니다.");
                break;
            case "카페라떼" : 
                System.out.print(3500*count+"원입니다.");
                break;
            default : 
                System.out.print("다시 입력하세요.");
                break;
        }

        scanner.close();
    }
}
