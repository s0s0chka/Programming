package org.itmo;

import org.itmo.pokemons.*;

import ru.ifmo.se.pokemon.*;

public class Program{
    public static void main(String[] args){
        Battle b = new Battle();

        Pokemon team1pokemon1 = new Deino("Leolix", 32);
        Pokemon team1pokemon2 = new Cosmog("Warmadillo", 32);
        Pokemon team1pokemon3 = new Hydreigon("Alligite", 32);

        Pokemon team2pokemon1 = new Zweilous("Lemeo", 32);
        Pokemon team2pokemon2 = new Rockruff("Echound", 32);
        Pokemon team2pokemon3 = new Lycanroc("Megybara", 32);

        b.addAlly(team1pokemon1);
        b.addAlly(team1pokemon2);
        b.addAlly(team1pokemon3);

        b.addFoe(team2pokemon1);
        b.addFoe(team2pokemon2);
        b.addFoe(team2pokemon3);

        b.go();
    }
}