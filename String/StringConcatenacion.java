// Actividad:Concatenación de Cadenas
// Escribe un programa que solicite al usuario ingresar su nombre y apellido por separado, y luego muestre en pantalla el nombre completo utilizando el método concat() de la clase String.

import java.util.Scanner;

public class StringConcatenacion {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("\nIngresa su nombre: ");
        String nombre = sc.nextLine();

        System.out.print("Ingresa su apellido: ");
        String apellido = sc.nextLine();

        System.out.println("Su nombre completo es: " + nombre.concat(" " + apellido));

        sc.close();
    }
}
