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

        String text = "Hola Mundo!";

        int largo = text.length();
        System.out.println(largo);

        String texto = text.replace("Hola","Chao");
        System.out.println(text);

        System.out.println(texto.endsWith("undo!"));
        System.out.println(texto.startsWith("Ch"));
        System.out.println(texto.contains("und"));




    }
}