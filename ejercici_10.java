/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package app;

/**
 *
 * @author ERICK
 */
public class ejercici_10 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       //REALIZAR UNA APLICCION CON EL SUELDO DE UN EMPLEADO PAGP POR LAS HORAS EXTRAS APORTACIONES AL IES
        //SUELDO NETO A RECIBIR
        String empleado="Josue zuberbuhler";
        String cargo="Gerente de la empresa";
        
        double pagohora=20.0;
        int numerohora=160;
        double sueldo=0.0;
        double iess=0.0;
        double netorecibir=0.0;
        
        //PROCESO
        sueldo = numerohora * pagohora;
        iess = sueldo * 0.09;
        netorecibir = sueldo - iess;
        //Salida
        System.out.println("---ROOL DE PAGO DEL SEÃ‘OR JOSUE ZUBERBUHLER---");
        System.out.println("Empleado: "+empleado);
        System.out.println("Su cargo: "+cargo);
        System.out.println("Su sueldo es: "+sueldo);
        System.out.println("Numero de horas trabajada  es: "+numerohora);
        System.out.println("Su pago por hora  es: "+pagohora);
        System.out.println("Descuento iess es: "+iess);
        System.out.println("Sueldo neto a recibir: "+netorecibir);
        
          
    }
    
}

