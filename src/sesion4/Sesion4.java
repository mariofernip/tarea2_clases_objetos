/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package sesion4;

import ec.gob.gadmriobamba.gth.Global;
import ec.gob.gadmriobamba.gth.Trabajador;
import java.util.Scanner;

/**
 *
 * @author mario
 */
public class Sesion4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Scanner lector = new Scanner(System.in);
        System.out.println("***** BIENVENIDO *****");                
        System.out.println("INGRESE EL NUMERO DE TRABAJADORES QUE DESEA REGISTRAR");        
        int numerotrabajadores = lector.nextInt();
        lector.nextLine();
        Trabajador[] trabajador = new Trabajador[numerotrabajadores];
        
        
       // System.out.println("INGRESE LOS DATOS DE LOS TRABAJADORES");
        int j = 0;
        while(Global.mayor < Global.maxTrab || trabajador.length < j){
            //System.out.println(Global.mayor);
            //System.out.println(Global.maxTrab);
            //System.out.println(j);
            
           System.out.println("INGRESE LOS DATOS DEL TRABAJADOR");        
           Trabajador trabaja = new Trabajador("ND");
           System.out.println("INGRESE CEDULA");
           trabaja.setCedula(lector.nextLine());
           System.out.println("INGRESE NOMBRE");        
           trabaja.setNombre(lector.nextLine());
           System.out.println("INGRESE APELLIDO");        
           trabaja.setApellido(lector.nextLine());
           System.out.println("INGRESE LA EDAD");
           trabaja.setEdad(lector.nextInt());
           lector.nextLine();
           trabajador[j]=trabaja;
           j++;
           Global.incrementarMayor();
           
           if (j == trabajador.length){
            Global.mayor = Global.maxTrab;
           }
           
           if (Global.mayor >(Global.maxTrab-1)){
               System.out.println("***************");               
               System.out.println("ATENCION!!! No se puede crear mas de: "+Global.mayor+" Trabajadores" );
               System.out.println("***************");          
           }
        }
        
        System.out.println("LOS DATOS DE LOS TRABAJADORES SON");
        
        for (int i=0; i<j; i++){
           System.out.println("**** TRABAJADOR *****");                       
           System.out.println("CEDULA");           
           System.out.println(trabajador[i].getCedula()) ;
           System.out.println("NOMBRE"); 
           System.out.println(trabajador[i].getNombre());
           System.out.println("APELLIDO");
           System.out.println(trabajador[i].getApellido());
           System.out.println("EDAD");
           System.out.println(trabajador[i].getEdad());
           System.out.println("");  
           //trabajador[i].imprimirDatos(" ");
        }
        
        
        
        
        
        
        
        
        
    }
    
}
