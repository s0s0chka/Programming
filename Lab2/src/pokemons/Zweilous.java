package src.pokemons;

import ru.ifmo.se.pokemon.*;

import src.attacks.physAtk.DoubleHit;

public class Zweilous extends Deino {

    protected PhysicalMove doubleHit = new DoubleHit();

    public Zweilous(String name, int lvl) {
        super(name, lvl);

        this.setStats(72, 85, 70, 65, 70, 58);

        this.addMove(doubleHit);

        this.setMove(slam, crunch, doubleHit);
    }
}
