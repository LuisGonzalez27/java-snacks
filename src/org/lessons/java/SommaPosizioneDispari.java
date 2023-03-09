package org.lessons.java;

public class SommaPosizioneDispari {
    public static void main(String[] args) {
        /*
        Snack 3
        Crea un array di numeri interi e fai la somma di tutti gli elementi che sono in posizione dispari.
         */

        int[] numeri = {1, 2, 3, 2, 4, 2, 5, 2, 6, 2};
        int somma = 0;

        for (int i = 1; i < numeri.length; i += 2) {
            somma += numeri[i];
        }

        System.out.println("La somma degli elementi in posizione dispari è: " + somma);

    }
}
