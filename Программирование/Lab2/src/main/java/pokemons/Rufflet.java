package pokemons;

import moves.physical.Slash;
import moves.status.Rest;
import moves.status.ScaryFace;
import ru.ifmo.se.pokemon.Pokemon;
import ru.ifmo.se.pokemon.Type;

public class Rufflet extends Pokemon {

    public Rufflet(){
        this("Безымянный",1);
    }

    public Rufflet(String name, int level) {
        super(name, level);
        this.setType(Type.FLYING, Type.NORMAL);
        this.setStats(70, 83, 50, 37, 50, 60);

        ScaryFace scaryFace = new ScaryFace(0, 1);
        Slash slash = new Slash(70, 1);
        Rest rest = new Rest(0, 1);

        super.setMove(scaryFace, slash, rest);
    }
}
