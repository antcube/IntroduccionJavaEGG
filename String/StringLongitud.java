// Actividad: Longitud de Cadena
// Escribe un programa que pida al usuario ingresar una cadena de texto y muestre en pantalla su longitud utilizando el método length() de la clase String.

import java.util.Scanner;

public class StringLongitud {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("\nIngresa una cadena de texto: ");
        String cadena = sc.nextLine();

        System.out.println("La longitud de la cadena es: " + cadena.length());
        
        sc.close();
    }
}
