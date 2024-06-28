// Actividad: Creando una calculadora básica

import java.util.Locale;
import java.util.Scanner;

public class CalculadoraBasica {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Opcional: Cambiar el separador de decimales
        sc.useLocale(Locale.US); // Para que el separador de decimales sea el punto (.) y no la coma (,)

        System.out.print("\n Ingrese el primer número: ");
        double n1 = sc.nextDouble();

        System.out.print("\n Ingrese el segundo número: ");
        double n2 = sc.nextDouble();

        System.out.println("1.Suma, 2.Resta, 3.Multiplicación, 4.División");
        System.out.println("\n Seleccione la operación que desea realizar:");
        int operacion = sc.nextInt();

        double resultado;

        switch(operacion) {
            case 1:
                resultado = n1 + n2;
                System.out.println("El resultado de la suma es: " + resultado);
                break;
            case 2:
                resultado = n1 - n2;
                System.out.println("El resultado de la resta es: " + resultado);
                break;
            case 3:
                resultado = n1 * n2;
                System.out.println("El resultado de la multiplicación es: " + resultado);
                break;
            case 4:
                resultado = n1 / n2;
                System.out.println("El resultado de la división es: " + resultado);
                break;
            default:
                System.out.println("Operación no válida");
                break;
        }

        sc.close();
    }
}


// Solicita al usuario que ingrese dos números y almacena estos valores en variables previamente declaradas.

// Declara una variable para almacenar el resultado de la operación. 

// Permite al usuario elegir qué operación quiere realizar.

// Muestra el resultado de la operación en la consola.