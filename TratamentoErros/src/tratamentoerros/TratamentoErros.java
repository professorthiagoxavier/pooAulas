/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tratamentoerros;

import java.util.Scanner;
import java.util.InputMismatchException;

/**
 *
 * @author AB1239450
 */
public class TratamentoErros {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner ler = new Scanner(System.in);
        int numUm = 0, numDois = 0;
        float divisao = 0;
        //
        try {
            System.out.println("Informe um valor inteiro: ");
            numUm = ler.nextInt();
            
            System.out.println("Informe um valor inteiro: ");
            numDois = ler.nextInt();
            
            divisao = numUm / numDois;
            
        } catch (InputMismatchException ex) {
            System.out.println("Favor digitar um valor inteiro!");
        }catch(ArithmeticException exAri){
            System.out.println("erro de divisão: " + exAri.getMessage() );
        }
        
        
        
        
        
        
        
        
        
        

        System.out.println("Divisão: " + divisao);

    }

}
