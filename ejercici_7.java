/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package app;

/**
 *
 * @author ERICK
 */
public class ejercici_7 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        //Aplicacion que valide el pago en medio efectivo y de documentos en la venta
        // de un vehiculo a un cliente
        String persona="Josue";
        boolean lugarvotacion=true;
        boolean edad=true;
        boolean mesacorrecta=true;
        
        //PROCESO
        if (lugarvotacion== true) {
            if (edad== true){
            if (mesacorrecta== true){ 
                System.out.println(persona+" Esta acto para realizar el proceso de votacion ");
            }else{
                System.out.println(" No se encuentra en la mesa correcta, pero esta ese lugar correcto");
                System.out.println(persona+" no Tiene la edad accesible para sufragar");
                }
            }else{
                System.out.println(persona+" Edad minima para realizar este proceso de aufragar es de 16 aÃ±os");
                    }
            }else{
                System.out.println(persona+ " No se encuentra en el establecimiento correcto");
            
                    
            }
        
            }
          
        
    }
        