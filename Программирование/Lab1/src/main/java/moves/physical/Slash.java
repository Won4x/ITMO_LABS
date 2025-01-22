package moves.physical;

import ru.ifmo.se.pokemon.*;

public class Slash extends PhysicalMove {

    public Slash(double pow, double acc){
        super(Type.NORMAL, pow, acc);
    }

    @Override
    protected double calcCriticalHit(Pokemon att, Pokemon def) {
        return 1d / 8d;
    }

    @Override
    protected String describe() {
        return "использует Slash";
    }
}
