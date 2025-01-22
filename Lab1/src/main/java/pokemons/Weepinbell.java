package pokemons;

import moves.status.Confide;
import moves.status.DoubleTeam;
import moves.status.PoisonPowder;
import ru.ifmo.se.pokemon.Pokemon;
import ru.ifmo.se.pokemon.Type;

public class Weepinbell extends Pokemon {

    public Weepinbell(){
        this("Безымянный",1);
    }

    public Weepinbell(String name, int level) {
        super(name, level);
        this.setType(Type.GRASS, Type.POISON);
        this.setStats(65, 90, 50, 85, 45, 55);

        DoubleTeam doubleTeam = new DoubleTeam(0, 1);
        Confide confide = new Confide(0, 1);
        PoisonPowder poisonPowder = new PoisonPowder(0, 0.75);

        super.setMove(doubleTeam, confide, poisonPowder);
    }
}
