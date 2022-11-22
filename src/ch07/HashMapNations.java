package ch07;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Scanner;
import java.util.Set;

public class HashMapNations {
    public static void main(String[] args) {
        HashMap<String,Integer> nations = new HashMap<>();
        Scanner scanner = new Scanner(System.in);

        System.out.println("나라 이름과 인구를 5개 입력하세요. (예: Korea 5000)");
        for(int i=0; i<5; i++){
            System.out.print("나라 이름, 인구 >> ");
            String name = scanner.next();
            int population = scanner.nextInt();
            nations.put(name, population);
        }

        Set<String> keys = nations.keySet();
        Iterator<String> it = keys.iterator();
        String maxNation = "";
        int maxPopul = 0;
        
        while(it.hasNext()){
            String name = it.next();
            int popul = nations.get(name);
            if(maxPopul < popul){
                maxNation = name;
                maxPopul = popul;
            }   
        }
        System.out.println("제일 인구가 많은 나라는 ("+maxNation+", "+nations.get(maxNation)+")");
        scanner.close();
    }
}
