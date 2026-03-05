package pkg5tc_aula_heranca;


public class DoisPontos {
    private float coord_x;
    private float coord_y;
    
    public DoisPontos(float coord_x,float coord_y){
       // this.coord_x = coord_x;
        setCoordX(coord_x);
        this.coord_y = coord_y;
    }
    
    public void setCoordX(float coord_x){
        this.coord_x = coord_x;
    }
    
    public void setCoordY(float coord_y){
        this.coord_y = coord_y;
    }
 
    public float getCoord_x() {
        return coord_x;
    }
    
    public float getCoord_y() {
        return coord_y;
    }
    public String toString(){
        return "2 Pontos Dimensionais \n" + 
                "Coordenada X : " + getCoord_x() +"\n"+
                "Coordenada Y:  " + getCoord_y();
    
    }
    
    
    
    
    
    
    
    
    
    
    
    
}
