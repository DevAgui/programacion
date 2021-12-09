/*
 * Muestra 50 números enteros aleatorios entre 100 y 199 (ambos incluidos)
 * separados por espacios. Muestra también el máximo, el mínimo y la media
 * de esos números.
 * 
 * Author Francisco Sicilia
*/
public class Ejercicio5 {
    public static void main(String[] args) {
        int media = 0;
        int max = 0;
        int nMedia = 0;
        for (int i = 0; i < 50; i++) {
            int numAl = (int)((Math.random()*100) + 100);
            System.out.print("" + numAl + " ");
            media += numAl;
            max = numAl;
            if (numAl > max){
                max = numAl;
            }
        }
        nMedia = media / 50;
        System.out.println("\nLa media de los números introducido es "+nMedia);
        System.out.println("Hola "+max);
    }
}
