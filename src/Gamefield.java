package src;

public class Gamefield{
    private Snake player;
    private Pellet[] food;
    public Gamefield(int x,int y){
        this.Snake = new Snake(x/2,y/2);
    
    }
}