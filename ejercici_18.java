/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package app;

/**
 *
 * @author ERICK
 */
public class ejercici_18 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        //HACER UNA APLICACION DE UN NUMERO CELULAR 
        String celular="";
        int longitud=0;
        //PROCESO
        celular=JOptionPane.showInputDialog("Ingrese su numero celular correctamente");
        longitud=celular.length();
        for (int indice = 0; indice < longitud; indice++) {
            //VALIDACION
         if (celular.charAt(indice)=='0'|| celular.charAt(indice)=='1'|| celular.charAt(indice)=='2'|| celular.charAt(indice)=='3'||
              celular.charAt(indice)=='4'||celular.charAt(indice)=='5'|| celular.charAt(indice)=='6'|| celular.charAt(indice)=='7'||
              celular.charAt(indice)=='8'|| celular.charAt(indice)=='9'){
             
        }else{
             JOptionPane.showMessageDialog(null, "El numero ingresado no esta correcto.");
                }
    }
}
    }

    }
    
}
