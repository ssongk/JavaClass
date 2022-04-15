package ch04;
import java.util.Scanner;
// p.185 문제 3번
class Rect {
    private int width, height;
    public Rect(int width, int height){
        this.width = width;
        this.height = height;
    }
    public int getArea(){
        return width*height;
    }
}
public class RectArray {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        Rect[] r = new Rect[4];
        for(int i=0; i<r.length; i++){
            System.out.print((i+1)+"너비와 높이 >>");
            int width = s.nextInt();
            int height = s.nextInt();
            r[i] = new Rect(width,height);
        }
        System.out.println("저장하였습니다...");
        int sum=0;
        for(int i=0; i<r.length; i++){
            System.out.println((i+1)+"사각형 넓이 "+r[i].getArea());
            sum += r[i].getArea();
        }
        System.out.print("사각형의 전체 합은 "+sum);
        s.close();
    }
}
