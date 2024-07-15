// Actividad: Copiando elementos
// Desarrolla un programa que inicie creando un array de 3 enteros, con valores predeterminados. Posteriormente, genera una copia del mismo con una extensión de 2 elementos adicionales.
// Solicita al usuario que ingrese dos números para ser almacenados en las nuevas posiciones del array.
// Finalmente, muestra por consola el contenido del nuevo array.
// Es esencial emplear exclusivamente las herramientas aprendidas hasta el momento, evitando el uso de bucles en el proceso.

import java.util.Scanner;

public class ArrayCopia {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] numeros = {10, 20, 30};

        int[] numerosCopia = new int[5];

        numerosCopia[0] = numeros[0];
        numerosCopia[1] = numeros[1];
        numerosCopia[2] = numeros[2];

        System.out.print("Ingrese un numero: ");
        int n1 = sc.nextInt();

        System.out.print("Ingrese un numero: ");
        int n2 = sc.nextInt();

        numerosCopia[3] = n1;
        numerosCopia[4] = n2;

        System.out.println("El nuerro array: ");
        System.out.println(numerosCopia[0]);
        System.out.println(numerosCopia[1]);
        System.out.println(numerosCopia[2]);
        System.out.println(numerosCopia[3]);
        System.out.println(numerosCopia[4]);

        sc.close();
    }
}
