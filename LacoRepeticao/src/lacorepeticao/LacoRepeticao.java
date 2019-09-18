/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lacorepeticao;

import java.util.Scanner;

/**
 *
 * @author AB1239450
 */
public class LacoRepeticao {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner t = new Scanner(System.in);
        System.out.println("Informe um valor: ");
        long num = t.nextLong();
        
        long somar = 0;
        while(num > 0){
            somar += num;
            System.out.println("Informe um valor ou zero para finalizar: ");
            num = t.nextLong();
        }
        
        System.out.println("Resultado: " + somar);
    }
    
}
