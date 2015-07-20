/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package ec.gob.gadmriobamba.gth;

/**
 *
 * @author mario
 */
public class Trabajador {
    
    //Propiedades
    private String cedula;
    private String nombre;
    private String apellido;
    private int edad;
    private final int IVA=12; //Tipos primitivos o inmutables
    //Campos
    private double sueldo;
    //Constructor
    public Trabajador()
    {
        cedula="ND";
        nombre="ND";
        apellido="ND";
        edad=0;
    }
     public Trabajador(String valor)
    {
        cedula=valor;
        nombre=valor;
        apellido=valor;
        edad=0;
    }
    
    public Trabajador(String valor1,int valor2)
    {
        cedula=valor1;
        nombre=valor1;
        apellido=valor1;
        edad=valor2;
    }
    
    //Método Modificador
    public void setCedula(String pcedula)
    {
        cedula=pcedula;
    }
    //Método de Acceso
    public String getCedula()
    {
        return cedula;
    }
    public void setNombre(String pnombre)
    {
        nombre=pnombre;
    }
    public String getNombre()
    {
        return nombre;
    }
    
    public void setApellido(String papellido)
    {
        apellido=papellido;
    }
    public String getApellido()
    {
        return apellido;
    }
    
    public void setEdad(int pedad)
    {
        if(pedad<=100 && pedad>=Global.mayor)
            edad=pedad;
        else
            edad=0;
    }
    public int getEdad()
    {
        return edad;
    }
    
    //Métodos Personalizados
    //Privados
    private double calcularSueldo()
    {
        sueldo=20;
        return sueldo*100*IVA;
    }
    //Públicos
    public void imprimirDatos(String mensaje)
    {
        System.out.println(mensaje);
        System.out.println(this.cedula);
        System.out.println(this.nombre);
        System.out.println(this.apellido);
        System.out.println(this.edad);
        System.out.println(this.calcularSueldo());    
    }
    
    
    //Garbage Collector lo maneja
    public void finalize()
    {
        //Codigo de cierre
    }
    
    
}
