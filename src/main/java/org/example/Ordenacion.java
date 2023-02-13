package org.example;
/**
 * Esta clase contiene métodos para la ordenación
 *
 * @author Noelia del Carmen Gonzalez Pardo
 * @version 1.0
 * @see Ordenacion
 */

/* HE MODIFICADO EL CÓDIGO CON ESTA LINEA */

    /* CAMBIO NUMERO 1 */
public class Ordenacion {
    /**
     * Método constructor que crea un array de int y lo va recorriendo con bucles for para ordenarlo y muestra por pantalla
     *
     * @param array es el array que quieres ordenador
     */
    public void ordenarArray(int[] array) {
        for (int i = array.length - 1; i > 0; i--) {
            int maxValue = 0;
            for (int j = 0; j < i; j++) {
                if (array[j + 1] > array[maxValue]) {
                    maxValue = j + 1;
                }
            }
            intercambio(array, i, maxValue);
            imprimirArray(array);
        }
    }
    /* CAMBIO NUMERO 2*/
    /**
     * Método constructor que crea un array de int y lo va recorriendo con bucles for para ordenarlo y dentro tiene otro bucle para volver a ordenarlo.
     *
     * @param numbers es el array que hay que ordenar
     * @return el array de numeros ordenadors
     */
    public int[] ordenarArray2(int[] numbers) {
        for (int i = 0; i < numbers.length - 1; i++) {
            for (int j = i + 1; j < numbers.length; j++) {
                if (numbers[i] > numbers[j]) {
                    int auxiliar = numbers[i];
                    numbers[i] = numbers[j];
                    numbers[j] = auxiliar;
                }
            }
        }
        return numbers;
    }
    /* CAMBIO NUMERO 3*/
    /**
     * Método constructor que crea un array de int y lo va recorriendo con bucles for para mostrarlo por pantalla
     *
     * @param array es el array que hay que ordenar
     */
    public void imprimirArray(int[] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.printf("%d \t", array[i]);
        }
        System.out.println();
    }
    /**
     * * Método constructor que se pasa los siguientes valores, un array, un valor a y un valor b y intercambia las posiciones de a y b para poder ordenar el array.
     *
     * @param array es el array que intercambiar las posiciones
     * @param a     es una de las posiciones de las dos posiciones que se quieren intercambiar
     * @param b     es una de las posiciones de las dos posiciones que se quieren intercambiar
     */
    public void intercambio(int[] array, int a, int b) {
        int value = array[b];
        array[b] = array[a];
        array[a] = value;
    }
}
