/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package rpcservidor;

/**
 *
 * @author paco__000
 */
public class OperacionesMatematicas {
    
    public Integer suma(int num1, int num2){
        return num1 + num2;
    }
    
    public Integer resta(int num1, int num2){
        return num1-num2;
    }
    
    public Integer multiplica(int num1, int num2){
        return num1*num2; 
    }
    
    public Integer divide(int num1, int num2){
        if(num1 == 0 || num2 == 0){
            return 0; 
        }else{
            return num1/num2; 
        }
    }
    
    public String saludame(String nombre){
        String saludo = "hola amiguito"+ nombre;
        return saludo;
    }
}
