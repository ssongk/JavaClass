package ch04;
import java.util.Scanner;
// p.185 문제 4번
public class PhoneManager {
    private Scanner s;
    Phone p[];
    
    PhoneManager(){
        s = new Scanner(System.in);
    }

    void input(){
        System.out.print("인원수>>");
        int count = s.nextInt();
        p = new Phone[count];
        for(int i=0; i<count; i++){
            System.out.print("이름과 전화번호(번호는 연속적으로 입력)>>");
            String name = s.next();
            String tel = s.next();
            p[i] = new Phone(name,tel);
        }
        System.out.println("저장되었습니다...");
    }

    void run(){
        input();
        while(true){
            System.out.print("검색할 이름>>");
            String who = s.next();
            if(who.equals("exit")){
                System.out.print("프로그램을 종료합니다...");
                break;
            }
            int i;
            for(i=0; i<p.length; i++){
                if(who.equals(p[i].getName())){
                    System.out.println(p[i].getName()+"의 번호는"+p[i].getTel()+"입니다.");
                    break;
                }
            }
            if(i==p.length){
                System.out.println(who+"이 없습니다.");
            }
        }
        s.close();
    }

    public static void main(String[] args) {
        PhoneManager pm = new PhoneManager();
        pm.run();
    }
}
