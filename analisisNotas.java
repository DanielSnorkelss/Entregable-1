package U4;
/**
 * La clase analisisNotas contiene un programa que:
 *   Busca el número mayor en un array
 *   Verifica si ese número mayor se repite
 *   Calcula el promedio de los valores
 *   Evalua si el promedio es bueno o malo
 */

public class analisisNotas {

    public static void main(String[] args) {
    	// array que almacena los numeros
        int[] notas = {5, 7, 3, 7, 2, 9, 7};
        // almacena el numero mas alto del array
        int notaAlta = obtenerNotaAlta(notas); 
        //contador que almacena el numero de repeticiones del numero mas alto
        int numRepeticiones = contarRepeticiones(notas, notaAlta);
        // calcula la media de todas los numeros del array
        double media = calcularMedia(notas);

        
        // comprueba si se repite el numero mas alto
        if (numRepeticiones > 1) {
            System.out.println("SI, se repite la nota mas alta");
        } else {
            System.out.println("NO, no se repite la nota mas alta");
        }
        //Imprime la media de las notas
        System.out.println("Media: " + media);
        
        // comprueba si la media es mayor que 5
        if (media >= 5) {
            System.out.println("BIEN, la media es superior a 5");
        } else {
            System.out.println("MAL, la media es inferior a 5");
        }
}
	
	/**
	 * Obtiene la nota más alta de un array de enteros.
	 *
	 * @param notas array que contiene las notas
	 * @return la nota más alta encontrada
	 */
	public static int obtenerNotaAlta(int[] notas) {
	    int notaAlta = notas[0];
	    for (int i = 1; i < notas.length; i++) {
	        if (notas[i] > notaAlta) {
	            notaAlta = notas[i];
	        }
	    }
	    return notaAlta;
	}
	
	/**
	 * Cuenta cuántas veces se repite una nota en el array.
	 *
	 * @param notas array de notas
	 * @param nota nota a comprobar
	 * @return número de repeticiones de la nota
	 */
	public static int contarRepeticiones(int[] notas, int nota) {
	    int contador = 0;
	    for (int i = 0; i < notas.length; i++) {
	        if (notas[i] == nota) {
	            contador++;
	        }
	    }
	    return contador;
	}
	
	/**
	 * Calcula la media de las notas de un array.
	 *
	 * @param notas array que contiene las notas
	 * @return media de las notas
	 */
	public static double calcularMedia(int[] notas) {
	    int suma = 0;
	    for (int i = 0; i < notas.length; i++) {
	        suma += notas[i];
	    }
	    return (double) suma / notas.length;
	}
}
