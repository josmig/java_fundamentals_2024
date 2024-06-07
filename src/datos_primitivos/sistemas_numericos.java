package datos_primitivos;

import javax.swing.JOptionPane;

public class sistemas_numericos {

    public static void main(String []args){
        
        String numeroStr = JOptionPane.showInputDialog(null,"Ingrese un numero");
        int numeroDecimal = 0;
        try{
            numeroDecimal = Integer.parseInt(numeroStr);    
        }catch(NumberFormatException e){
            JOptionPane.showMessageDialog(null, "Error debe ingresar un numero entero");
            main(args); //retornamos metodo main
            System.exit(0);
        }
    
        
        String resultadoBinario = "numero binario de " + numeroDecimal + " = " + Integer.toBinaryString(numeroDecimal);
        System.out.println(resultadoBinario);
        int numeroBinario = 0b11110;
        System.out.println("numero binario " + numeroBinario);

        String resultadoOctal = "numero octal de " + numeroBinario+ " = " + Integer.toOctalString(numeroDecimal);
        System.out.println(resultadoOctal);
        int numeroOctal = 036;
        System.out.println("numero octal = " + numeroOctal);


        String resutladoHexa ="numero hexadecimal de " + numeroDecimal + " = " + Integer.toHexString(numeroDecimal);
        System.out.println(resutladoHexa);
        int numeroHexadecimal = 0x1e;
        System.out.println("numero hex = " + numeroHexadecimal);


        String mensaje = resultadoBinario;
        mensaje += "\n" + resultadoOctal;
        mensaje += "\n" + resutladoHexa;

        JOptionPane.showMessageDialog(null,mensaje);
    
    }
}
