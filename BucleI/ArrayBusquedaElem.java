// Actividad: Buscando un elemento
// El programa debe crear un array de tamaño 3 que almacene números enteros. Luego, solicita un número al usuario y muestra por consola si ese número está presente en el array o no. Es importante utilizar únicamente las herramientas aprendidas hasta el momento, sin emplear bucles en el proceso.

import java.util.Scanner;

public class ArrayBusquedaElem {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int[] numeros = {10, 20, 30};

        System.out.print("Ingrese un numero para la busqueda: ");
        int busqueda = sc.nextInt();

        if(busqueda == numeros[0] || busqueda == numeros[1] || busqueda == numeros[2]) {
            System.out.println("El numero " + busqueda + " esta presente en el array");
        } else {
            System.out.println("El numero ingresado no se encuentra en el array");
        }

        sc.close();
    }
}
