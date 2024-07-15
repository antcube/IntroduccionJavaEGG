// Actividad: Division Segura
// Escribe un programa que pida al usuario que ingrese dos números enteros y realice la división del primer número entre el segundo número. Implementa un bloque "try-catch" para manejar la excepción en caso de que se intente realizar una división por cero. En caso de que ocurra la excepción, muestra un mensaje apropiado en la pantalla.

import java.util.Scanner;

public class TryCatchDivision {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("\n------ División Segura -----");

        System.out.print("Ingrese el primer número: ");
        int num1 = sc.nextInt();

        System.out.print("Ingrese el segundo número: ");
        int num2 = sc.nextInt();

        try {
            double division = num1 / num2;
            System.out.println("La división de " + num1 + " entre " + num2 + " es: " + division);
        } catch (ArithmeticException e) {
            System.out.println("No se puede divir entre 0 \nError: " + e.getMessage());
        }

        sc.close();
    }
}
