import java.util.Scanner;

public class Song{
    private String title;
    private String artist;
    private int year;
    private String country;
    public Song(){}
    public Song(String title,String artist,int year,String country){
        this.title = title;
        this.artist = artist;
        this.year = year;
        this.country = country;
    }
    public void show(){
        System.out.println(this.year+"년 "+this.country+"국적의"+this.artist+"가 부른"+this.title);
    }
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("노래 제목 >> ");
        String title = s.next();
        
        System.out.print("가수 이름 >> ");
        String artist = s.next();

        System.out.print("발매 연도 >> ");
        int year = s.nextInt();

        System.out.print("국가 >> ");
        String country = s.next();

        Song song = new Song(title, artist, year, country);
        song.show();
        s.close();
    }
}