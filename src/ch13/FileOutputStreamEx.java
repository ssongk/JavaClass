package ch13;

import java.io.*;;

public class FileOutputStreamEx {
    public static void main(String[] args) {
        byte[] b = {7,51,3,4,-1,24};
        try{
            FileOutputStream fout = new FileOutputStream("src/ch13/test.out");
            for(int i=0; i<b.length; i++)
                fout.write(b[i]);
            fout.close();
        }catch(IOException e){
            System.out.println("src/ch13/test.out을 저장하였습니다.");
        }
        
    }
}
