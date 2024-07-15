// Invertir un array
// Escribe un programa que recorra un array de enteros y lo invierta, es decir, que el primer elemento se convierta en el último y viceversa, luego imprime el array resultante por consola.  El tamaño y los números  a contener pueden ser de tu elección.
// IMPORTANTE: Debes invertir de forma permanente el orden de los elementos. Analiza si necesitas hacer uso de elementos auxiliares para concluir el ejercicio. 

public class BucleArrayInverso {
    public static void main(String[] args) {
        int[] array = {1, 2, 3, 4, 5};

        System.out.println("\nArray Inverso:");
        for(int i = array.length - 1; i >= 0; i--) {
            System.out.print(array[i] + ", ");
        }
    }
}