package com.brainacad.lab2_13_4;

/**
 * Created by Alex on 10/7/2016.
 */
public class Card {

    private Suit cardSuit;
    private Rank cardRank;

    public Card(Suit cardSuit, Rank cardRank) {
        this.cardSuit = cardSuit;
        this.cardRank = cardRank;
    }

    @Override
    public String toString(){
        return "the Card:" + cardRank + "_" + cardSuit;
    }

}
