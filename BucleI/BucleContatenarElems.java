// Actividad: Concatenando elementos
// Crea un array del tamaño que prefieras que contenga elementos de tipo cadena. Luego, concatena los elementos en una sola cadena, separados por espacios, e imprime el resultado por consola.

public class BucleContatenarElems {
    public static void main(String[] args) {
        String[] palabras = {"Hola", "mundo", "desde", "Java", "!"};

        String concatenacion = "";

        for(String palabra : palabras) {
            concatenacion += palabra + " ";
        }   

        System.out.println("\nLa concatenación de las palabras es: " + concatenacion);
    }
}
