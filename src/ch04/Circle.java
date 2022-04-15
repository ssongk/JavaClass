package ch04;
// p.140 예제 4-1, p.145 예제 4-3
public class Circle {
    int radius;
    String name;

    public Circle(){
        radius = 1; name = "";
    }
    public Circle(int r){
        radius = r;
    }
    public Circle(int r, String n){
        radius = r; name = n;
    }
    
    public double getArea(){
        return 3.14*radius*radius;
    }
    public static void main(String[] args) {
        Circle pizza;
        pizza = new Circle();
        pizza.radius = 10;
        pizza.name = "자바피자";
        double area = pizza.getArea();
        System.out.println(pizza.name+"의 면적은 "+area);

        Circle donut = new Circle();
        donut.radius = 2;
        donut.name = "자바도넛";
        area = donut.getArea();
        System.out.println(donut.name+"의 면적은 "+area);

        Circle cycle = new Circle(10,"자전거 바퀴");
        area = cycle.getArea();
        System.out.println(cycle.name+"의 면적은 "+area);

        Circle bread = new Circle(7);
        bread.name = "빵";
        area = bread.getArea();
        System.out.println(bread.name+"의 면적은 "+area);
    }
}
