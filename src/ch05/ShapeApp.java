package ch05;

interface Shape {
    final double PI = 3.14;
    void draw();
    double getArea();
    default public void redraw(){
        System.out.println("--- 다시 그립니다. ---");
        draw();
    }
}

class Circle1 implements Shape{
    private int radius;
    public Circle1(int radius){
        this.radius=radius;
    }
    @Override
    public void draw() {
        System.out.print("반지름 "+radius);
    }
    @Override
    public double getArea() {
        return PI*radius*radius;
    }
}

public class ShapeApp {
    public static void main(String[] args) {
        Shape coin = new Circle1(10);
        coin.redraw();
        System.out.println(" 코인의 면적은 "+coin.getArea());
    }
}
