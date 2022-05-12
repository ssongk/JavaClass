package ch05.open;

import java.util.Scanner;

public class Bear extends GameObject{
    private Scanner scanner = null;
    public Bear(int x, int y, int distance){
        super(x,y,distance);
        scanner = new Scanner(System.in);
    }
    public void move(){
        System.out.print("왼쪽(a), 아래(s), 위(d), 오른쪽(f) >> ");
        char c;
        c=scanner.next().charAt(0);
        switch(c){
            case 'a':
                x--;
                if(x<0) x=0;
                break;
            case 'f':
                x++;
                if(x>=Game.MAX_X) x=Game.MAX_X-1;
                break;
            case 'd':
                y--;
                if(x<0) x=0;
                break;
            case 's':
                y++;
                if(x>=Game.MAX_Y) x=Game.MAX_Y-1;
                break;
        }
    }
    public char getShape(){
        return 'B';
    }
}
