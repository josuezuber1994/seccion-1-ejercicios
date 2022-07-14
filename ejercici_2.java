/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package app;

import javax.swing.JOptionPane;

/**
 *
 * @author ERICK
 */
public class ejercici_2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       
        //HACER UNA APLICAICION DONDE PUEDA EL USUARIO INGRESAR UN NUMERO Y LE DIGA SI ES NUMERO PAR
        // O IMPAR Y QUE LE SALGA COMO PRESENTACION DE PANTALLA Si el NUMERO ingresado ES PAR o impar.
        int numero,residuo;
        //PROCESO
        numero=Integer.parseInt(JOptionPane.showInputDialog("Digite un numero"));
        //Proceso
        residuo = numero % 2; 
        //CONDICION  
        if (residuo == 0) {
            JOptionPane.showMessageDialog(null, "El numero ingresado es par: ");

        } else {
            JOptionPane.showMessageDialog(null, "El numero ingresado es Impar: ");
        }

    }

}
