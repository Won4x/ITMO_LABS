package pokemons;

import moves.special.Venoshock;
import moves.status.Confide;
import moves.status.DoubleTeam;
import moves.status.PoisonPowder;
import ru.ifmo.se.pokemon.Pokemon;
import ru.ifmo.se.pokemon.Type;

public class Victreebel extends Pokemon {

    public Victreebel(){
        this("Безымянный",1);
    }

    public Victreebel(String name, int level) {
        super(name, level);
        this.setType(Type.GRASS, Type.POISON);
        this.setStats(80, 105, 65, 100, 70, 70);

        DoubleTeam doubleTeam = new DoubleTeam(0, 1);
        Confide confide = new Confide(0, 1);
        PoisonPowder poisonPowder = new PoisonPowder(0, 0.75);
        Venoshock venoshock = new Venoshock(65, 1);

        super.setMove(doubleTeam, confide, poisonPowder, venoshock);
    }
}
