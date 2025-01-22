package moves.status;

import ru.ifmo.se.pokemon.*;

public class PoisonPowder extends StatusMove {

    public PoisonPowder(double pow, double acc){
        super(Type.POISON, pow, acc);
    }


    @Override
    protected void applyOppEffects(Pokemon p) {
        Effect.poison(p);
        super.applyOppEffects(p);
    }

    @Override
    protected String describe() {
        return "использует Poison Powder";
    }
}
