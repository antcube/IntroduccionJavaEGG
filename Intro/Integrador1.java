// Actividad: Conversión de unidades de temperatura
// Escribe un programa que cumpla con las siguientes condiciones:
// 1. Solicita al usuario ingresar una temperatura y una unidad de medida: Celsius (C) o Fahrenheit (F).
// 2. Convierte la temperatura a la otra unidad de medida y muestra el resultado en pantalla.
// 3. El programa debe manejar al menos las siguientes situaciones:
// Si ingresa una unidad de medida inválida, mostrará un mensaje de error.
// Si ingresa una temperatura no válida, mostrará un mensaje de error.

// Actividad:Validación de contraseña
// Escribe un programa que solicite al usuario que ingrese una contraseña y verifique si cumple con los siguientes criterios para considerarse segura:
// La contraseña debe tener al menos 8 caracteres.
// La contraseña debe contener al menos una letra mayúscula y una letra minúscula.
// La contraseña debe contener al menos un número.
// La contraseña debe contener al menos un carácter especial (por ejemplo, !, @, #, $).
// El programa debe mostrar un mensaje indicando si la contraseña es segura o no, según los criterios establecidos. Puedes utilizar métodos de la clase String para verificar cada uno de los criterios.


import java.util.InputMismatchException;
import java.util.Scanner;

public class Integrador1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        validacionPass(sc);
        
        sc.close();
    }

    public static void conversionTemp(Scanner sc) {
        System.out.println("\nConversión de unidades de temperatura");

        try {
            System.out.print("Ingrese la temperatura: ");
            double temp = sc.nextDouble();

            System.out.print("Ingrese la unidad de medida (C o F): ");
            String unidad = sc.next();

            if (unidad.equalsIgnoreCase("C")) {
                double fahrenheit = (temp * 9/5) + 32;
                System.out.println(temp + "° Fahrenheit equivale a " + fahrenheit + "° Celsius");
            } else if (unidad.equalsIgnoreCase("F")) {
                double celsius = (temp - 32) * 5/9;
                System.out.println(temp + "° Celsius equivale a " + celsius + "° Fahrenheit");
            } else {
                System.out.println("Unidad de medida inválida, el programa solo acepta C o F.");
            }
        } catch (InputMismatchException e) {
            System.out.println("Temperatura no válida. \nError: " + e.getMessage());
        }
    }

    public static void validacionPass(Scanner sc) {
        System.out.println("\nValidación de contraseña");

        System.out.print("Ingrese una contraseña: ");
        String pass = sc.next();

        if (pass.length() >= 8 && 
            pass.matches(".*[A-Z].*") && 
            pass.matches(".*[a-z].*") && 
            pass.matches(".*\\d.*") && 
            pass.matches(".*\\W.*")) { // hol@Mundo1
            System.out.println("¡La contraseña es segura! Cumple con todos los criterios.");
        } else {
            System.out.println("Contraseña no segura. Debe tener al menos una letra mayúscula, una letra minúscula, un número y un carácter especial. Además, debe tener al menos 8 caracteres.");
        }
    }
}
