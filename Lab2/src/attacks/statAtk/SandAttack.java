package src.attacks.statAtk;

import ru.ifmo.se.pokemon.*;

public class SandAttack extends StatusMove{
    public SandAttack() {
        super(Type.GROUND, 0, 100);
    }

    @Override
    protected void applyOppEffects(Pokemon pokemon){
        pokemon.setMod(Stat.ACCURACY, -1);
    }

    @Override
    protected String describe() {
        return "uses Sand Attack";
    }
}
