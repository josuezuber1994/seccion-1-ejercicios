/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package app;

/**
 *
 * @author ERICK
 */
public class ejercici_15 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
         Scanner entrada = new Scanner (System.in);
        //APLICACIÃ“N UTILIZANDO SWITCH COMBINANDO CON LOS CICLOS REPETITIVOS 
        //EVALUAR DOS EXCENARIOS DONDE EL ESCENARIO 1: PRESENTE LOS NUMERO EN FORMA 
        //ASCENDENTE HASTA LLEGAR A 10 A PARTIR DE UN NUMERO INRESADO Y EN EL 2 ESCENARIO LLEGAR EN FORMA DESCENDENTE DEL 5 AL 0
        
        // ENTRADA DE VARIABLES
        int numeroingresado=0,contador;
        //proceso 
        numeroingresado= Integer.parseInt(JOptionPane.showInputDialog("Digite un numero"));
        contador = Integer.parseInt(JOptionPane.showInputDialog("MENU DE CONVERSIONES \n"
        +"1.PRESENTAR SECUENCIA ASCENDENTE\n"
        +"2.PRESENTAR SECUENCIA DESCENDENTE\n"
        +"3.SALIR"));
        switch (contador){
            case 1:
                
                while(numeroingresado <10 ){             
                numeroingresado++;
                JOptionPane.showMessageDialog(null, "El numero es Ascendente: "+numeroingresado);
                }
            break;
            case 2:
                while(numeroingresado >1 ){
                numeroingresado--;
                JOptionPane.showMessageDialog(null, "El numero es descendente: "+numeroingresado);
                }
            break;
            default: JOptionPane.showMessageDialog(null, "El numero ingresado no esta en el rango ");
            
        }
    }
    
}

