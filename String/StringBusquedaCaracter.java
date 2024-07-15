// Actividad: Búsqueda de Caracteres
// Escribe un programa que pida al usuario ingresar una palabra y un carácter, y determine si el carácter ingresado se encuentra en la palabra utilizando el método indexOf() de la clase String. Muestra un mensaje adecuado en pantalla indicando si el carácter se encuentra o no en la palabra.

import java.util.Scanner;

public class StringBusquedaCaracter {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("\nIngresa una palabra: ");
        String palabra = sc.nextLine();

        System.out.println("Ingresa un caracter: ");
        char caracter = sc.next().charAt(0);

        if(palabra.indexOf(caracter) != -1) {
            System.out.println("El caracter " + caracter + " se encuentra en la palabra " + palabra);
        } else {
            System.out.println("El caracter " + caracter + " no se encuentra en la palabra " + palabra);
        }

        sc.close();
    }
}
