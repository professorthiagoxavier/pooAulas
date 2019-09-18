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
//receber 3 nomes e cada aluno
//informará duas notas
public class ExemploUm {

    public static void main(String args[]) {
        Scanner ler = new Scanner(System.in);
        String nome;
        float notaUm, notaDois, media;
        int contador = 0;

        //enquanto contador <= 2 faça
        while (contador <= 2) {//inicio do laço
            System.out.println("Informe o nome: ");
            nome = ler.next();

            System.out.println("Primeira nota: ");
            notaUm = ler.nextFloat();

            System.out.println("Segunda nota: ");
            notaDois = ler.nextFloat();

            media = (notaUm + notaDois) / 2;
            System.out.println("Média: " + media);
            contador = contador + 1;
            ler.nextLine();
        }//fim do laço

    }
}
