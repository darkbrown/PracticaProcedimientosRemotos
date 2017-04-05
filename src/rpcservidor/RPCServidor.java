/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package rpcservidor;

import org.apache.xmlrpc.WebServer;

/**
 *
 * @author paco__000
 */
public class RPCServidor {
    
    public static void main(String[] args) {
        
        try{
        System.out.println("iniciando servidor remoto");
        
        WebServer rpcServidor = new WebServer(6000);
        OperacionesMatematicas mat = new OperacionesMatematicas(); 
        rpcServidor.addHandler("operaciones", mat);
        
        rpcServidor.start();
        
        System.out.println("servidor listo");
        }catch(Exception e){
            System.out.println("Error server: "+ e.getMessage());
        }
        
    }
}
