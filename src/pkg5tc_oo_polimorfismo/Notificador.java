
package pkg5tc_oo_polimorfismo;


public class Notificador { //Sobrescrita de métodos (Compilação)
    
    public void enviar(String email){   
        System.out.println("Enviando email de notificação padrão");
    }
    public void enviar(String email, String msg){
        System.out.println("Enviar email para: "
        +email+ ":"+msg);
    }
    public void enviar(String email, String msg,int telefone){
        
        System.out.println("Enviar email para: "
        +email+ ":"+ email+ "\n ; "+ "Enviar Para Telefone: "+telefone);
    }
    public void enviar (String email, int pager, String msg){
        System.out.println("Enviar para o pager");
    
    }
    

    
}
