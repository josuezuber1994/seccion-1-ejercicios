/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package app;

/**
 *
 * @author ERICK
 */
public class ejercici_19 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
         //NUMEROS PRIMOS Y NO PRIMOS 
        //ENTRADA
        int numero=7;
        int antecesores=0;
        int residuo=0;
        int contadordivisibles=0;
        //PROCESO
        antecesores=numero-1;
        while (antecesores>1) {
            if (numero% antecesores==0) {
                contadordivisibles++;
                
            }
            antecesores--;
            
        }
        //VALIDAR SI ES PRIMO
        if (contadordivisibles==0) {
            JOptionPane.showMessageDialog(null, "Es primo");
            
        }else{
            JOptionPane.showMessageDialog(null, "No es primo");
        }
    }
    
}

