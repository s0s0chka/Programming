package src.pokemons;

import ru.ifmo.se.pokemon.*;

import src.attacks.statAtk.SwordsDance;

public class Lycanroc extends Rockruff {

    protected StatusMove swordsDance = new SwordsDance();

    public Lycanroc(String name, int lvl) {
        super(name, lvl);
        
        this.setStats(75, 115, 65, 55, 65, 112);

        this.addMove(swordsDance);

        this.setMove(sandAttack, snarl, rest, swordsDance);
    }
}