package ch01;
public class CircleArea { // print, printf, println의 차이
    public static void main(String[] args){
        final double PI = 3.14;
        double radius = 10.2;
        double circleArea = radius*radius*PI;
        int m = 015;
        int k = 0x15;
        float f1 = .1234f;
        double d = 1.23456789;
        char a = '한';
        String s = "Internet Security";

        System.out.println("반지름"+radius+", ");
        System.out.printf("원의 면적 = %.2f %n", circleArea);
        System.out.printf("m = %d %n", m);
        System.out.printf("k = %d %n", k);
        System.out.printf("8진수 m = %o %n", m);
        System.out.printf("16진수 k = %x %n", k);
        System.out.printf("float f1 = %f %n", f1);
        System.out.printf("double d = %.4f %n", d); // 소수점 밑 4번째 자리까지 읽어주세요
        System.out.printf("double d = %.10f %n", d); // 소수점 밑 10번째 자리까지 읽어주세요
        System.out.printf("한글의 %c %n", a);
        System.out.printf("[학과명 : %s] %n", s);
        System.out.printf("[학과명 : %20s] %n", s); // 20칸을 먼저 확보한 후 s를 넣어준다.(뒤에서부터 채워나감)
        System.out.printf("[학과명 : %.5s] %n", s); // 앞에서부터 5글자만 출력해주세요
    }
}
