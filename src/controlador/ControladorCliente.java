/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controlador;

import java.util.ArrayList;
import java.util.List;
import modelo.Cliente;


public class ControladorCliente {
    
    private static ArrayList<Cliente> listaClientes = new ArrayList<Cliente>();
    private static int codigoAuto = 1;
      private List<Cliente> clientes; 
      
    
     static {
        listaClientes.add(new Cliente(
            codigoAuto++, 
            "Juan Pérez", 
            "Av. Siempre Viva 123", 
            "juan.perez@email.com", 
            1500.50, 
            5512345678L, 
            generarNumeroCuenta()
        ));
        listaClientes.add(new Cliente(
            codigoAuto++, 
            "María López", 
            "Calle Falsa 456", 
            "maria.lopez@email.com", 
            2500.75, 
            5519876543L, 
            generarNumeroCuenta()
        ));
        listaClientes.add(new Cliente(
            codigoAuto++, 
            "Carlos García", 
            "Av. Las Palmas 789", 
            "carlos.garcia@email.com", 
            3200.00, 
            5511122233L, 
            generarNumeroCuenta()
        ));
    }
    public static Cliente buscar(int codigo){
        
        for(Cliente cliente: listaClientes){
           if(cliente.getIdCliente()== codigo)
               return cliente;
        }
        return null;
    }
     public static String generarNumeroCuenta() {
        return "CU" + (int)(Math.random() * 1000); 
    }
     
    
  
    public static Cliente buscar(String nombre){
        
        for(Cliente cliente: listaClientes){
           if(cliente.getNombre().toLowerCase().contains(nombre))
               return cliente;
        }
        return null;
    }
    
   
    public static int buscar(Cliente cliente){
        return listaClientes.indexOf(cliente);
    }
    
    
    public static void agregar(String nombre, String direccion,
                    String email, Double saldo, long celular, String numeroCuenta){
    
        Cliente clienteNuevo = new Cliente(
                codigoAuto++, nombre, direccion, email, saldo, celular, numeroCuenta
        );
        listaClientes.add(clienteNuevo);
    }
    
   
    public static void editar(int id,Cliente cliente){
      
        listaClientes.set(id, cliente);
    }
    
   
    public static String[] listar(){
        String[] clientes = new String[listaClientes.size()];
        int id = 0;
        for(Cliente cliente: listaClientes){
          clientes[id] = cliente.getNombre();
          id++;
        }
        return clientes;
    }

   
    public static void eliminar(Cliente cliente) {
        listaClientes.remove(cliente);
    }
    public static List<Cliente> listarClientes() {
    return listaClientes; 
}
    public List<Cliente> obtenerTodos() {
        return clientes;
    }
    
    
}
