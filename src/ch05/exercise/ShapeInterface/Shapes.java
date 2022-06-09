package ch05.exercise.ShapeInterface;

class Circle implements Shape{
    int radius;
    Circle(int radius){
        this.radius=radius;
    }
    public void draw(){
        System.out.println("반지름이 "+radius+"인 원입니다.");
    }
    public double getArea(){
        return radius*radius*PI;
    }
}

class Oval implements Shape{
    int x,y;
    Oval(int x,int y){
        this.x=x;
        this.y=y;
    }
    public void draw(){
        System.out.println(x+"x"+y+"사각형에 내접하는 타원입니다.");
    }
    public double getArea(){
        return x*y*PI;
    }
}

class Rect implements Shape{
    int x,y;
    Rect(int x,int y){
        this.x=x;
        this.y=y;
    }
    public void draw(){
        System.out.println(x+"x"+y+"크기의 사각형 입니다.");
    }
    public double getArea(){
        return x*y;
    }
}

public class Shapes {
    public static void main(String[] args) {
        Shape list[] = new Shape[3];
        list[0] = new Circle(10);
        list[1] = new Oval(20,30);
        list[2] = new Rect(10,40);
        for(int i=0;i<list.length;i++) list[i].redraw();
        for(int i=0;i<list.length;i++) System.out.println("면적은 "+list[i].getArea());
    }
}
