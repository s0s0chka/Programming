package src.pokemons;

import ru.ifmo.se.pokemon.*;

import src.attacks.physAtk.Slam;
import src.attacks.physAtk.Crunch;

public class Deino extends Pokemon {
    
    protected PhysicalMove slam = new Slam();
    protected PhysicalMove crunch = new Crunch();

    public Deino(String name, int lvl) {
        super(name, lvl);
        
        this.setStats(52, 65, 50, 45, 50, 38);
        this.setType(Type.DARK, Type.DRAGON);

        this.addMove(slam);
        this.addMove(crunch);

        this.setMove(slam, crunch);
    }
}
