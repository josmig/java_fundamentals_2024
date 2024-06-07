package datos_primitivos_01;

public class ConversiondeTipo {
    public static void main (String [] args){
        
        //Tipo string a tipo primitivo
        String numeroString ="50";
        
        int numeroInt = Integer.parseInt(numeroString);
        System.out.println("numero Int " + numeroInt);

        String realStr = "987.89";
        double numeroDouble = Double.parseDouble(realStr);
        System.out.println("numero double" + numeroDouble);

        String logicoString = "true";
        boolean logicoBoolean = Boolean.parseBoolean(logicoString);
        System.out.println("numero boolean " + logicoBoolean);


        //Tipo primitivo a un tipo String
        int otroNumeroInt = 100;
        System.out.println("Otro numero int " + otroNumeroInt);
        String otroNUmeroString = Integer.toString(otroNumeroInt);
        System.out.println("otro numero String " + otroNUmeroString);

        otroNUmeroString = String.valueOf(otroNumeroInt);
        System.out.println(otroNUmeroString);

        otroNUmeroString = String.valueOf(otroNumeroInt + 10);
        System.out.println("otroNumeroStr" + otroNUmeroString);
        
        double realDouble = 1.23456;
        String otroREal = Double.toString(realDouble);
        System.out.println("otro numero real " + otroREal);

        String otroRealString = String.valueOf(1.234567f);
        System.out.println("otro real string" + otroRealString);


        //Conversion entre tipo primitivos
        int i = 32768;
        System.out.println("i =" + i);
        short s = (short)i; 
        System.out.println("s = " + s);//esto se llama casting forzar la conversion
        long l = i;
        System.out.println("l = " + l);
        System.out.println(Short.MAX_VALUE);
    }
}
