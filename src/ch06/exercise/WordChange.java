package ch06.exercise;

import java.util.Scanner;

public class WordChange {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print(">> ");
        String statement = s.nextLine();
        StringBuffer st = new StringBuffer(statement);
        
        while(true){
            System.out.print("명령 : ");
            String commend = s.nextLine();
            if(commend.equals("exit")){
                System.out.println("종료합니다");
                break;
            }
            String token[] = commend.split("/");
            if(token.length!=2){
                System.out.println("잘못된 명령입니다!");
                continue;
            }
            
            int index = st.indexOf(token[0]);
            if(index == -1){
                System.out.println("찾을 수 없습니다!");
                continue;
            }

            st.replace(index, index+token[0].length(), token[1]);
            System.out.println(st);
        }
        s.close();
    }
}
