// Actividad: Selección de Opción
// En esta actividad, vas a desarrollar un programa que mostrará un menú con las siguientes opciones:
// Opción 1: "Guardar"
// Opción 2: "Cargar"
// Opción 3: "Salir"
// El programa solicitará al usuario que ingrese un número del 1 al 3 para seleccionar una opción. 
// Utilizarás la estructura "switch" para implementar este programa y mostrar en pantalla el mensaje correspondiente a la opción seleccionada.

import java.util.Scanner;

public class SwitchOpciones {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("\n--------------------");
        System.out.println("Menú de Opciones");
        System.out.println("1. Guardar");
        System.out.println("2. Cargar");
        System.out.println("3. Salir");
        System.out.println("--------------------");

        System.out.print("Ingrese un número del 1 al 3: ");
        int opcion = scanner.nextInt();

        // Switch Expression
        switch(opcion) {
            case 1 -> System.out.println("Guardar");
            case 2 -> System.out.println("Cargar");
            case 3 -> System.out.println("Salir");
            default -> System.out.println("Opción no válida");
        }

        scanner.close();
    }
}
