package org.itmo.src.pokemons;

import org.itmo.src.attacks.physAtk.Crunch;
import org.itmo.src.attacks.physAtk.Slam;

import ru.ifmo.se.pokemon.*;

public class Deino extends Pokemon {

    public Deino(String name, int lvl) {
        super(name, lvl);
        this.setStats(52, 65, 50, 45, 50, 38);
        this.setType(Type.DARK, Type.DRAGON);
        this.addMove(new Slam());
        this.addMove(new Crunch());
    }
}
