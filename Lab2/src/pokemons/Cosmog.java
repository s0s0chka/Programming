package src.pokemons;

import ru.ifmo.se.pokemon.*;

import src.attacks.statAtk.Haze;
import src.attacks.statAtk.Swagger;
import src.attacks.specAtk.Scald;
import src.attacks.specAtk.Blizzard;

public class Cosmog extends Pokemon {

    protected StatusMove haze = new Haze(); //Have to finish implementation
    protected StatusMove swagger = new Swagger();
    protected SpecialMove scald = new Scald();
    protected SpecialMove blizzard = new Blizzard();

    public Cosmog(String name, int lvl) {
        super(name, lvl);
        
        this.setStats(43, 29, 31, 29, 31, 37);
        this.setType(Type.PSYCHIC);

        this.addMove(haze);
        this.addMove(swagger);
        this.addMove(scald);
        this.addMove(blizzard);

        this.setMove(swagger, scald, blizzard);
    }
}