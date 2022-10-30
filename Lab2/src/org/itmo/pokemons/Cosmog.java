package org.itmo.pokemons;

import org.itmo.attacks.specAtk.Blizzard;
import org.itmo.attacks.specAtk.Scald;
import org.itmo.attacks.statAtk.Haze;
import org.itmo.attacks.statAtk.Swagger;

import ru.ifmo.se.pokemon.*;

public class Cosmog extends Pokemon {

    public Cosmog(String name, int lvl) {
        super(name, lvl);
        
        this.setStats(43, 29, 31, 29, 31, 37);
        this.setType(Type.PSYCHIC);
        
        this.setMove(new Swagger(), new Scald(), new Blizzard(), new Haze());
    }
}