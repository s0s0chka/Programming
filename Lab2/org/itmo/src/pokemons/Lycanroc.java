package org.itmo.src.pokemons;

import org.itmo.src.attacks.statAtk.SwordsDance;

public class Lycanroc extends Rockruff {

    public Lycanroc(String name, int lvl) {
        super(name, lvl);
        this.setStats(75, 115, 65, 55, 65, 112);
        this.addMove(new SwordsDance());
    }
}