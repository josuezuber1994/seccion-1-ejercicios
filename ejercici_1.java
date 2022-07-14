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
public class ejercici_1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
      //CALCULAR DOS NUMEROS QUE DEN RESULTADO LA SUMA,RESTA,MULTIPLICACION,DIVISION.
        //INGRESO DE VARIABLES
        int numerouno,numerodos;
        int suma,resta,multiplicacion,division;
        //INGRESE LOS DATOS 
        numerouno= Integer.parseInt(JOptionPane.showInputDialog("Digite un numero"));
        numerodos= Integer.parseInt(JOptionPane.showInputDialog("Digite un numero"));
        //proceso
        suma = numerouno + numerodos;
        resta = numerouno - numerodos;
        multiplicacion = numerouno * numerodos;
        division = numerouno / numerodos;

        //salida
        JOptionPane.showMessageDialog(null, "La suma es: "+suma);
        JOptionPane.showMessageDialog(null, "La resta es: "+resta);
        JOptionPane.showMessageDialog(null, "La multiplicacion es: "+multiplicacion);
        JOptionPane.showMessageDialog(null, "La division es: "+division);        
    }

}
   

   