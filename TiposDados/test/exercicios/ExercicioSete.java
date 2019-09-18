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
public class ExercicioSete {
    
    public static void main(String args[]){
        Scanner teclado = new Scanner(System.in);
        
        System.out.println("Informe o dólar: ");
        float dolar = teclado.nextFloat();
        
        System.out.println("Informe o valor real: ");
        float real = teclado.nextFloat();
        
        float conversao = real / dolar;
        
        System.out.printf("Você pode comprar: %.2f", conversao);           
                
                
                
        
        
    }
    
    
}
