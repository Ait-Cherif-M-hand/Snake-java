package src;

public class Pellet{

        this.coord_X = coord_X;
        this.coord_Y = coord_Y;
    public Pellet(int coord_X,int coord_Y){
        this.coord_X=coord_X;
        this.coord_Y=coord_Y; 
    }
    @Getter
    public int getCoordX(){
        return this.coord_X;
    }
    @Getter
    public int getCoordY(){
        return this.coord_Y;
    }
}