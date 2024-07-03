// Actividad: Ejercicio de Días de la Semana
// En esta actividad, escribirás un programa que solicite al usuario ingresar un número del 1 al 7, que representará un día de la semana. Luego, el programa mostrará en pantalla el nombre correspondiente a ese día. Utilizaremos la estructura "switch" para implementar este programa.

import java.util.Scanner;

public class SwitchDiasSemana {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("\nIngrese un número del 1 al 7: ");
        int numeroDia = sc.nextInt();

        // Con Swtich Statement
        // switch(numeroDia) {
        //     case 1:
        //         System.out.println("Lunes");
        //         break;
        //     case 2:
        //         System.out.println("Martes");
        //         break;
        //     case 3:
        //         System.out.println("Miercoles");
        //         break;
        //     case 4:
        //         System.out.println("Jueves");
        //         break;
        //     case 5:
        //         System.out.println("Viernes");
        //         break;
        //     case 6:
        //         System.out.println("Sabado");
        //         break;
        //     case 7:
        //         System.out.println("Domingo");
        //         break;
        //     default:
        //         System.out.println("Día no válido");
        //     break;
        // }

        // Con Switch Expressions
        switch(numeroDia) {
            case 1 -> System.out.println("Lunes");
            case 2 -> System.out.println("Martes");
            case 3 -> System.out.println("Miercoles");
            case 4 -> System.out.println("Jueves");
            case 5 -> System.out.println("Viernes");
            case 6 -> System.out.println("Sabado");
            case 7 -> System.out.println("Domingo");
            default -> System.out.println("Día no válido");
        }


        sc.close();
    }
}
