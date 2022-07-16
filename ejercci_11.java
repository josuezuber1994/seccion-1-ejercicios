/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package app;

/**
 *
 * @author ERICK
 */
public class ejercci_11 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // ENTRADA DE DATOS POR CONSOLA DE PRODUCTOS POR CONSOLA CANTIDAD DE PRODUCTOS VENTA DE PRODUCTOS 
        //  RESULTADO FINAL
        //Entrada de datos
        Scanner entrada = new Scanner(System.in);
        String producto = "";
        int cantidad = 0;
        float precio, total = 0.0f;
       
        System.out.println("------VENTAS DE PRODUCTOS------");//Presentacion por mensaje.
        
        //ENTRADA DE DATOS del usuario
        System.out.print("Ingrese el producto que desea: ");
        producto = entrada.nextLine();
        System.out.print("Ingrese la cantidad de producto: ");
        cantidad =entrada.nextInt();
        System.out.print("Ingrese el precio del producto: ");
        precio =entrada.nextFloat();
        //PROCESO
        total =cantidad*precio;
        //Salida de datos
        System.out.println("El saldo total de cancelar es: $"+total);      
    }

}

