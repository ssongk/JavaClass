package ch13;

import java.io.*;

public class MaxFIleSize {
    public static void main(String[] args) {
        File f = new File("/src");
        File[] files = f.listFiles();

        long big = 0;
        File file = null;

        for(int i=0; i<files.length; i++){
            File a = files[i];
            if(!a.isFile()) continue;
            long size = a.length();
            if(big < size){
                big = size;
                file = a;
            }
        }

        if(file == null) System.out.println("파일은 없습니다.");
        else System.out.println("가장 큰 파일은 "+file+" "+big+"바이트");
    }
}
