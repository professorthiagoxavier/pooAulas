/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exercicios;

import java.util.Scanner;

/**
 *
 * @author AB1239450
 */
public class ExercicioSeis {
/*1 - Receber valorUm 
2 - Receber valorDois
3 - Receber valorTres
4 - Somar os tres valores
5 - Resultado da soma e retirar o quadrado
6 - exibir o quadrado*/
    
    public static void main(String args[]){
        Scanner teclado = new Scanner(System.in);
        
        int numUm, numDois, numTres;
        System.out.println("Informe o primeiro valor: ");
        numUm = teclado.nextInt();

        System.out.println("Informe o segundo valor: ");
        numDois = teclado.nextInt();

        System.out.println("Informe o terceiro valor: ");
        numTres = teclado.nextInt();        
        
        int somar = numUm + numDois + numTres;
        int quadrado = somar * somar;
        
        System.out.println("O quadrado é: " + quadrado);
        
        
        
    }//fim método main
    
    

    
}
