package ch05.exercise.StackInterface2;

import java.util.Scanner;

import ch05.exercise.StringStack;

public class StackApp{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("총 스택 저장 공간의 크기 입력 >> ");
        int n = scanner.nextInt();
        StringStack ss = new StringStack(n);

        while(true){
            System.out.print("문자열 입력 >> ");
            String str = scanner.next();
            if(str.equals("그만"))
                break;
            boolean res = ss.push(str);
            if(res==false){
                System.out.println("스택이 꽉 차서 푸시 불가!");
            }
        }

        System.out.print("스택에 저장된 모든 문자열 팝 : ");
        int len = ss.length();
        for(int i=0;i<len;i++)
            System.out.print(ss.pop()+" ");
        scanner.close();
    }
}
