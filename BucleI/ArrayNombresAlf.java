// Ordenando Nombres Alfabéticamente
// Desarrolla un programa que pida al usuario ingresar 4 nombres. Estos nombres serán ordenados alfabéticamente y posteriormente impresos en la consola. Es esencial emplear exclusivamente las herramientas aprendidas hasta el momento.

import java.util.Arrays;
import java.util.Scanner;

public class ArrayNombresAlf {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Ingrese el primer nombre: ");
        String nombre1 = sc.next();
        System.out.print("Ingrese el segundo nombre: ");
        String nombre2 = sc.next();
        System.out.print("Ingrese el tercer nombre: ");
        String nombre3 = sc.next();
        System.out.print("Ingrese el cuarto nombre: ");
        String nombre4 = sc.next();

        String[] nombres = {nombre1, nombre2, nombre3, nombre4};

        Arrays.sort(nombres);

        System.out.println("\nLos nombres ordenados alfabéticamente son: ");
        System.out.println(nombres[0]);
        System.out.println(nombres[1]);
        System.out.println(nombres[2]);
        System.out.println(nombres[3]);

        sc.close();
    }
}
