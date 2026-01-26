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
        //contador que almacena el numero de repeticiones del numero mas alto
        int numRepeticiones = 0; 
        // almacena el numero mas alto del array
        int notaAlta = notas[0]; 

        // recorre el array y encuentra el numero mas alto
        for (int i = 1; i < notas.length; i++) {
            if (notas[i] > notaAlta) {
                notaAlta = notas[i];
            }
        }
        // recorre el array y cuenta cuantas veces se repite el numero mas alto
        for (int i = 0; i < notas.length; i++) {
            if (notas[i] == notaAlta) {
                numRepeticiones++;
            }
        }
        
        // comprueba si se repite el numero mas alto
        if (numRepeticiones > 1) {
            System.out.println("SI, se repite la nota mas alta");
        } else {
            System.out.println("NO, no se repite la nota mas alta");
        }
        // almacena la suma de todos los numeros del array 
        int sumaNotas = 0;
        // recorre el array y suma todos los numeros
        for (int i = 0; i < notas.length; i++) {
            sumaNotas += notas[i];
        }
        // calcula la media de todas los numeros del array
        double media = (double) sumaNotas / notas.length; 
        System.out.println(media);
        // comprueba si la media es mayor que 5
        if (media >= 5) {
            System.out.println("BIEN, la media es superior a 5");
        } else {
            System.out.println("MAL, la media es inferior a 5");
        }
    }
}
