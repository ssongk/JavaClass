package ch02;
import java.util.Scanner;
// p.78 예제 2-12, p.88 문제7
public class Grading {
    public static void main(String[] args){
        char grade;
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("점수를 입력하세요(0~100):");
        int score = scanner.nextInt();
        if(score >= 90)
            grade = 'A';
        else if(score >= 80)
            grade = 'B';
        else if(score >= 70)
            grade = 'C';
        else if(score >= 60)
            grade = 'D';
        else 
            grade = 'F';

        System.out.println("힉잠은 "+grade+"입니다.");

        switch(grade){
            case 'A':
            case 'B':
                System.out.println("Excellent");
                break;
            case 'C':
            case 'D':
                System.out.println("Good");
                break;
            case 'F':
                System.out.println("Bye");
                break;
        }

        scanner.close();
    }
}
