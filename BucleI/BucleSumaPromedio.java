// Actividad: Calculando el promedio 
// Genera un array de 20 elementos de tipo float, inicializándolo con los números de tu elección. Luego, suma todos los elementos del array y calcula su promedio. Finalmente, muestra por consola tanto el resultado de la suma como el promedio de los elementos.Te sugerimos implementar el uso de la sintaxis de for-each.

public class BucleSumaPromedio {
    public static void main(String[] args) {
        int[] numeros = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20};

        int suma = 0;

        for(int numero: numeros) {
            suma += numero;
        }

        System.out.println("\nLa suma de los números es: " + suma);
    }
}
