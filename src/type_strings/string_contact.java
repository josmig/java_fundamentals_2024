package type_strings;

public class string_contact {
    
    public static void main(String[] args) {
        String curso = "Programación JAVA"; //nueva versión
        String profesor= new String("Miguel Pantigoso");  //versión pasada


        String detalle = curso + "con el instructor " + profesor;
        System.out.println(detalle);

        int numeroA = 10;
        int numeroB = 5;

        System.out.println(detalle + (numeroA + numeroB));


        String detalle2 = curso.concat(" ".concat(profesor) );
        System.out.println(detalle2);

    }
}



