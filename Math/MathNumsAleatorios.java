// Actividad: Generando números aleatorios
// Escribe un programa que genere y muestre en pantalla un número aleatorio en el rango del 1 al 355  utilizando el método random() de la clase Math. Puedes utilizar el método floor() para redondear el número aleatorio hacia abajo.

public class MathNumsAleatorios {
    public static void main(String[] args) {
        System.out.println("\n---------------");
        double numeroRedondeado = Math.floor((1 + Math.random() * 355));
        System.out.println("Numero Aleatorio: " + numeroRedondeado);
        System.out.println("---------------");
    }
}
