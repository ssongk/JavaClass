package ch04;

import java.util.Scanner;
//p.143 예제 4-2
class Rectangle{
    int width;
    int height;

    public Rectangle(){

    }
    public Rectangle(int a, int b){
        width = a;
        height = b;
    }

    public int getArea(){
            return width*height;
    }
}

public class RectApp {
    public static void main(String[] args) {
        Rectangle rect = new Rectangle();
        Scanner scanner = new Scanner(System.in);
        System.out.print(">> ");
        rect.width = scanner.nextInt();
        rect.height = scanner.nextInt();
        System.out.println("사각형의 면적은 "+rect.getArea());
        
        Rectangle rectM = new Rectangle(7,8);
        System.out.println("사각형의 면적은 "+rectM.getArea());
        
        scanner.close();
    }
}
