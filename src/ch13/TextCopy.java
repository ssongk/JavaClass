package ch13;

import java.io.*;

public class TextCopy {
    public static void main(String[] args) {
        // File src = new File("src/ch13/sample.txt"); // 문자 스트림
        // File dest = new File("src/ch13/sample2.txt");

        // File src = new File("src/ch13/img.jpg"); // 바이트 스트림
        // File dest = new File("src/ch13/back.jpg");

        File src = new File("src/ch13/img.jpg"); // 바이트 스트림 고속복사
        File dest = new File("src/ch13/back2.jpg");

        // int c;
        try {
            // FileReader fr = new FileReader(src); // 문자 스트림
            // FileWriter fw = new FileWriter(dest);

            FileInputStream fin = new FileInputStream(src);
            FileOutputStream fout = new FileOutputStream(dest);

            // while((c=fin.read()) != -1) // 바이트 스트림
            //     fout.write((char)c);
            
            byte[] buf = new byte[1024*10];
            while(true){ // 바이트 스트림 고속복사
                int n = fin.read(buf);
                fout.write(buf,0,n);
                if(n<buf.length) // 버퍼 크기보다 작게 읽음 -> 파일의 끝을 의미(복사 종료)
                    break;
            }

            fin.close();
            fout.close();
            System.out.println(src.getPath()+"를 "+dest.getPath()+"로 복사했습니다.");
        } catch (IOException e) {
            System.out.println("파일 복사 오류");
        }
    }
}
