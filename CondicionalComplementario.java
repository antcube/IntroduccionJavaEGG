// Actividad: Ejercicios Complementarios
// 1. Verificación de Contraseña:
// En este ejercicio, escribirás un programa que pida al usuario una contraseña y verificará si coincide con una contraseña predefinida. Si la contraseña ingresada es correcta, se mostrará un mensaje de "Acceso concedido". En caso contrario, se mostrará un mensaje de "Acceso denegado".

// 2. Cálculo de Descuento:
// En este ejercicio, desarrollarás un programa que solicitará al usuario el precio de un producto y determinará si tiene derecho a un descuento. Si el precio es igual o mayor a $100, se aplicará un descuento del 10% y se mostrará el nuevo precio con descuento. De lo contrario, se mostrará el precio original sin descuento.

// 3. Determinación de Edades
// En este ejercicio, desarrollarás un programa que solicite al usuario su edad y determine en qué categoría se encuentra. Las categorías son las siguientes:
// Si la edad es menor de 18 años, mostrar el mensaje "Eres menor de edad".
// Si la edad está entre 18 y 64 años (inclusive), mostrar el mensaje "Eres adulto".
// Si la edad es igual o mayor a 65 años, mostrar el mensaje "Eres un adulto mayor".
// El programa deberá mostrar el mensaje correspondiente según la categoría de edad en la que se encuentre el usuario.

import java.util.Locale;
import java.util.Scanner;

public class CondicionalComplementario {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        sc.useLocale(Locale.US);

        // Ejercicio 1: Verificación de Contraseña
        // String passPredefinida = "Hola1234";

        // System.out.println("\nLOGIN");
        // System.out.println("-----------------");
        // System.out.println("Ingrese su contraseña: ");
        // String pass = sc.nextLine();

        // if(pass.equals(passPredefinida)) {
        //     System.out.println("Acceso concedido.");
        // } else {
        //     System.out.println("Acceso denegado.");
        // }
        // System.out.println("-----------------");


        // Ejercicio 2: Cálculo de Descuento
        // System.out.println("\n-----------------");
        // System.out.println("Cálculo de Descuento");
        // System.out.print("Ingrese el precio del producto: ");
        // double precio = sc.nextDouble();

        // if(precio >= 100) {
        //     double descuento = precio * 0.10;
        //     double precioConDescuento = precio - descuento;
        //     System.out.println("El precio con descuento es: $" + precioConDescuento);
        // } else {
        //     System.out.println("El precio original es: $" + precio);
        // }


        // Ejercicio 3: Determinación de Edades
        // En este ejercicio, desarrollarás un programa que solicite al usuario su edad y determine en qué categoría se encuentra. Las categorías son las siguientes:
        // Si la edad es menor de 18 años, mostrar el mensaje "Eres menor de edad".
        // Si la edad está entre 18 y 64 años (inclusive), mostrar el mensaje "Eres adulto".
        // Si la edad es igual o mayor a 65 años, mostrar el mensaje "Eres un adulto mayor".
        // El programa deberá mostrar el mensaje correspondiente según la categoría de edad en la que se encuentre el usuario.

        System.out.println("\n-----------------");
        System.out.println("Determinación de Edades");
        System.out.print("Ingrese su edad: ");
        int edad = sc.nextInt();

        if(edad >= 0 && edad < 18) {
            System.out.println("Eres menor de edad.");
        } else if(edad >= 18 && edad <= 64) {
            System.out.println("Eres adulto.");
        } else if(edad >= 65 && edad <= 120) {
            System.out.println("Eres un adulto mayor.");
        } else {
            System.out.println("Edad no válida.");
        }

        sc.close();
    }
}
