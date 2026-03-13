/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package abstracao;

/**
 *
 * @author willian
 */
public class Programador extends Funcionario {
    
    Programador(String nome, int cpf){
    super(nome,cpf);
    }
    
    @Override
    double calcularSalario(){
        return 10000;
    
    }
    
}
