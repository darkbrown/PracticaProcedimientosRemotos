/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package rpcCliente;

import java.util.Vector;
import org.apache.xmlrpc.XmlRpcClient;

/**
 *
 * @author paco__000
 */
public class RPCCliente {
    public static void main(String[] args) {
        try{
            XmlRpcClient cliente = new XmlRpcClient("http://localhost:6000/");
            
            Vector<String> nombreCliente = new Vector<>();
            String text = "Jose";
            nombreCliente.add(text);
            
            Vector<Integer> numeros = new Vector<>();//Vector para guardar varias cosas como un arreglo mas de un valor 
            numeros.addElement(new Integer(50));
            numeros.addElement(15);
            
            System.out.println("Conectado a la url: "+ cliente.getURL());
            
            Object Saludo = cliente.execute("operaciones.saludame", nombreCliente);
            String CadenaSaludo = ((String) Saludo).toString();
            System.out.println("El saludo retornado del servidor fue: " + CadenaSaludo);
            
            Object sumaRemota = cliente.execute("operaciones.suma", numeros);
            int suma = (Integer) sumaRemota;
            System.out.println(suma); 
            
             Object restaRemota = cliente.execute("operaciones.resta", numeros);
            int resta = (Integer) restaRemota;
            System.out.println(resta);
            
             Object multiplicacionRemota = cliente.execute("operaciones.multiplica", numeros);
            int multiplica = (Integer) multiplicacionRemota;
            System.out.println(multiplica); 
            
        }catch(Exception e){
            e.printStackTrace();
        }
    }
}
