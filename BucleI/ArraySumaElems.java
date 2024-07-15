// Actividad: Sumando elementos
// Escribe un programa en el cual se cree una variable de tipo array que contenga tres elementos de tipo entero. El programa debe sumar los tres elementos de forma manual e imprimir por consola el resultado utilizando solamente las herramientas adquiridas hasta el momento.

public class ArraySumaElems {
    public static void main(String[] args) {
        int[] numeros = new int[3];

        numeros[0] = 10;
        numeros[1] = 20;
        numeros[2] = 30;

        int sumaElementos = numeros[0] + numeros[1] + numeros[2];

        System.out.println("\nLa suma de los elementos es: " + sumaElementos);
    }
}
