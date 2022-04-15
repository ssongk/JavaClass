package ch04;
import java.util.Scanner;
// p.185 문제 4번
public class PhoneManager {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("인원수>>");
        int count = s.nextInt();
        Phone[] p = new Phone[count];
        for(int i=0; i<p.length; i++){
            System.out.print("이름과 전화번호(번호는 연속적으로 입력)>>");
            String name = s.next();
            String tel = s.next();
            p[i] = new Phone(name,tel);
        }
        System.out.print("저장되었습니다...");
        while(true){
            System.out.print("검색할 이름>>");
            String who = s.next();
            if(who.equals("exit")){
                System.out.print("프로그램을 종료합니다...");
                break;
            }
            int i;
            for(i=0; i<p.length; i++){
                System.out.println(p[i].getName()+"의 번호는"+p[i].getTel()+"입니다.");
            }
            if(i==p.length){
                System.out.println(p[i].getName()+"이 없습니다.");
            }
        }
        s.close();
    }
}
