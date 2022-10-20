package src.pokemons;

import ru.ifmo.se.pokemon.*;

import src.attacks.statAtk.Confide;

public class Hydreigon extends Zweilous {

    protected StatusMove confide = new Confide();

    public Hydreigon(String name, int lvl) {
        super(name, lvl);

        this.setStats(92, 105, 90, 125, 90, 98);

        this.addMove(confide);

        this.setMove(slam, crunch, doubleHit, confide);
    }
}