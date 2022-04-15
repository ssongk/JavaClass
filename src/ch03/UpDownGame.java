package ch03;

import java.util.InputMismatchException;
import java.util.Random;
import java.util.Scanner;
//p.121 open challenge
public class UpDownGame {
    public static void main(String[] args) {
        Random r = new Random();
        Scanner s = new Scanner(System.in);
        
        int userNum=0, i=1;
        int num = r.nextInt(100);

        System.out.println("UP & Down 게임입니다. 숨겨진 수를 맞추어 보세요");
        System.out.println("(0~99)"+num);
        
        while(true){
            System.out.print(i+">>");
            try{
                userNum = s.nextInt();
            }
            catch(InputMismatchException e){
                System.out.println("정수를 입력하세요!");
                s.next();
                continue;
            }
            if(userNum<0 || userNum>99){
                System.out.println("범위가 잘못 입력되었습니다.");
                continue;
            }

            if(num < userNum)
                System.out.println("더 낮게");
            else if(num > userNum)
                System.out.println("더 높게");
            else if(num == userNum){
                System.out.println("맞았습니다.");
                System.out.print("다시 하시겠습니까?(y/n)>>");
                if((s.next()).equals("n")){
                    break;
                }
                else{
                    num = r.nextInt(100);
                    System.out.println("UP & Down 게임입니다. 숨겨진 수를 맞추어 보세요");
                    System.out.println("(0~99)"+num);
                    i = 0;
                } 
            }
            i++;
        }
        s.close();
    }
}
