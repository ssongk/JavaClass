package ch07;

import java.util.Iterator;
import java.util.Vector;

public class VectorIteratorEx {
    public static void main(String[] args) {
        Vector<Integer> v = new Vector<>();
        v.add(5);
        v.add(4);
        v.add(-1);

        v.add(2,100);

        System.out.println("벡터 내의 요소 객체 수 : "+v.size());
        System.out.println("벡터의 현재 용량 : "+v.capacity());

        // for(int i=0; i<v.size(); i++){
        //     int n = v.get(i);
        //     System.out.println(n);
        // }

        Iterator<Integer> it = v.iterator();
        while(it.hasNext()){
            int n =it.next();
            System.out.println(n);
        }

        int sum = 0;

        // for(int i=0; i<v.size(); i++){
        //     int n = v.elementAt(i);
        //     sum += n;
        // }

        it = v.iterator();
        while(it.hasNext()){
            int n =it.next();
            sum += n;
        }

        System.out.println( "벡터에 있는 정수의 합 : "+sum);
    }
}
