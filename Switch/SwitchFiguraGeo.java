// Actividad: Selección de Figura Geométrica
// Mediante una estructura switch, desarrollarás un programa que pida al usuario ingresar un número del 1 al 3 para seleccionar una figura geométrica: 1 para círculo, 2 para cuadrado y 3 para triángulo. Después, solicitará al usuario los datos necesarios para calcular el área de la figura seleccionada. Estos datos serán:
// Para el círculo: el radio.
// Para el cuadrado: el lado.
// Para el triángulo: la base y la altura.
// Finalmente, el programa mostrará en pantalla el área correspondiente a la figura seleccionada.

import java.util.Locale;
import java.util.Scanner;

public class SwitchFiguraGeo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Cambiar localidad para decimales
        sc.useLocale(Locale.US);

        System.out.println("\n--------------------");
        System.out.println("Menú de Figuras Geométricas");
        System.out.println("1. Círculo");
        System.out.println("2. Cuadrado");
        System.out.println("3. Triángulo");
        System.out.println("--------------------");

        System.out.print("Ingrese un número del 1 al 3 para calcular el area: ");    
        int figura = sc.nextInt();

        // Switch Expression
        double area = switch(figura) {
            case 1 -> {
                System.out.print("Ingrese el radio del círculo: ");
                double radio = sc.nextDouble();
                yield Math.PI * Math.pow(radio, 2); // Math.PI * radio * radio;
            }
            case 2 -> {   
                System.out.print("Ingrese el lado del cuadrado: ");
                double lado = sc.nextDouble();
                yield Math.pow(lado, 2); // lado * lado;
            }
            case 3 -> {
                System.out.print("Ingrese la base del triángulo: ");
                double base = sc.nextDouble();
                System.out.print("Ingrese la altura del triángulo: ");
                double altura = sc.nextDouble();
                yield (base * altura) / 2;
            }
            default -> {
                System.out.println("Opción no válida");
                yield 0;
            }
        };

        System.out.println("El área de la figura seleccionada es: " + area + " m²");

        sc.close();
    }
}
