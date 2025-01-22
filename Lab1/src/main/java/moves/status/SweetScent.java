package moves.status;

import ru.ifmo.se.pokemon.*;

public class SweetScent extends StatusMove {

    public SweetScent(double pow, double acc){
        super(Type.NORMAL, pow, acc);
    }

    @Override
    protected void applyOppEffects(Pokemon p) {
        Effect effect = new Effect().stat(Stat.EVASION, -1);
        p.addEffect(effect);
        super.applyOppEffects(p);
    }

    @Override
    protected String describe() {
        return "использует Sweet Scent";
    }
}
