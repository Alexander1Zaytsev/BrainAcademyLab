package com.brainacad.lab2_13_4;

/**
 * Created by Alex on 10/7/2016.
 */
public class Main {

    public static void main(String[] args) {

        Card[] deckOfCards = new Card[52];

        int i = 0;
        for (Suit suit:Suit.values()){
            for (Rank rank:Rank.values()){
                deckOfCards[i] = new Card(suit,rank);
                i++;
            }
        }

        for (Card element:deckOfCards){
            System.out.println(element);
        }

    }
}
