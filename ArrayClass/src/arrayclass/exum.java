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
public class exum {
    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);
        int[] valores = new int[4];
        //int valores[] = new int[4];
        
        for(int i = 0; i < 4; i++){
            
            System.out.printf("Informe o %d° valor: ", i + 1);
            valores[i] = leia.nextInt();
        }
        
        for (int i = 0; i < 4; i++) {
            System.out.printf("Valores[%d]: %d\n", i, valores[i]);
        }
        
    }
}
