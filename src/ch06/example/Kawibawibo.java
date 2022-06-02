package ch06.example;

import java.util.Scanner;

public class Kawibawibo {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        final String ss[] = {"가위","바위","보"};
        int userChoice,computerChoice;
        while(true){
            System.out.print("가위(1), 바위(2), 보(3), 끝내기(4)>>");
            userChoice=s.nextInt();
            computerChoice = (int)(Math.random()*3+1);
            if(userChoice==4)
                break;
            if(userChoice<1 || userChoice>3){
                System.out.println("잘 못 입력하셨습니다.");
                continue;
            }
            System.out.println("사용자 "+ss[userChoice-1]+userChoice+" : 컴퓨터 "+ss[computerChoice-1]+computerChoice);
            int diff = userChoice - computerChoice;
            switch(diff){
                case 0:
                    System.out.println("비겼습니다.");
                    break;
                case -1:
                case 2:
                    System.out.println("사용자가 졌습니다.");
                    break;
                case 1:
                case -2:
                    System.out.println("사용자가 이겼습니다.");
                    break;
            }
        }
        System.out.println("게임을 종료합니다...");
        s.close();
    }
}
