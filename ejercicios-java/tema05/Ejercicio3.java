/*
 * Muestra los números múltiplos de 5 de 0 a 100 utilizando un bucle do-while.
*/
public class Ejercicio3 {
    public static void main(String[] args) {
        int n = 0;
        System.out.println("A continuación voy a mostrar los multimplos de 5 del  al 100: ");
        do {
            System.out.println(n);
            n += 5;
        } while (n <= 100);
    }
}
