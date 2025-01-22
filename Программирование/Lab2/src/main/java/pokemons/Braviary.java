package pokemons;

import moves.physical.Slash;
import moves.physical.Superpower;
import moves.status.Rest;
import moves.status.ScaryFace;
import ru.ifmo.se.pokemon.Pokemon;
import ru.ifmo.se.pokemon.Type;

public class Braviary extends Pokemon {

    public Braviary(){
        this("Безымянный",1);
    }

    public Braviary(String name, int level) {
        super(name, level);
        this.setType(Type.FLYING, Type.NORMAL);
        this.setStats(100, 123, 75, 57, 75, 80);

        ScaryFace scaryFace = new ScaryFace(0, 1);
        Slash slash = new Slash(70, 1);
        Rest rest = new Rest(0, 1);
        Superpower superpower = new Superpower(120, 1);

        super.setMove(slash, scaryFace, superpower, rest);
    }
}
