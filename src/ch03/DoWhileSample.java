package ch03;
// p.95 예제 3-3
public class DoWhileSample {
    public static void main(String[] args) {
        char a='a';
        do {
            System.out.print(a);
            a=(char)(a+1);
        } while(a<='z');
        // 예제 3-3 응용
        System.out.println();
        a='a';

        while(a<123){
            System.out.print(a);
            a++;
        }

        System.out.println();

        for(int i='a'; i<='z'; i++){
            System.out.print((char)i);
        }        
    }
}
