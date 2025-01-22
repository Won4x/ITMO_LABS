package moves.status;
import ru.ifmo.se.pokemon.*;

public class ScaryFace extends StatusMove {

    public ScaryFace(double pow, double acc){
        super(Type.NORMAL, pow, acc);
    }

    @Override
    protected void applyOppEffects(Pokemon p) {
        Effect effect = new Effect().stat(Stat.SPEED, -2);
        p.addEffect(effect);
        super.applyOppEffects(p);
    }


    @Override
    protected String describe() {
        return "использует Swagger";
    }
}


