// Actividad: Contando Elementos Pares
// Escribe un programa que genere un array de 10 elementos de tipo entero. Inicializa cada elemento con un número aleatorio menor a 100 y luego imprime todos los elementos del array en una única línea. Posteriormente, recorre el array para contar los elementos pares y muestra el total en la consola.

public class BucleContPares {
    public static void main(String[] args) {
        int[] numeros = new int[10];

        for(int i = 0; i < numeros.length; i++) {
            numeros[i] = (int) (Math.random() * 100) + 1;
            System.out.print(numeros[i] + ", ");
        }

        int pares = 0;

        for(int i = 0; i < numeros.length; i++) {
            if(numeros[i] % 2 == 0) {
                pares++;
            }
        }

        System.out.println("\nTotal de elementos pares: " + pares);
    }
}
