package org.itmo.src.attacks.statAtk;

import ru.ifmo.se.pokemon.*;

public class Rest extends StatusMove{
    public Rest() {
        super(Type.PSYCHIC, 0, 100);
    }

    @Override
    protected void applySelfEffects(Pokemon pokemon) {
        pokemon.restore();
        pokemon.addEffect(new Effect().condition(Status.SLEEP).turns(2));
    }

    @Override
    protected String describe() {
        return "uses Rest";
    }
}
