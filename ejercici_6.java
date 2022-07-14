/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package app;

/**
 *
 * @author ERICK
 */
public class ejercici_6 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       //HACER UNA APLICACION QUE TENGA VALIDACION EN UN PARQUEADERO DE PARQUIMETRO
        String vehiculo="auto";
        
        //PROCESO
        if (vehiculo.equals("auto") || vehiculo.equals("camion") || vehiculo.equals("suv") ) {
            
        //SALIDA
            System.out.println("Tiene acceso al Parquimetro "+vehiculo);
            
        }else{
            System.out.println("No tiene acceso al parquimetro");
        }
    }
    
}

