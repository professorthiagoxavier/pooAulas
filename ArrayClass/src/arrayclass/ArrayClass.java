/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package arrayclass;

/**
 *
 * @author AB1239450
 */
public class ArrayClass {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        String nomes[] = new String[3];
        
        nomes[0] = "Josefina";
        nomes[1] = "Josefino";
        nomes[2] = "Marcelinho";
        
        for (int i = 0; i < 3; i++) {
            System.out.printf("Nome[%d] %s\n", i, nomes[i]);
        }
        
    }
    
}
