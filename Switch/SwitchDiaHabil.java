// Verificación de Día Hábil
// En este ejercicio, crearás un programa que pedirá al usuario ingresar un número del 1 al 7, representando un día de la semana. El programa determinará si ese día es hábil o no. Se mostrará el resultado en pantalla. Se considera que los días hábiles son del 1 al 5 (de lunes a viernes). Utilizaremos la estructura "switch" para implementar este programa. ( Ten en cuenta que los días hábiles son del 1 al 5 (de lunes a viernes).)

import java.util.Scanner;

public class SwitchDiaHabil {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Ingrese un número del 1 al 7 para determinar si es un día hábil: ");
        int numDia = sc.nextInt();

        // Con Switch Expression
        switch(numDia) {
            case 1, 2, 3, 4, 5 -> System.out.println("Día hábil");
            case 6, 7 -> System.out.println("Día no hábil");
            default -> System.out.println("Día no válido");
        }

        sc.close();
    }
}
