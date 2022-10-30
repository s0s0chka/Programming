package org.itmo.src.attacks.statAtk;

import ru.ifmo.se.pokemon.*;

public class Haze extends StatusMove{
    public Haze() {
        super(Type.ICE, 0, 100);
    }

    @Override
    protected void applySelfEffects(Pokemon pokemon){

        System.out.println(pokemon.getStat(Stat.ATTACK));
        pokemon.setMod(Stat.ATTACK, -1);
        System.out.println(pokemon.getStat(Stat.ATTACK));
        pokemon.setMod(Stat.ATTACK, -1);
        System.out.println(pokemon.getStat(Stat.ATTACK));
        pokemon.setMod(Stat.ATTACK, 0);
        System.out.println(pokemon.getStat(Stat.ATTACK));
    }

    @Override
    protected String describe() {
        return "uses Haze";
    }
}
