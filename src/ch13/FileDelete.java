package ch13;

import java.io.*;

public class FileDelete {
    public static void main(String[] args) {
        File dir = new File("src/ch13");
        File[] files = dir.listFiles();

        for(int i=0; i<files.length; i++){
            String name = files[i].getName();
            int index = name.lastIndexOf('.');
            if(index ==- 1) continue;

            String ext = name.substring(index);
            if(ext.equals(".txt") || ext.equals(".jpg")){
                System.out.println(files[i].getPath()+" 삭제");
                files[i].delete();
            }
        }
    }
}
