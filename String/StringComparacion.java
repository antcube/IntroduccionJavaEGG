// 3. Comparación de Cadenas
// Desarrolla un programa que solicite al usuario ingresar dos palabras. Utiliza el método equals() de la clase String para comparar si las dos palabras son iguales. Muestra un mensaje apropiado en pantalla indicando si las palabras son iguales o diferentes.

import java.util.Scanner;

public class StringComparacion {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("\nIngresa la primera palabra: ");
        String palabra1 = scanner.nextLine();

        System.out.print("Ingresa la segunda palabra: ");
        String palabra2 = scanner.nextLine();

        // System.out.println("Las dos frases son iguales? \nRespuesta: " + palabra1.equals(palabra2));
        System.out.println("Las dos frases son iguales? \nRespuesta: " + palabra1.equalsIgnoreCase(palabra2));

        scanner.close();
    }
}
