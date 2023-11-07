package com.example;

import java.util.Scanner;

public class App {
    
    public static void main(String[] args) {
        Scanner clavier = new Scanner(System.in);
        System.out.println("Combien y a t'il d'articles ?");
        int nbArticles = clavier.nextInt();
        int total = 0;
        for (int i = 1; i <= nbArticles; i++) {
            System.out.println("Définir le prix " + i +" :");
            int prixarticle = clavier.nextInt();
            total = prixarticle + total;
        }
        System.out.println("Votre total est : " + total + ".");
        clavier.close();
    }
}