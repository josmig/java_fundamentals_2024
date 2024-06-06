package datos_primitivos;

public class PrimitivosCaracteres {
    public static void main(String [] args){

        char caracter = '\u0040';
        char decimal = 64;
        System.out.println("caracter =" + caracter);
        System.out.println("decimal =" + decimal);
        System.out.println("decimal = caracter " + (decimal == caracter));

        char simbolo = '@';
        System.out.println("simbolo  = " + simbolo);
        System.out.println("simbolo = caracter " + (simbolo == caracter));

        //este caracteres que nos permiten 
        char espacio = '\u0020';
        char retroceso = '\b'; 
        char tabulador = '\t';
        // char nuevaLinea = '\n';
        // char retornoReinicio = '\r';

        System.out.println("char corresponde en byte (espacio):" + espacio + Character.BYTES);
        System.out.println("char corresponde en byte (retroceso):" + retroceso + Character.BYTES);
        System.out.println("char corresponde en byte (tabulador):" + tabulador + Character.BYTES);
        // System.out.println("char corresponde en byte (nuevaLinea):" + nuevaLinea + Character.BYTES);
        // System.out.println("char corresponde en byte (retornoReinicio):" + retornoReinicio + Character.BYTES);
        System.out.println("char corresponde en byte conmbinacion (nuevaLinea - retornoReinicio ):" + System.lineSeparator() + Character.BYTES);

        System.out.println("char corresponde en bites :" +  Character.SIZE);
        System.out.println("CHARACTER.MIN_VALUE :" +  Character.MIN_VALUE);
        System.out.println("CHARACTER.MAX_VALUE :" +  Character.MAX_VALUE);
    }
}
