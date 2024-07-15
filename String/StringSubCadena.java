// Actividad:Extracción de Subcadena
// Escribe un programa que solicite al usuario ingresar una frase y dos números enteros, que representen un índice inicial y un índice final. Utiliza el método substring() de la clase String para extraer la subcadena que se encuentra entre los índices ingresados por el usuario, y muestra la subcadena resultante en pantalla.

import java.util.Scanner;

public class StringSubCadena {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        System.out.print("\nIngresa una frase: ");
        String frase = sc.nextLine();

        System.out.print("Ingresa un índice inicial: ");
        int inicio = sc.nextInt();

        System.out.print("Ingresa un índice final: ");
        int fin = sc.nextInt();

        System.out.println("La subcadena es: " + frase.substring(inicio, fin));

        sc.close();
    }
}