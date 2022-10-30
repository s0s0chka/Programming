package org.itmo.pokemons;

import org.itmo.attacks.physAtk.DoubleHit;

public class Zweilous extends Deino {

    public Zweilous(String name, int lvl) {
        super(name, lvl);
        this.setStats(72, 85, 70, 65, 70, 58);
        this.addMove(new DoubleHit());
    }
}
