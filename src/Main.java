import java.sql.SQLOutput;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        /*

        byte edad = 18;
        float age = 18.5f;
        int numeroGrande = 1000;
        System.out.println(edad);

        boolean isActive = true;

        char curso = 'A';

        System.out.println(isActive);
        System.out.println(curso);

         */

        //03 - STRINGS
        /*
        String text = "Hola Mundo!";

        int largo = text.length();
        System.out.println(largo);


        String texto = text.replace("Hola","Chao");
        System.out.println(text);

        System.out.println(texto.endsWith("undo!"));
        System.out.println(texto.startsWith("Ch"));
        System.out.println(texto.contains("und"));
        System.out.println(texto.indexOf("Mund"));

        System.out.println(texto.toUpperCase());
        System.out.println(texto.toLowerCase());

        String malo = "       chanchito feliz    ";
        System.out.println(malo.trim());
        System.out.println(malo);

        */

        // 04 - CARACTERES DE ESCAPE

        /*

        //String texto = "C:\\Hola \"Mundo\">";
        //String texto = "Hola \nMundo";
        String texto = "Hola \tMundo";
        System.out.println(texto);

        */

        // 05 - ARRAYS

        //int[] numeros = new int[5];
        int[] numeros = {0,1,2,3,4};
        numeros[0] = 5;
        numeros[4] = 7;
        System.out.println(Arrays.toString(numeros));
        System.out.println(numeros.length);
        Arrays.sort(numeros);
        System.out.println(Arrays.toString(numeros));

    }
}
