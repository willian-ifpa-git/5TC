
package pkg5tc_aula_heranca;

public class Linha {
    
    private DoisPontos p1;
    private DoisPontos p2;
    
    public Linha(DoisPontos p1, DoisPontos p2){
        this.p1 = p1;
        this.p2 = p2;
    }
    
    public DoisPontos getPontoInicial(){
        return p1;
    }
    
    public DoisPontos getPontoFinal(){
        return p2;
    }
    public float getDistancia(){
        float x = (float) Math.pow((p2.getCoord_x() - p1.getCoord_x()), 2);
        float y = (float) Math.pow((p2.getCoord_y() - p1.getCoord_y()), 2);
        float distancia = (float) Math.sqrt(x+y);
        return distancia;
    }
    public DoisPontos getPontoMediano(){
        float novoX = (p1.getCoord_x() + p2.getCoord_x()) / 2;
        float novoY = (p1.getCoord_y() + p2.getCoord_y()) / 2;
        return new DoisPontos(novoX,novoY);
    } 
}
