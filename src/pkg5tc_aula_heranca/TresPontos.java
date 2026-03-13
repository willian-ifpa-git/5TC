/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pkg5tc_aula_heranca;

/**
 *
 * @author willian
 */
public class TresPontos extends DoisPontos {
    private float coord_z;
    
    public TresPontos (float x, float y, float z){
        this.coord_z = z;
        super(x,y);
    }
    public float getCoord_z(){
        return coord_z;
    }
    
    public void setCoord_z(float coord_z){
        this.coord_z = coord_z;
    
    }
    

        public String toString(){
        return "3 Pontos Dimensionais \n" + 
                "Coordenada X : " + getCoord_x() +"\n" +
                "Coordenada Y:  " + getCoord_y() +"\n "+
                "Coordenada Z: "  + getCoord_z();
    
    } 
    
    
}
