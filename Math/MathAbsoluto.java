// Actividad: Calculando el valor absoluto
// Escribe un programa que  pida al usuario un número entero y muestra en pantalla su valor absoluto utilizando el método abs() de la clase Math.

import java.util.Scanner;

public class MathAbsoluto {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("\nIntroduce un número entero: ");
        int numero = sc.nextInt();

        System.out.println("El valor absoluto de " + numero + " es: " + Math.abs(numero));

        sc.close();
    }
}
