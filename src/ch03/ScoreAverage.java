package ch03;
import java.util.Scanner;
// p.111 예제 3-10 응용
public class ScoreAverage {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        double score[][] = new double[3][2];
        double sum = 0;

        System.out.println("1학년1학기부터 3학년2학기까지 학점을 차례대로 입력하시오.");
        for(int year=0; year<score.length; year++){
            for(int turm=0; turm<score[year].length; turm++){
                score[year][turm] = s.nextDouble();
                sum += score[year][turm];  
            }
        }
        System.out.printf("3년 전체 평점 평균은 %.2f", sum/(score.length*score[0].length));
        s.close();
    }
}
