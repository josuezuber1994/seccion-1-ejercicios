/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package app;

/**
 *
 * @author ERICK
 */
public class ejercici_3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
  
        int numero = 35;
        int residuo=0;
        //proceso
        residuo=numero %7;
      
        if (residuo== 0) {
            //salida
            System.out.println("El numero es multiplo para 7");

        } else {
            System.out.println("El numero no es multiplo para 7 ");
        }

    }

}

