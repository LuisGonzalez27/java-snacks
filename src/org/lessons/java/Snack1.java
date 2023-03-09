package org.lessons.java;

import java.util.Scanner;

public class Snack1 {
    public static void main(String[] args) {
        /*
        Inserisci un numero, se è pari stampa il numero, se è dispari stampa il numero successivo.
         */
        Scanner scan = new Scanner(System.in);

        System.out.print("Inserisci un numero: ");
        int numeroInserito = scan.nextInt();

        if (numeroInserito % 2 == 0) {
            System.out.println("Il numero inserito è pari: " + numeroInserito);
        } else {
            System.out.println("Il numero inserito è dispari: " + numeroInserito);
            System.out.println("Il numero successivo è: " + (numeroInserito + 1));
        }

        scan.close();

    }
}
