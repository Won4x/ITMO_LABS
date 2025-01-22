package pokemons;

import moves.status.Confide;
import moves.status.DoubleTeam;
import ru.ifmo.se.pokemon.Pokemon;
import ru.ifmo.se.pokemon.Type;

public class Bellsprout extends Pokemon {

    public Bellsprout(){
        this("Безымянный",1);
    }

    public Bellsprout(String name, int level) {
        super(name, level);
        this.setType(Type.GRASS, Type.POISON);
        this.setStats(50, 75, 35, 70, 30, 40);

        DoubleTeam doubleteam = new DoubleTeam(0, 1);
        Confide confide = new Confide(0, 1);

        super.setMove(doubleteam, confide);
    }
}
