
package pkg5tc_oo_polimorfismo;


public class Cartao extends Pagamento{
    
    @Override
    void processar(double valor){
    double taxa = 2.5;
        System.out.println("Pag. via cartão"+(valor+taxa));
    }
}
