/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;


public class Cliente {
    private int idCliente;
    private String nombre;
    private String direccion;
    private String email;
    private Double saldo;
    private long celular;
    private String numeroCuenta;  
    
    
    public Cliente(int id, String nombre, String direccion,
                    String email, Double saldo, long celular,  String numeroCuenta )
    {
        this.idCliente = id;
        this.nombre = nombre;
        this.direccion = direccion;
        this.email = email;
        this.saldo = saldo;
        this.celular = celular;
        this.numeroCuenta = numeroCuenta;
    }

    public int getIdCliente() {
        return idCliente;
    }

    
    public void setIdCliente(int idCliente) {
        this.idCliente = idCliente;
    }

    
    public String getNombre() {
        return nombre;
    }

    
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    
    public String getDireccion() {
        return direccion;
    }

   
    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

  
    public String getEmail() {
        return email;
    }

   
    public void setEmail(String email) {
        this.email = email;
    }

    
    public Double getSaldo() {
        return saldo;
    }

   
    public void setSaldo(Double saldo) {
        this.saldo = saldo;
    }

 
    public long getCelular() {
        return celular;
    }

  
    public void setCelular(long celular) {
        this.celular = celular;
    }
 
    public Double depositar(Double deposito) {
       this.saldo = this.saldo + deposito;
       return this.saldo;
   }

  
    public Double retirar(double retiro) {
       if(this.saldo < retiro)
           return null;
       else
           return this.saldo = this.saldo - retiro;
   }

    public String getNumeroCuenta() {
        return numeroCuenta;
    }

    public void setNumeroCuenta(String numeroCuenta) {
        this.numeroCuenta = numeroCuenta;
    }
}
