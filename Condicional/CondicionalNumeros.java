// Actividad: Clasificación de Números
// En esta actividad, deberás escribir un programa que solicite al usuario un número y determine si es positivo, negativo o cero. El resultado se mostrará en pantalla.

import java.util.Scanner;

public class CondicionalNumeros {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("\nIngrese un número: ");
        int numero = sc.nextInt();

        if(numero > 0) {
            System.out.println("El número es positivo.");
        } else if(numero < 0) {
            System.out.println("El número es negativo.");
        } else {
            System.out.println("El número es cero.");
        }
        sc.close();
    }
}
