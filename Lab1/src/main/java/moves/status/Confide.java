package moves.status;

import ru.ifmo.se.pokemon.*;

public class Confide extends StatusMove {

    public Confide(double pow, double acc){
        super(Type.NORMAL, pow, acc);
    }

    @Override
    protected void applyOppEffects(Pokemon p) {
        p.setMod(Stat.SPECIAL_ATTACK, -1);
        super.applyOppEffects(p);
    }

    @Override
    protected String describe() {
        return "использует Confide";
    }
}
