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
public class ejercici_4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //VERIFICACION DE DOS NUMEROS PARES A PARTIR DEL USO DE O       PERADORES LOGICOS Si se ccumple la condicion
        int numero1;
        int numero2;
        int residuo1;
        int residuo2;
        
        //PROCESO
        numero1=Integer.parseInt(JOptionPane.showInputDialog("Digite un numero"));
        numero2=Integer.parseInt(JOptionPane.showInputDialog("Digite un numero"));
        
        residuo1= numero1%2;
        residuo2= numero2%2;
        if (residuo1 ==0 && residuo2 ==0) {
        
        //Salida
            JOptionPane.showMessageDialog(null,"LOS DOS NUMEROS SON PARES: ");
            
         } else {
            JOptionPane.showMessageDialog(null,"LOS DOS NUMEROS SON Incorrectos: ");
        }
        
        }
    }

