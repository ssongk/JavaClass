package ch06.exercise;

import java.util.Scanner;
import java.util.StringTokenizer;

public class Addition {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        String line = s.nextLine();
        StringTokenizer st = new StringTokenizer(line,"+");
        int sum = 0;
        while(st.hasMoreTokens()){
            sum += Integer.parseInt(st.nextToken().trim());
        }
        System.out.println("합은"+sum);
        s.close();
    }
}
