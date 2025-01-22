package moves.physical;
import ru.ifmo.se.pokemon.*;

public class PlayRough extends PhysicalMove {

    public PlayRough(double pow, double acc){
        super(Type.FAIRY, pow, acc);
    }

    @Override
    protected void applyOppEffects(Pokemon p) {
        if (Math.random() <= 0.1) {
            Effect effect = new Effect().stat(Stat.ATTACK, -1);
            p.addEffect(effect);
        }
        super.applyOppEffects(p);
    }
    @Override
    protected String describe() {
        return "использует Play Rough";
    }
}
