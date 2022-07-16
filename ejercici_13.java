/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package app;

/**
 *
 * @author ERICK
 */
public class ejercici_13 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
         //HACER UNA APLICACION DE COMINACION DE STRING A ENTERO, LA CONVERSION STRNG A DOUBLE
        //LA CONVERSION DE CHAR A STRING, CON MENU DE OPCIONES.
        Scanner entrada = new Scanner (System.in);
        
        String numeroenteroString ="5";
        String numerodecimalString="2.50";
        String caractersexoString ="";
        int numeroenteroconvertido=0;
        double numerodecimalconvertido=0.0;
        char caractersexo='m';
        
        //PROCESO 
        int opcion = Integer.parseInt(JOptionPane.showInputDialog("***MENU DE CONVERSIONES***\n"
        +"1.Convertir de String a numero entero. \n"
        +"2.Convertir de String a numero decirmal.\n"
        +"3.Convertir de un caracter a un tipo string\n"
        +"4.Salir"));
        //Aplicacion de anidados (IF)
        //PRESENTO LA CONVERSION DE SRING A NUMERO ENTERO
        if (opcion==1) {
        numeroenteroconvertido= Integer.parseInt(numeroenteroString);
        JOptionPane.showMessageDialog(null, "La conversion de string a numero entero "+numeroenteroconvertido);
            
        }else if (opcion==2){
            numerodecimalconvertido=Double.parseDouble(numerodecimalString);
            JOptionPane.showMessageDialog(null, "La coversion de string a double es: "+numerodecimalconvertido);
            
         }else if (opcion==3){ 
             caractersexoString = String.valueOf(caractersexo);
             JOptionPane.showMessageDialog(null, "La coversion de char a string es: "+caractersexoString);
             
             
         }else{
             JOptionPane.showMessageDialog(null, "Graciss por usar el sistema");
            
        }
        
        
    }
    
}

