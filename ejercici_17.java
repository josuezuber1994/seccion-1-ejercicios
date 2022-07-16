/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package app;

/**
 *
 * @author ERICK
 */
public class ejercici_17 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       //ENTRADA hacer un ejercicio de palabra palindroma 
        String palabra="";
        String palabranueva="";
        int longitud=0;
        //PROCESO
        palabra = JOptionPane.showInputDialog("Ingrese una palabra: ");
        longitud = palabra.length();
        for (int indice = longitud-1; indice>=0; indice--) {
            //ARMAMOS LA NUEVA PALABRA
            
        palabranueva = palabranueva+palabra.charAt(indice);
            
        }
        //Salida
        if (palabra.equals(palabranueva)) {
            JOptionPane.showMessageDialog(null, "Es palindroma");
            
        }else{
            JOptionPane.showMessageDialog(null, "No es polindroma");
        }
    }
    
}

