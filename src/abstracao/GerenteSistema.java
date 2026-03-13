
package abstracao;


public class GerenteSistema extends Gerente implements Autenticacao{
    GerenteSistema(String nome, int cpf,double aux){
        super(nome,cpf,aux);
    }

    @Override
    public boolean login(String senha) {
        return "123456".equals(senha);
    }
    
}
