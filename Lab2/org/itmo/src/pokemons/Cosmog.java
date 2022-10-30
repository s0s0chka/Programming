package org.itmo.src.pokemons;

import org.itmo.src.attacks.specAtk.Blizzard;
import org.itmo.src.attacks.specAtk.Scald;
import org.itmo.src.attacks.statAtk.Haze;
import org.itmo.src.attacks.statAtk.Swagger;

import ru.ifmo.se.pokemon.*;

public class Cosmog extends Pokemon {

    public Cosmog(String name, int lvl) {
        super(name, lvl);
        
        this.setStats(43, 29, 31, 29, 31, 37);
        this.setType(Type.PSYCHIC);
        
        // this.addMove(new Swagger());
        // this.addMove(new Scald());
        // this.addMove(new Blizzard());
        this.setMove(new Haze());
    }
}