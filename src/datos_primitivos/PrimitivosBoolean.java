package datos_primitivos;

public class PrimitivosBoolean {
    
    public static void main(String []args){
        
        Boolean datoLogico= true;
        System.out.println("datoLogico = " + datoLogico);
        
        double b = 97865.43e-3;
        System.out.println("d = " + b);

        float f = 1.2345e2f;
        System.out.println("f = " + f);

        datoLogico = b < f;
        System.out.println("datoLogico = " + datoLogico);

        boolean esIgual = (3-2 == 1);
        System.out.println("esIgual = " + esIgual);



    }
}
