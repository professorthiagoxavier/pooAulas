/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package auladois;

import java.util.Scanner;

/**
 *
 * @author AB1239450
 */
public class AulaDois {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner teclado = new Scanner(System.in);
        Cliente cliUm = new Cliente();
        System.out.println("Nome completo: ");
        cliUm.nome = teclado.nextLine();

        System.out.println("Rua: ");
        cliUm.rua = teclado.nextLine();
        
        System.out.println("CPF: ");
        cliUm.cpf  = teclado.nextLong();
               
         teclado.nextLine();
        System.out.println("Bairro: ");
        cliUm.bairro = teclado.nextLine();
        
        cliUm.exibirInformacao();
    
    }

}
