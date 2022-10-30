package org.itmo.pokemons;

import org.itmo.attacks.statAtk.Confide;

public class Hydreigon extends Zweilous {

    public Hydreigon(String name, int lvl) {
        super(name, lvl);
        this.setStats(92, 105, 90, 125, 90, 98);
        this.addMove(new Confide());
    }
}