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
public class ExTres {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        int qtd;
        System.out.println("Informe a qtd de números: ");
        qtd = ler.nextInt();
        int[] valores = new int[qtd];
        
        for(int y = 0; y < qtd; y++){
            valores[y] = ler.nextInt();
        }
        
       
    }
    
    
}
