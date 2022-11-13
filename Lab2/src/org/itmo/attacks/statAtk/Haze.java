package org.itmo.attacks.statAtk;

import ru.ifmo.se.pokemon.*;

public class Haze extends StatusMove{
    public Haze() {
        super(Type.ICE, 0, 100);
    }

    @Override
    protected void applySelfEffects(Pokemon pokemon){
        for(Stat stat : Stat.values()){
            pokemon.setMod(stat, 12);
            pokemon.setMod(stat, -6);
        }
    }

    @Override
    protected String describe() {
        return "uses Haze";
    }
}
