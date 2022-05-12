package ch05.open;

public class Game {
    public static final int MAX_X = 20;
    public static final int MAX_Y = 10;
    private char map[][] = new char[MAX_Y][MAX_X];
    private GameObject m[] = new GameObject[2];
    public Game(){
        for(int i=0;i<MAX_Y;i++)
            for(int j=0;j<MAX_X;j++)
                map[i][j] = '-';
        m[0] = new Bear(0, 0, 1);
        m[1] = new Fish(5, 5, 2);
    }
    public void run(){
        System.out.println("** Bear의 Fish 먹기 게임을 시작합니다. **");
        update();
        draw();
        while(!doseEnd()){
            clear();
            for(int i=0;i<m.length;i++)
                m[i].move();
            update();
            draw();
        }
        System.out.println("Bear Wins!!");
    }
    private void update(){
        for(int i=m.length-1;i>=0;i--)
            map[m[i].getY()][m[i].getX()] = m[i].getShape();
    }
    
    private void clear(){
        for(int i=0;i<m.length;i++)
            map[m[i].getY()][m[i].getX()] = '-';
    }

    private void draw(){
        System.out.println();
        for(int i=0;i<MAX_Y;i++){
            for(int j=0;j<MAX_X;j++)
                System.out.print(map[i][j]);
            System.out.println();
        }
    }
    private boolean doseEnd(){
        if(m[0].collide(m[1])){
            return true;
        }
        return false;
    }
    public static void main(String[] args) {
        Game game = new Game();
        game.run();
    }
}
