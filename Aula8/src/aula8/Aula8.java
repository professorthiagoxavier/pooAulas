/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aula8;

/**
 *
 * @author AB1239450
 */
public class Aula8 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        String[] nom = new String[5];
        //String nom[] = new String[5];
        nom[0] = "Thiago";
        nom[1] = "Souza";
        nom[2] = "Xavier";
        nom[3] = "João";
        nom[4] = "Paula";
        //mostrar a Paula; 
        System.out.println(nom[4]);

        //para i = 0; condição; incremento/decremento faça
        int i;
        for (i = 0; i <= 4; i++) {
            System.out.println(nom[i]);
        }
        System.out.println("variável i: " + i);

    }

}
