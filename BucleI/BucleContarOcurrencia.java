// Contar ocurrencias
// Escribe un programa que cree un array de 50 elementos de tipo carácter, inicializándolo con una frase elegida. Luego, solicita al usuario un carácter objetivo y cuenta cuántas veces aparece ese carácter en el array. Finalmente, imprime el resultado por consola.
// Por ejemplo, si el array contiene la siguiente frase:
// a	p	r	e	n	d	i	e	n	d	o		j	a	v	a
// y el usuario ingresa el carácter 'd', el programa debería devolver la siguiente salida:
// El carácter "d" aparece 2 veces.
// Si el usuario ingresa el carácter 'z', el programa debería devolver la siguiente salida:
// El carácter "z" no aparece en la frase.

public class BucleContarOcurrencia {
    public static void main(String[] args) {
        char[] frase = {'a', 'p', 'r', 'e', 'n', 'd', 'i', 'e', 'n', 'd', 'o', ' ' ,'j', 'a', 'v', 'a'};
        char objetivo = 'd';
        int contador = 0;

        for(char letra : frase) {
            if(letra == objetivo) {
                contador++;
            }
        }

        if(contador > 0) {
            System.out.println("\nEl carácter \"" + objetivo + "\" aparece " + contador + " veces.");
        } else {
            System.out.println("\nEl carácter \"" + objetivo + "\" no aparece en la frase.");
        }
    }
}
