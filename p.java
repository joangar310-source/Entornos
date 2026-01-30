package entornos;
/**
 * Programa que analiza un conjunto de números.
 * 
 * Realiza las siguientes operaciones:
 * 1. Busca el número mayor del array.
 * 2. Comprueba si el número mayor se repite.
 * 3. Calcula la media de los números.
 * 4. Muestra por pantalla si está aprobado o no.
 */
public class p {
	/**
     * Método principal del programa.
     * Aquí se ejecuta todo el código.
     */

    public static void main(String[] args) {
    	//Array
        int[] n = {5, 7, 3, 7, 2, 9, 7};
        int a = 0;
        int b = 0;
        int c = n[0];
     // Bucle que busca el número más alto del array
        for (int i = 1; i < n.length; i++) {
            if (n[i] > c) {
                c = n[i];
            }
        }
     // Bucle que cuenta cuántas veces se repite el número mayor        for (int i = 0; i < n.length; i++) {
            if (n[i] == c) {
                a++;
            }
        
         // Indica si el número mayor se repite o no
        if (a > 1) {
            b = 1;
        }

        if (b == 1) {
            System.out.println("SI");
        } else {
            System.out.println("NO");
        }

        int s = 0;
        for (int i = 0; i < n.length; i++) {
            s += n[i];
        }
        // cálculo correcto de la media
        double r = (double) s / n.length;
        System.out.println(r);

        if (r >= 5) {
            System.out.println("BIEN");
        } else {
            System.out.println("MAL");
        }
    }
}

