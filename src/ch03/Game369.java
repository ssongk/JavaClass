package ch03;

public class Game369 {
    public static void main(String[] args) {
        for(int i = 1; i<100; i++){
            int a = i/10;
            int b = i%10;
            int count = 0;
            if((a != 0)&&(a%3 == 0))
                count++;
            if((b != 0)&&(b%3 == 0))
                count++;
            switch(count){
                case 1: System.out.println(i+" 박수한번"); break;
                case 2: System.out.println(i+" 박수두번"); break;
            }
        }
    }
}
