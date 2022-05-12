package ch05.exercise;

import java.util.Scanner;

public class StackManager {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        String[] ob = new String[5];
        StringStack stack = new StringStack(5);
        System.out.print(">>");
        for(int i=0; i<5; i++){
            ob[i] = s.next();
            stack.push(ob[i]);
        }
        for(int i=0; i<5; i++){
        System.out.print(stack.pop()+"\t");
        }
    }   
}
