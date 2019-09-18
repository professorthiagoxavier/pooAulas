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
public class Senha {
    
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        String senha;
        System.out.println("Informe a senha: ");
        senha = ler.next();
        while(!senha.equalsIgnoreCase("xpto")){
            System.out.println("Informe a senha correta: ");
            senha = ler.next();
        }
        System.out.println("Senha correta!");
    }
   

    
}
