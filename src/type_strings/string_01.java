package type_strings;

public class string_01 {
    
    public static void main(String[] args) {
        String curso = "Programación JAVA"; //nueva versión
        String curso2= new String("Aprendiendo programación");  //versión pasada

        boolean esIgual = curso==curso2;
        System.out.println("curso==curso2" + esIgual);

        esIgual = curso.equals(curso2);
        System.out.println("curso.equals(curso2): " + esIgual);

        String curso3 = "Programación JAVA";
        esIgual = curso == curso3;
        System.out.println("curso == curso3 =" + esIgual);

    }
}



