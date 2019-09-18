/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication6;

import java.util.Scanner;

/**
 *
 * @author AB1239450
 */
public class JavaApplication6 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner leia = new Scanner(System.in);
        int valorUm, valorDois;
        System.out.println("Informe o primeiro valor: ");
        valorUm = leia.nextInt();
        //alt + shift + f para identar o código 
        System.out.println("Informe o segundo valor: ");
        valorDois = leia.nextInt();

        int somar = valorUm + valorDois;
        //se somar maior ou igual a 10 faça
        if(somar >= 10){
            somar = somar + 5;
        }else{ //senão
            somar = somar - 5;
        }
        
        System.out.println("Somar: " + somar);
        
    }

}
