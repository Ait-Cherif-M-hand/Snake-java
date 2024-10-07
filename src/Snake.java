package src;

public class Snake{
    private int coord_X;
    private int coord_Y;
    private int size;
    public static final int MAX_SIZE = 90;
    
    public Snake(int coord_X,int coord_Y){
        this.coord_X = coord_X;
        this.coord_Y = coord_Y;
        this.size = 4;
    }
    public void eatPellet(Pellet Pellet){
        if(this.Collision()){
            this.size += 1;
        }else{
            return;
        }
    }
}