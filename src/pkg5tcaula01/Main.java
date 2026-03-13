
package pkg5tcaula01;

public class Main {


    public static void main(String[] args) {
       Item leite = new Item("LT-0011","DuBom em Pó 1kg",10,28.5f);
       Item pao = new Item("Po-0344","Pão de Forma 1 pct",2,10f);
       
       pao.setDesconto(0.30f);
       leite.setDescontoCarrinho(0.10f);
       pao.setDescontoCarrinho(0.5f);
       
       float precoLeite = leite.getTotalAjustadoDesconto();
       float precoPao = pao.getTotalAjustadoDesconto();
       
       System.out.println("PRodutos: ");
       System.out.println(leite.getDescricao() + "\t $"+ precoLeite);
       System.out.println(pao.getDescricao() + "\t $"+precoPao);
       System.out.println(pao.getDescontoCarrinho());
       
    }
    
}
