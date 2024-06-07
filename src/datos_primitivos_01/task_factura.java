package datos_primitivos_01;

import java.util.Scanner;

public class task_factura {

    public static void main (String [] args){
        Scanner s = new Scanner(System.in);

        System.out.println("Escrbia el tipo de factura a realizar");
        String factura01 =s.nextLine();
        //precios
        
        System.out.println("Indique los precios de los productos");
        System.out.println("Producto uno -> ");
        Double precio_1 = s.nextDouble();
        System.out.println("Agregue el impuesto -> ");
        Double impuesto = s.nextDouble();

        double total = precio_1 + impuesto;
        double valor_final = total %19;
        System.out.println("El nombre de la factura es : " + factura01 + 
                            "\n y el precio del primer producto es : " + precio_1 +
                            "\n el precio del segundo producto es : " + impuesto + 
                            "\n TOTAL :: " + valor_final);
        
    }
    
}
