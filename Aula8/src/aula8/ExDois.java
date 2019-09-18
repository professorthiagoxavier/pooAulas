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
public class ExDois {
    //psvm
    public static void main(String[] args) {
        int numeros[] = new int[4];
        Scanner tec = new Scanner(System.in);
        for(int x = 0; x < 4; x++){
            System.out.println("Informe um número: ");
            numeros[x] = tec.nextInt();
        }
        
        for (int i = 0; i < 4; i++) {
            System.out.println("Numero: " + numeros[i]);
        }
        
        
        
        
    }
}
