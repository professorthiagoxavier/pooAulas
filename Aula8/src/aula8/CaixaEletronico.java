/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aula8;

import java.util.Scanner;

/**
 *
 * @author AB1239450
 */
public class CaixaEletronico {

    public static void main(String[] args) {
        ContaCorrente conta = new ContaCorrente();
        int count = 0;
        double valor;

        Scanner ler = new Scanner(System.in);
        do {   //Faça 
            System.out.println("Qual operação deseja realizar");
            System.out.println("1 - deposito");
            System.out.println("2 - saque");
            System.out.println("3 - finalizar");

            try {
                count = ler.nextInt();
                ler.nextLine();

                if (count == 1) {
                    System.out.println("Informe o valor: ");
                    valor = ler.nextDouble();
                    //deposito
                    conta.deposito(valor);
                } else if (count == 2) {
                    //saque
                    System.out.println("Informe o valor: ");
                    valor = ler.nextDouble();
                    conta.sacar(valor);
                }
                System.out.println("Saldo: " + conta.saldo);
            } catch (Exception ex) {
                System.out.println("Erro: " + ex.getMessage());
            }

        } while (count != 3);//enquanto

        System.out.println("Vai com Deus!");
    }

}
