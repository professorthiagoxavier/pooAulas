/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tiposdados;

import java.util.Scanner;

/**
 *
 * @author AB1239450
 */
public class ExercicioUm {

    public static void main(String args[]) {
        Scanner leia = new Scanner(System.in);
        short numero;
        System.out.println("Digite um número: ");
        numero = leia.nextShort();
        int resultado = numero * numero;
        
        System.out.println("O quadrado é: " + resultado);
        

    }

}
