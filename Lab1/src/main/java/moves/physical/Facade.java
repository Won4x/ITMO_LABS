package moves.physical;
import ru.ifmo.se.pokemon.*;

public class Facade extends PhysicalMove {

    public Facade(double pow, double acc){
        super(Type.NORMAL, pow, acc);
    }

    @Override
    protected void applySelfEffects(Pokemon pokemon) {
        if ((pokemon.getCondition() == Status.BURN) || (pokemon.getCondition() == Status.POISON) ||
                (pokemon.getCondition() == Status.PARALYZE)) {
            Effect effect = new Effect().stat(Stat.ATTACK, +70);
            pokemon.addEffect(effect);
        }
        super.applySelfEffects(pokemon);
    }

    @Override
    protected String describe() {
        return "использует Facade";
    }
}
