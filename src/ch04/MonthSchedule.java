package ch04;

import java.util.Scanner;

class Day{
    private String work;
    public void set(String work){
        this.work=work;
    }
    public String get(){
        return work;
    }
    public void show(){
        if(work==null)
            System.out.println("없습니다.");
        else
            System.out.println(work+"입니다.");
    }
}

public class MonthSchedule{
    private Scanner s;
    private Day d[];
    public MonthSchedule(int n){
        d = new Day[n];
        for(int k=0; k<n; k++){
            s = new Scanner(System.in);
            d[k] = new Day();
        }
    }
    void input(){
        System.out.print("날짜(1~30)? ");
        int day = s.nextInt();
        System.out.print("할 일(빈 칸 없이 입력)? ");
        String work = s.next();
        d[day-1].set(work);
        System.out.println();
    }
    void view(){
        System.out.print("날짜(1~30)? ");
        int day = s.nextInt();
        System.out.print(day+"일에 할 일은 ");
        d[day-1].show();
        System.out.println();
    }
    void run(){
        System.out.println("이번 달 스케줄 관리 프로그램.");
        while(true){
            System.out.print("할 일(입력:1, 보기:2, 끝내기:3)>> ");
            int i = s.nextInt();
            if(i==1)
                input();
            else if(i==2)
                view();
            else if(i==3){
                finish();
                break;
            }
            else
                System.out.println("잘 못 입력하였습니다."); System.out.println();
        }
        s.close();
    }
    void finish(){
        System.out.println("프로그램을 종료합니다.");
    }
    public static void main(String[] args) {
        MonthSchedule april = new MonthSchedule(30);
        april.run();
    }
}
