package org.itmo.pokemons;

import org.itmo.attacks.specAtk.Snarl;
import org.itmo.attacks.statAtk.Rest;
import org.itmo.attacks.statAtk.SandAttack;

import ru.ifmo.se.pokemon.*;

public class Rockruff extends Pokemon {

    public Rockruff(String name, int lvl) {
        super(name, lvl);
        
        this.setStats(45, 65, 40, 30, 40, 60);
        this.setType(Type.ROCK);

        this.setMove(new Snarl(), new Rest(), new SandAttack());
    }
}