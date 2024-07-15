// Actividad: Resta con Manejo de Excepciones
// Escribe un programa que solicite al usuario ingresar dos números. Luego, realiza la resta del primer número menos el segundo número. Implementa un bloque "try-catch" para manejar las excepciones que puedan surgir en caso de que el usuario no ingrese números. En caso de que se produzca una excepción, muestra un mensaje apropiado en pantalla. Si no se produce ninguna excepción, muestra el resultado de la resta.

import java.util.InputMismatchException;
import java.util.Scanner;

public class TryCatchResta {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("\n------ Resta con Manejo de Excepciones -----");

        try {
            System.out.print("Ingrese el primer número: ");
            int num1 = scanner.nextInt();

            System.out.print("Ingrese el segundo número: ");
            int num2 = scanner.nextInt();

            int resta = num1 - num2;
            System.out.println("La resta de " + num1 + " menos " + num2 + " es: " + resta);
        } catch (InputMismatchException e) { // Se captura la excepción de tipo InputMismatchException
            System.out.println("Debes ingresar valores numericos y enteros. \nError: " + e.getMessage());
        }

        scanner.close();
    }
}