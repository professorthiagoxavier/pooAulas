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
public class ContaCorrente {
    double saldo; 
    public void deposito(double dinheiro){
        saldo += dinheiro;
    }
    public void sacar(double dinheiro){
        if(saldo < dinheiro){
            throw new IllegalArgumentException("Saldo insuficiente");
        }else{
            this.saldo -= dinheiro ;
        }
    }
}
