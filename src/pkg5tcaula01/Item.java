
package pkg5tcaula01;

public class Item {
    private float precoUnitario;
    private  float desconto;
    public int quantidade;
    private String descricao;
    private String id;
    private static float descontoCarrinho;
    
    
    public Item(String id, String descricao, int quantidade, float preco){
        
        this.id = id;
        precoUnitario = preco;
        this.descricao = descricao;
        if(quantidade >= 0 ){
            this.quantidade = quantidade;
        }else{
            this.quantidade = 0;
        }
    } // Fim do método contrutor
    
    public float getTotalAjustadoDesconto(){
        float total = precoUnitario * quantidade;
        float descontoTotal = total * desconto;
        float totalAjustado = total - descontoTotal;
        
        return totalAjustado;
        
    }
    
    public  void setDesconto(float desconto){
        if(desconto <= 1.00){
            this.desconto = desconto;
       
        } else {
            this.desconto = 0;
        }
    }
    
    public float getDesconto(){
        return desconto;
    }
    
    public int getQuantidade(){
        return quantidade;
    }
    
    public void setQuantidade(int quantidade){
        if(quantidade >= 0){
        this.quantidade = quantidade;
        }else{
            this.quantidade = 0;
        }
    
    }
    
    public String getIDproduto(){
        return id;
    }
    
    public String getDescricao(){
        return descricao;
    }
    
    public void setId(String id)
    {
        this.id = id;
    }
    public void setDescricao(String descricao){
        this.descricao = descricao;
    }

  
    public float getDescontoCarrinho() {
        return descontoCarrinho;
    }

   
    public void setDescontoCarrinho(float aDescontoCarrinho) {
        descontoCarrinho = aDescontoCarrinho;
    }
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
                    
    
}






