package ch06.example;

public class StringEx {
    public static void main(String[] args) {
        String a = new String(" C Study ");
        String b = new String("& Java Study ");

        System.out.println(a+"의 길이는 "+a.length());
        System.out.println(b+"의 길이는 "+b.length());
        System.out.println(a.contains("C"));
        System.out.println(a.contains("c"));
        System.out.println(b.contains("&"));

        a=a.concat(b);
        System.out.println(a);

        a=a.trim();
        System.out.println(a);        

        a=a.replace("C", "Coding");
        System.out.println(a);

        String s[] = a.split("&");
        for(int i=0;i<s.length;i++)
            System.out.println("분리된 문자열"+i+": "+s[i]);
        
        a=a.substring(7);
        System.out.println(a);
        System.out.println(a.toUpperCase());

        char c = a.charAt(2);
        System.out.println(c);
    }
}
