package ch03;
public class NestedLoop { // p.97 예제 3-4
    public static void main(String[] args) {
        for(int i=1; i<10; i++){
            for(int j=1; j<10; j++){
                System.out.print(i + "*" + j + "=" + i*j);
                System.out.print("\t");
            }
            System.out.println();
        }
        System.out.println();
        // 예제 3-4 응용
        
        for(int k=2; k<10; k++){
            System.out.print("#제"+k+"단#\t");
        }
        System.out.println();
        System.out.println();
        for(int i=1; i<10; i++){
            for(int j=2; j<10; j++){
                System.out.print(j + "*" + i + "=" + j*i);
                System.out.print("\t");
            }
            System.out.println();
        }
    }
}
