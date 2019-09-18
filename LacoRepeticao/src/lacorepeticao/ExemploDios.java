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
public class ExemploDios {
    //apenas somar valores maiores que zero
    public static void main(String args[]) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("Informe um valor: ");
        long num = teclado.nextLong();
        long somar = 0;
        while(num >= 0)
        {//inicio
            somar = somar + num;
            System.out.println("Informe o próximo valor: ");
            num = teclado.nextLong();
        }//fim
        
        System.out.println("Resultado: " + somar);
        
        
        
        
    }

}
