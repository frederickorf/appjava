import java.awt.*;
import java.sql.SQLOutput;
import java.text.NumberFormat;
import java.util.Arrays;
import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {


//        byte edad = 18;
//        float age = 18.5f;
//        int numeroGrande = 1000;
//        System.out.println(edad);
//
//        boolean isActive = true;
//
//        char curso = 'A';
//
//        System.out.println(isActive);
//        System.out.println(curso);


        //03 - STRINGS

//        String text = "Hola Mundo!";
//
//        int largo = text.length();
//        System.out.println(largo);
//
//
//        String texto = text.replace("Hola","Chao");
//        System.out.println(text);
//
//        System.out.println(texto.endsWith("undo!"));
//        System.out.println(texto.startsWith("Ch"));
//        System.out.println(texto.contains("und"));
//        System.out.println(texto.indexOf("Mund"));
//
//        System.out.println(texto.toUpperCase());
//        System.out.println(texto.toLowerCase());
//
//        String malo = "       chanchito feliz    ";
//        System.out.println(malo.trim());
//        System.out.println(malo);


        // 04 - CARACTERES DE ESCAPE

//        //String texto = "C:\\Hola \"Mundo\">";
//        //String texto = "Hola \nMundo";
//        String texto = "Hola \tMundo";
//        System.out.println(texto);


        // 05 - ARRAYS

//        //int[] numeros = new int[5];
//        int[] numeros = {0,1,2,3,4};
//        numeros[0] = 5;
//        numeros[4] = 7;
//        System.out.println(Arrays.toString(numeros));
//        System.out.println(numeros.length);
//        Arrays.sort(numeros);
//        System.out.println(Arrays.toString(numeros));


        // 06 - MULTIPLES DIMENSIONES

//        int[][] numeros = {{0,1}, {2,3}};
//        System.out.println(Arrays.deepToString(numeros));
//
//        int[][] numeros1 = new int[3][2];
//        numeros1[0][0] = 5;
//        System.out.println(Arrays.deepToString(numeros1));
//
//        int[][][] numeros2 = new int[3][2][2];
//        numeros2[0][0][0] = 5;
//        System.out.println(Arrays.deepToString(numeros2));


        // 07 - CONTANTES

//        //String empresa = "Hola Mundo Limite";
//        final String empresa = "Hola Mundo Limite";
//        //empresa = "Chanchito feliz";
//        System.out.println(empresa);

        // 08 - COMENTARIOS

        // Comentarios de una linea
        /**
         * Comentarios
         * de varias lineas
         */

        // 09 - Operadores aritméticos

//        int a = 2 + 2;
//        int b = 2 - 2;
//        int c = 3 * 3;
//        int m = 4 % 3;
//        int d = 10 / 3;
//        float e = 10f / 3f;
//        double f = 10.0 / 3.0;
//
//        int x = 5;
//        //++x;
//        //x++;
//
//        int y = 5;
//
//        //System.out.println(++x);
//        //System.out.println(y++);
//
//        int z = 5;
//        z = z + 5;
//
//        System.out.println(z);
//
//        int z1 = 5;
//        z1 += 5;
//
//        System.out.println(z1);

        // 10 - ORDEN DE LAS OPERACIONES

        /**
         * PEMDAS (Parenthesis, Exponential, Multipliation, Division, Add, Substraction)
         * parentesis
         * potencia
         * multiplicacion
         * división
         * suma
         * resta
         */
//        int r = 5 + 3 * 2;
//        System.out.println(r);
//
//        int r2 = (5 + 3) * 2;
//        System.out.println(r2);

        // 11 - CONVERSIÓN DE TIPOS

        // Conversion implícita
//        byte a = 1;
//        int b = 15;
//
//        int c = a + b; // Aqui Java va a tomar el tipo de datos que contenga menos bytes a la que contenga mayor cantidad de bytes
//
//        System.out.println(c);
//
//        byte d = 1;
//        double e = 15.15;
//
//        double f = d + e;
//
//        System.out.println(f);
//
//        // Conversion explícita
//
//        int x = 15;
//        double y = 15.015;
//
//        int z = (int) (x + y);
//
//        int z1 = x + (int) y;
//
//        System.out.println(z);
//        System.out.println(z1);
//
//        String j = "1.1";
//        int k = 5;
//
//        double l = Double.parseDouble(j) + k; // Aqui es necesario convertir con un metodo el tipo de dato, existe uno para cada tipo de dato.
//
//        System.out.println(l);

        // 12 - CLASE MATH

        // método overloaded
//        System.out.println(Math.abs(-15));
//        System.out.println(Math.ceil(10.1));
//        System.out.println(Math.floor(10.1));
//
//        System.out.println(Math.max(15, 25));
//        System.out.println(Math.min(15, 25));
//
//        System.out.println(Math.round(15.5));
//
//        double random = Math.random();
//        System.out.println(random * 100);
//        System.out.println((int)(random * 100));
//        System.out.println((int)random * 100);

        // 13 - FORMATO DE NÚMEROS
        // NumberFormat: Clase abstracta que no permite crear instancias de un objeto utilizando la palabra reservada "new"

//        Locale locale = Locale.forLanguageTag("es-CL");
//        NumberFormat numberFormat = NumberFormat.getCurrencyInstance(locale); // Si no se proporciona toma la local
//        String result = numberFormat.format(1099.90);
//
//        System.out.println(result);
//
//        NumberFormat porcentaje = NumberFormat.getPercentInstance();
//
//        System.out.println(porcentaje.format(0.15));

        // 14 - CLASE SCANNER

//        Scanner scanner = new Scanner(System.in);
//
//        System.out.println("Ingresa tu edad:");
//        //String valor = scanner.next();
//        //String valor = scanner.nextLine();
//        byte valor = scanner.nextByte();
//        System.out.println("Tu edad es:");
//        System.out.println(valor);

        // 15 - EJERCICIO CALCULADORA

        /**
         * Crear una calculadora que reciba
         * 2 números y luego imprima el resultado de la
         * suma de estos dos números
         */

//        System.out.println("Esta es una aplicación de calculadora");
//        System.out.println("Ingrese el primer número:");
//
//        Scanner scanner = new Scanner(System.in);
//        int valorA = scanner.nextInt();
//
//        System.out.println("Ingrese el segundo número:");
//        int valorB = scanner.nextInt();
//
//        System.out.println("El resultado de la suma es:");
//        System.out.println(valorA+valorB);

        // 16 - REFERENCIA VS PRIMITIVO

        // Comportamiento variables primitvas
//        int a = 15;
//        int b = a;
//
//        b = 33;
//        System.out.println(a);
//
//        // Comportamiento variables por referencia
//        Point point1 = new Point();
//        Point point2 = point1;
//
//        point2.x = 15;
//        System.out.println(point1);

        /**
         * La diferencia principal entre ambos tipos de variable radica en como Java
         * trabaja con estos datos en memoria:
         * Variable Primitivas: reserva un espacio en memoria para cada variable en
         * donde guarda el valor asignado directamente.
         * Variable por Referencia: en lugar de guardar el valor directamente sobre
         * el espacio en memoria reservado para cada variable, guarda una direccion
         * de otro espacio en memoria donde se guarda el valor del dato.
         * NOTA: existen vairables por referencia que son inmutables, lo que implica
         * que cada vez que realicemos una operacion sobre éste, no va a devolver otra
         * instancia, otro objeto nuevo.
         */

        // 17 - VAR

        /**
         * Este tipo de variable va a inferir el tipo de variable a asignar de acuerdo
         * al dato proporcionado.
         */

        var x = "Hola Mundo!";
        var y = 45;


    }
}

