package org.itmo.attacks.statAtk;

import ru.ifmo.se.pokemon.*;

public class Haze extends StatusMove{
    public Haze() {
        super(Type.ICE, 0, 100);
    }

    @Override
    protected void applySelfEffects(Pokemon pokemon){
        for(Stat stat : Stat.values()){
            Effect effect = new Effect().stat(stat, +12);
            pokemon.addEffect(effect);
            effect = new Effect().stat(stat, -6);
            pokemon.addEffect(effect);
        }
    }

    @Override
    protected String describe() {
        return "uses Haze";
    }
}
