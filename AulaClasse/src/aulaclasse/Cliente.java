/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aulaclasse;

/**
 *
 * @author AB1239450
 */
public class Cliente {
    //Atributos
    String nome;
    Long cpf;
    String rua;
    String bairro;

    //construtor da classe
    public Cliente() {
        
    }
    
    //método
    public void imprimirDadosCliente(){
        System.out.println("Cliente cadastrado *******");
        System.out.println("Nome cliente: " + nome);
        System.out.println("Bairro: " + bairro);
        System.out.println("Rua: " + rua);
        System.out.println("CPF: " + cpf);
    }
}
