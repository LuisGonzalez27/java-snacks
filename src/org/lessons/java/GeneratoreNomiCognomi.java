package org.lessons.java;

import java.util.Random;

public class GeneratoreNomiCognomi {
    public static void main(String[] args) {
        /*
        Snack 2
        Generatore di “nomi cognomi” casuali: il Grande Gatsby ha una lista di nomi e una lista di cognomi,
        e da queste vuole mostrare a video una falsa lista di invitati con nome e cognome.
         */
        String[] nomi = {"Alessandro", "Andrea", "Angelo", "Anna", "Antonio", "Caterina", "Federica", "Laura", "Leonardo", "Lorenzo"};
        String[] cognomi = {"Rossi", "Ferrari", "Bianchi", "Esposito", "Russo", "Romano", "Ricci", "Marino", "Greco", "Bruno"};

        Random random = new Random();

        System.out.println("Lista di invitati: ");

        for (int i = 1; i <= 10; i++) {
            String nomeCasuale = nomi[random.nextInt(nomi.length)];
            String cognomeCasuale = cognomi[random.nextInt(cognomi.length)];
            String invitato = nomeCasuale + " " + cognomeCasuale;
            System.out.println(i + "-" + invitato);
        }
    }
}
