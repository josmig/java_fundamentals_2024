package datos_primitivos_01;

import java.util.InputMismatchException;
import java.util.Scanner;

public class sistemas_numericos_terminal{

    public static void main(String []args){
        
        // String numeroStr = JOptionPane.showInputDialog(null,"Ingrese un numero");
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingrese un numero entero : ");
        // String numeroStr = scanner.nextLine();

        int numeroDecimal = 0;
        try{
            // numeroDecimal = Integer.parseInt(numeroStr);    
            numeroDecimal = scanner.nextInt();
        }catch(InputMismatchException e){
            System.out.println("\"Error debe ingresar un numero entero\"");
            main(args); //retornamos metodo main
            System.exit(0);
            scanner.close();
        }
    
        System.out.println("numero decimal " + numeroDecimal);

        String resultadoBinario = "numero binario de " + numeroDecimal + " = " + Integer.toBinaryString(numeroDecimal);
    
        String resultadoOctal = "numero octal de " + numeroDecimal+ " = " + Integer.toOctalString(numeroDecimal);
    
        String resutladoHexa ="numero hexadecimal de " + numeroDecimal + " = " + Integer.toHexString(numeroDecimal);
        


        String mensaje = resultadoBinario;
        mensaje += "\n" + resultadoOctal;
        mensaje += "\n" + resutladoHexa;

        System.out.println(mensaje);
    
    }
}
