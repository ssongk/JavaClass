package ch06.exercise;

import java.util.Scanner;

public class AlphabetHistogram {
    private int histoData[] = new int[26];
    public AlphabetHistogram(){
        for(int i=0;i<histoData.length;i++)
            histoData[i]=0;
    }
    private String readString(){
        StringBuffer sb = new StringBuffer();
        Scanner scanner = new Scanner(System.in);
        while(true){
            String line = scanner.nextLine();
            if(line.equals(";"))
                break;
            sb.append(line);
        }
        scanner.close();
        return sb.toString();
    }
    private void makeHistogram(String s){
        s=s.toUpperCase();
        for(int i=0;i<s.length();i++){  
            char c = s.charAt(i);
            if(c>='A'&&c<='Z'){
                int index = c-'A';
                histoData[index]++;
            }
        }
    }
    private void drawHistogram(){
        System.out.println("\n히스토그램을 그립니다.");
        for(int i=0;i<histoData.length;i++){
            System.out.print((char)('A'+i));
            System.out.print(("("+histoData[i]+")\t"));
            for(int j=0;j<histoData[i];j++){
                System.out.print('-');
            }
            System.out.println();
        }
        
    }
    public void run(){
        String s = readString();
        makeHistogram(s);
        drawHistogram();
    }
    public static void main(String[] args) {
        AlphabetHistogram app = new AlphabetHistogram();
        app.run();
    }
}
