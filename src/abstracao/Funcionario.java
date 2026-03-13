
package abstracao;


public abstract class Funcionario {
    String nome;
    int cpf;
    
    Funcionario (String nome, int num_cpf){
        this.nome = nome;
        num_cpf = cpf;   
    }
    
    void baterPonto(){
        System.out.println(nome+" Registrou a entrada");
    }
    abstract double calcularSalario();    
}
