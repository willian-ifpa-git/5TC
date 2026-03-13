
package pkg5tc_oo_polimorfismo;


public class Main {


    public static void main(String[] args) {
        Notificador n = new Notificador();
        Pagamento p = new Pagamento();
        Cartao c = new Cartao();
        n.enviar("willian@ifpa.edu.br");
        n.enviar("willian@ifpa.edu.br", "Bem bindo ao clube...");
        n.enviar("willian@ifpa.edu.br", "Bem bindo ao clube...", 919001);
        
        p.processar(100);
        c.processar(100);
    }
    
}
