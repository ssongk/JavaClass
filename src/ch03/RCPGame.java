package ch03;
// p.128 문제8
import java.util.Scanner;

public class RCPGame {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        String str[] = {"가위","바위","보"};
        while(true){
            System.out.println("컴퓨터와 가위 바위 보 게임을 합니다.");
            int n = (int)(Math.random()*3);
            String com = str[n];
            System.out.print("가위 바위 보!>> ");
            String user = s.next();
            if(user.equals("그만")){
                System.out.println("게임을 종료합니다...");
                break;
            }
            System.out.print("사용자 = "+user+" , 컴퓨터 = "+com+", ");

            if(user.equals("가위")){
                if(com.equals("가위"))
                    System.out.print("비겼습니다.\n");
                else if(com.equals("바위"))
                    System.out.print("컴퓨터가 이겼습니다.\n");
                else 
                    System.out.print("사용자가 이겼습니다.\n");
            }
            if(user.equals("바위")){
                if(com.equals("바위"))
                    System.out.print("비겼습니다.\n");
                else if(com.equals("보"))
                    System.out.print("컴퓨터가 이겼습니다.\n");
                else 
                    System.out.print("사용자가 이겼습니다.\n");
            }
            if(user.equals("보")){
                if(com.equals("보"))
                    System.out.print("비겼습니다.\n");
                else if(com.equals("가위"))
                    System.out.print("컴퓨터가 이겼습니다.\n");
                else 
                    System.out.print("사용자가 이겼습니다.\n");
            }
            
        }
        s.close();
    }
}
