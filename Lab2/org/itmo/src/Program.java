package org.itmo.src;

import org.itmo.src.pokemons.*;

import ru.ifmo.se.pokemon.*;

public class Program{
    public static void main(String[] args){
        Battle b = new Battle();

        // Pokemon t1p1 = new Deino("Leolix", 32);
        // Pokemon t1p2 = new Cosmog("Warmadillo", 32);
        // Pokemon t1p3 = new Hydreigon("Alligite", 32);

        // Pokemon t2p1 = new Zweilous("Lemeo", 32);
        // Pokemon t2p2 = new Rockruff("Echound", 32);
        // Pokemon t2p3 = new Lycanroc("Megybara", 32);

        // b.addAlly(t1p1);
        // b.addAlly(t1p2);
        // b.addAlly(t1p3);

        // b.addFoe(t2p1);
        // b.addFoe(t2p2);
        // b.addFoe(t2p3);

        Pokemon test1 = new Cosmog("1", 32);
        Pokemon test2 = new Deino("2", 32);

        b.addAlly(test1);
        b.addFoe(test2);

        b.go();
    }
}