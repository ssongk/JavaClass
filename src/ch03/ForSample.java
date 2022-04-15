package ch03;
public class ForSample{ // p.93 예제 3-1
    public static void main(String[] args) {
        int sum = 0;
        for(int i=1; i<=10; i++){
            sum = sum + i;
            System.out.print(i);
            if(i==10) break;
            System.out.print(" + ");
            
        }
        System.out.print(" = "+sum);
    }
}