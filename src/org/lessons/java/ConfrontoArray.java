package org.lessons.java;

import java.util.Arrays;
import java.util.Random;

public class ConfrontoArray {
    /*
    Snack 4 (Bonus)
    Crea due array che hanno un numero di elementi diversi. Mostra a video dei nuovi elementi random finchè
    il numero di elementi presenti nell’array che ne ha di meno + quelli mostrati a video non è uguale al numero
    di elementi presenti nell’array che ne ha di più
     */
    public static void main(String[] args) {
        int[] array1 = {5, 7, 3, 9, 2, 4};
        int[] array2 = {1, 8, 4, 6};

        int differenza = Math.abs(array1.length - array2.length);

        System.out.println("Array 1: " + Arrays.toString(array1));
        System.out.println("Array 2: " + Arrays.toString(array2));
        System.out.println("Numero di elementi da aggiungere: " + differenza);
        System.out.println();

        Random random = new Random();
        int conteggia = 0;

        while (conteggia  < differenza) {
            int nuovoElemento = random.nextInt(50);

            if (array1.length < array2.length) {
                array1 = Arrays.copyOf(array1, array1.length + 1);
                array1[array1.length - 1] = nuovoElemento;
            } else {
                array2 = Arrays.copyOf(array2, array2.length + 1);
                array2[array2.length - 1] = nuovoElemento;
            }
            System.out.println("Nuovo elemento ramdon: " + nuovoElemento);
            conteggia ++;
        }

        System.out.println("Array 1: " + Arrays.toString(array1));
        System.out.println("Array 2: " + Arrays.toString(array2));

    }
}
