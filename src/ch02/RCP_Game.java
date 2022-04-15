package ch02;
import java.util.Scanner;
// p.84
public class RCP_Game {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("가위 바위 보 게임입니다. 가위, 바위, 보 중에서 입력하세요");
        System.out.print("철수 >> ");
        String chel = s.next();
        System.out.print("영희 >> ");
        String young = s.next();

        if(chel.equals(young)){
            System.out.print("비겼습니다.");
        }

        else if(chel.equals("가위")){
                if(young.equals("보"))
                    System.out.print("철수가 이겼습니다.");
                else if(young.equals("바위"))
                    System.out.print("영희가 이겼습니다.");
        }

        else if(chel.equals("바위")){
                if(young.equals("가위"))
                    System.out.print("철수가 이겼습니다.");
                else if(young.equals("보"))
                    System.out.print("영희가 이겼습니다.");
        }

        else if(chel.equals("보")){
                if(young.equals("바위"))
                    System.out.print("철수가 이겼습니다.");
                else if(young.equals("가위"))
                    System.out.print("영희가 이겼습니다.");
        }

        s.close();
    }
}
