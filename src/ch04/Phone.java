package ch04;
import java.util.Scanner;
// p.184 문제 2
public class Phone {
    private String name, tel;
    public Phone(String name, String tel){
        this.name = name;
        this.tel = tel;
    }
    public String getName(){
        return name;
    }
    public String getTel(){
        return tel;
    }

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        Phone[] p = new Phone[2];
        for(int i=0; i<p.length; i++){
            System.out.print("이름과 전화번호 입력 >>");
            String name = s.next();
            String tel = s.next();
            p[i] = new Phone(name,tel);
        }
        for(int i=0; i<p.length; i++){
            System.out.println(p[i].getName()+"의 번호 "+p[i].getTel());
        }
        s.close();
    }
}
