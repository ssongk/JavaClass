package ch03;
// p.126 문제2
import java.util.Scanner;

public class IntArray10{
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int intArray[] = new int[10];
        System.out.print("정수 10개 입력>>");
        for(int i=0; i<intArray.length; i++){
            intArray[i] = s.nextInt();
            if(intArray[i]%3 == 0)
                System.out.print(intArray[i]+" ");
        }
        s.close();
    }
}