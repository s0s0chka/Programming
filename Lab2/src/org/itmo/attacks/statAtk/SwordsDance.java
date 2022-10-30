package org.itmo.attacks.statAtk;

import ru.ifmo.se.pokemon.*;

public class SwordsDance extends StatusMove{
    public SwordsDance() {
        super(Type.NORMAL, 0, 100);
    }

    @Override 
    protected void applySelfEffects(Pokemon pokemon) {
        pokemon.setMod(Stat.ATTACK, 2);
    }

    @Override
    protected String describe() {
        return "uses Swords Dance";
    }
}
