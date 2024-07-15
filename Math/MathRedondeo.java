// Actividad: Redondeo de números
// Escribe un programa que pida al usuario un número decimal y muestra en pantalla su valor redondeado utilizando el método round() de la clase Math.

import java.util.Scanner;

public class MathRedondeo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("\nIntroduce un número decimal: ");
        double num = sc.nextDouble();

        System.out.println("El número redondeado es: " + Math.round(num));

        sc.close();
    }
}
