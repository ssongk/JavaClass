package ch07;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Scanner;
import java.util.Set;

public class PointManager {
    static void printMap(HashMap<String,Integer> h){
        Set<String> s = h.keySet();
            Iterator<String> it = s.iterator();
            while(it.hasNext()){
                String nameIter = it.next();
                System.out.print("("+nameIter+","+h.get(nameIter)+")");
            }
            System.out.println();
    }

    public static void main(String[] args) {
        HashMap<String,Integer> h =new HashMap<>();
        Scanner scanner = new Scanner(System.in);

        System.out.println("** 포인트 관리 프로그램입니다 **");
        String name = "";
        int point = 0;
        while(true){
            System.out.print("이름과 포인트 입력>> ");
            name = scanner.next();
            if(name.equals("exit")) break;
            point = scanner.nextInt();

            Integer n = h.get(name);
            if(n != null)
                point += n;
            h.put(name,point);
            printMap(h);
        }
        System.out.println("프로그램을 종료합니다...");
        scanner.close();
    }
}
