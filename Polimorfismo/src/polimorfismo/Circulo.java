/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package polimorfismo;

/**
 *
 * @author AB1239450
 */
public class Circulo extends Figura {
    Double raio;
    
    @Override //sobreescrevendo o método area
    public Double area(){
        return 3.14 * raio * raio;
    }
   
}
