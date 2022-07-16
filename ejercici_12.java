/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package app;

/**
 *
 * @author ERICK
 */
public class ejercici_12 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
         //CONVERSIONES EN JAVA CONVERTIR DATOS STRING A NUMEROS ENTEROS
        //entrada
        String numeroenterostring ="5";
        String numerodecimalstring ="2.50";
        int numeroenteroconvertido=0;
        double numerodecimalconvertido=0.0;
        //PROCESO
        numeroenteroconvertido=Integer.parseInt(numeroenterostring);
        numerodecimalconvertido=Double.parseDouble(numerodecimalstring);
        //SALIDA
        JOptionPane.showMessageDialog(null, "El numero entero convertido es: "+numeroenterostring);
        JOptionPane.showMessageDialog(null, "El numero decimal convertido es: "+numerodecimalconvertido);
        
    }
    
}

