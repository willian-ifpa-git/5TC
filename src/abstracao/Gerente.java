/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package abstracao;

/**
 *
 * @author willian
 */
public class Gerente extends Funcionario {
      private double aux_ger;
    Gerente (String nome,int cpf, double aux){
        this.aux_ger = aux;
        super(nome,cpf);
    }
    
    @Override
    double calcularSalario(){
        return 5000+ aux_ger;
    }
    
}
