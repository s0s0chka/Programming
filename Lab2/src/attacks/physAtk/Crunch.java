package src.attacks.physAtk;

import ru.ifmo.se.pokemon.*;

public class Crunch extends PhysicalMove{
    
    public Crunch(){
        super(Type.DARK, 80, 100);
    }

    @Override
    protected void applyOppEffects(Pokemon pokemon){
        pokemon.addEffect(new Effect().chance(0.2).stat(Stat.DEFENSE, -1));
    }
    //Has to only lower defense up to a maximum of -6, how tf would you do that

    @Override
    protected String describe() {
        return "uses Crunch";
    }
}
