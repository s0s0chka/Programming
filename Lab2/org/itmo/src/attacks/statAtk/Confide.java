package org.itmo.src.attacks.statAtk;

import ru.ifmo.se.pokemon.*;

public class Confide extends StatusMove{
    public Confide(){
        super(Type.NORMAL, 0, 100);
    }

    @Override
    protected void applyOppEffects(Pokemon pokemon){
        pokemon.setMod(Stat.ATTACK, -1);
    }

    @Override
    protected String describe(){
        return "uses Cofide";
    }
}
