package src.pokemons;

import ru.ifmo.se.pokemon.*;

import src.attacks.statAtk.SandAttack;
import src.attacks.specAtk.Snarl;
import src.attacks.statAtk.Rest;

public class Rockruff extends Pokemon {

    protected StatusMove sandAttack = new SandAttack();
    protected SpecialMove snarl = new Snarl();
    protected StatusMove rest = new Rest();

    public Rockruff(String name, int lvl) {
        super(name, lvl);
        
        this.setStats(45, 65, 40, 30, 40, 60);
        this.setType(Type.ROCK);

        this.addMove(sandAttack);
        this.addMove(snarl);
        this.addMove(rest);

        this.setMove(sandAttack, snarl, rest);
    }
}