package org.itmo.src.pokemons;

import org.itmo.src.attacks.specAtk.Snarl;
import org.itmo.src.attacks.statAtk.Rest;
import org.itmo.src.attacks.statAtk.SandAttack;

import ru.ifmo.se.pokemon.*;

public class Rockruff extends Pokemon {

    public Rockruff(String name, int lvl) {
        super(name, lvl);
        
        this.setStats(45, 65, 40, 30, 40, 60);
        this.setType(Type.ROCK);

        this.addMove(new SandAttack());
        this.addMove(new Snarl());
        this.addMove(new Rest());
    }
}