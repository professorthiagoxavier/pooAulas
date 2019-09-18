/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package auladois;

/**
 *
 * @author AB1239450
 */
public class Cliente {//inicio class
    //atributos

    String nome;
    Long cpf;
    String rua;
    String bairro;
    //atributos

    //contrutor da classe
    public Cliente() {

    }//fim construtor
    
    //método exibir informações
    public void exibirInformacao()
    {
        System.out.println("*******");
        System.out.println("Nome: " + nome);
        System.out.println("Bairro: " + bairro);
        System.out.println("CPF: " + cpf);
        System.out.println("Rua: " + rua);
    }   
}//fim da classe
