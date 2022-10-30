package org.itmo.attacks.specAtk;

import ru.ifmo.se.pokemon.*;

public class Blizzard extends SpecialMove{
    public Blizzard(){
        super(Type.ICE, 110, 70);
    }

    @Override
    protected void applyOppEffects(Pokemon pokemon){
        pokemon.addEffect(new Effect().chance(0.1).condition(Status.FREEZE));
    }

    @Override
    protected String describe() {
        return "uses Blizzard";
    }
}
