// Programa identificador de número par o impar 

import java.util.Scanner;

public class IdentificadorPar {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("\n Ingrese un número: ");
        int n1 = sc.nextInt();

        String respuesta = n1 % 2 == 0 ? "El número es par" : "El número es impar";

        System.out.println(respuesta);

        sc.close();
    }
}

// Solicita al usuario que ingrese un número y almacena este valor en una variable.
// Desarrolla un programa que determine si el número ingresado es par o impar.
// Muestra el resultado en la consola.