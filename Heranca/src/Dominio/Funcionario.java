/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Dominio;

/**
 *
 * @author AB1239450
 */
public class Funcionario {
    int id;
    String nome; 
    double salario; 
    
    public boolean autenticar(String senha){
        if(senha.equals("123")){
            return true;
        }else{
            return false;
        }
    }
}
