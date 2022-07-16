/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package app;

/**
 *
 * @author ERICK
 */
public class ejercici_14 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        //ENTRADA DE DATOS
        String palabra="";
        int longitud =0;
        int cantidadvocales=0;
        int cantidadconsonantes=0;
        
        //PROCESO
        palabra = JOptionPane.showInputDialog("Digite la palabra: ");
        //PROCESO OBTENEMOS LA LONGITUD DE LA PALABRA
        longitud = palabra.length();
        //PROCESO DDE CONTAR Y RECORRER Y CONTAR LAS VOCALES Y CONSONANTES 
        for (int indice =0; indice<longitud; indice++){
        //VALIDACION DE VOCALES
        if (palabra.charAt(indice)=='a' || palabra.charAt(indice)=='e' || palabra.charAt(indice)=='i' || palabra.charAt(indice)=='o' ||
                palabra.charAt(indice)=='u') {
         cantidadvocales++;   
        }else{
            cantidadconsonantes++;
        }
        
        }
        //SALDIA DE DATOS
        JOptionPane.showMessageDialog(null, "La cantidad de vocales es: "+cantidadvocales);
        JOptionPane.showMessageDialog(null, "La cantidad de Consonante es: "+cantidadconsonantes);
        
    }
    
}

    }
    
}
