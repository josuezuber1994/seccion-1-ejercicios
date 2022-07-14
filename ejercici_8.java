/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package app;

/**
 *
 * @author ERICK
 */
public class ejercici_8 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
      //Ejercicio que valide el medio de pago en efectvo y de documento en la venta
        //de un vehiculo de un cliente
        String vehiculo="Ford";
        boolean licencia=true;
        boolean efectivo=true;
        //PROCESO
        if (licencia ==true) {
            
            if(efectivo==true){
                System.out.println(vehiculo+" Se ejecuta la venta del vehiculo");
                
        } else { 
            System.out.println(vehiculo+" No se ejecuta la compra del vehiculo");
        }
        
        }else{
            System.out.println(vehiculo+ " No se ejecuta la compra del vehiculo");
        }
    
    }
}

