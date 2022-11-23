package ch07;

import java.util.Scanner;
import java.util.Vector;

public class TallManager {
    public static void main(String[] args) {
        Vector<Double> v = new Vector<>();
        Scanner scanner = new Scanner(System.in);

        System.out.print("2000~2009년까지 1년 단위로 키(cm)를 입력\n>> ");
        for(int i=0; i<10; i++)
            v.add(scanner.nextDouble());
        
        double maxSize = 0;
        int year = 0;
        for(int i=0; i<9; i++){
            double tmp = Math.abs(v.get(i)-v.get(i+1));
            if(tmp>maxSize){
                maxSize = tmp;
                year = 2000+i;
            }
        }
        System.out.println("가장 키가 많이 자란 년도는 "+year+"년 "+maxSize+"cm");
        scanner.close();
    }
}
