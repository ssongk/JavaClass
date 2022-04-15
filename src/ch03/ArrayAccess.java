package ch03;
import java.util.Scanner;
// p.106 예제 3-7
public class ArrayAccess {
    public static void main(String[] args) {
        Scanner s = new Scanner(System. in);
        int intArray[] = new int[5];
        int max = 0;
        System.out.println("양수 5개를 입력하세요.");
        for(int i=0; i<5; i++){
            intArray[i] = s.nextInt();
            if(max<intArray[i])
                max = intArray[i];
        }
        System.out.println("가장 큰 양수는 "+max+"입니다.");
        // 예제 3-7 응용
        int min = max;
        for(int j=0; j<5; j++){
            if(min>intArray[j])
                min = intArray[j];
        }
        System.out.println("가장 작은 양수는 "+min+"입니다.");
        System.out.println("배열의 크기는 "+intArray.length+"입니다.");
        s.close();
    }
}
