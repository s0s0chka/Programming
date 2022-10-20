package src;

import ru.ifmo.se.pokemon.*;
import src.pokemons.*;

public class Program{
    public static void main(String[] args){
        Battle b = new Battle();

        Pokemon t1p1 = new Deino("Leolix", 32);
        Pokemon t1p2 = new Hydreigon("Warmadillo", 32);
        Pokemon t1p3 = new Cosmog("Alligite", 32);

        Pokemon t2p1 = new Zweilous("Lemeo", 32);
        Pokemon t2p2 = new Rockruff("Echound", 32);
        Pokemon t2p3 = new Lycanroc("Megybara", 32);

        b.addAlly(t1p1);
        b.addAlly(t1p2);
        b.addAlly(t1p3);

        b.addFoe(t2p1);
        b.addFoe(t2p2);
        b.addFoe(t2p3);

        b.go();
    }
}