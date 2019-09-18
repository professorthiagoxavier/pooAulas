/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package arrayclass;

import java.util.Scanner;

/**
 *
 * @author AB1239450
 */
public class exDois {

    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);
        
        System.out.println("Informe quantos valores serão lidos");
        int qtd = leia.nextInt();
        
        int valoresInfo[] = new int[qtd];
        
        for (int i = 0; i < valoresInfo.length; i++) {
            System.out.println("Informe um valor");
            valoresInfo[i] = leia.nextInt();
        }
        
        int total = qtd - 1;
        for (int i = total; i >= 0; i--) {
            System.out.printf("Indice %d: %d \n",i,valoresInfo[i]);
        }
    }
}
