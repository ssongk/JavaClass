package ch03;
import java.util.Scanner;
// p.108 예제 3-8
public class ArrayLength {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int intArray[] = new int[5];
        double sum = 0.0;
        System.out.println("5개의 정수를 입력하세요.");
        for(int i=0; i<intArray.length; i++){
            intArray[i] = s.nextInt();
            sum += intArray[i];
        }
        System.out.println("평균은 "+sum/intArray.length);
        // 예제 3-8 응용
        System.out.println("정수의 갯수를 입력하세요.");
        int n = s.nextInt();
        int intArray2[] = new int[n];
        System.out.println(n+"개의 정수를 입력하세요.");
        double sum2 = 0.0;
        for(int k=0; k<intArray2.length; k++){
            intArray2[k] = s.nextInt();
            sum2 += intArray2[k];
        }
        System.out.println("합계는 "+sum2+" 입니다.");
        System.out.println("평균은 "+sum2/intArray2.length+" 입니다.");
        s.close();
    }
}
