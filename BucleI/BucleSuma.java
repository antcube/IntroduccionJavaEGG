// Calcular suma acumulada:
// Escribe un programa que recorra un array de enteros y  calcule la suma acumulada de los elementos, reemplazando cada elemento por la suma acumulada hasta ese punto.El tamaño y los números  a contener pueden ser de tu elección.

public class BucleSuma {
    public static void main(String[] args) {
        int[] numeros = {10, 20, 30};

        int suma = 0;

        for(int i = 0; i < numeros.length; i++) {
            suma += numeros[i];
        }
        
        System.out.println("\nLa suma total es: " + suma);
    }
}
