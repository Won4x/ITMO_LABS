package moves.status;
import ru.ifmo.se.pokemon.*;

public class Swagger extends StatusMove {

    public Swagger(double pow, double acc){
        super(Type.NORMAL, pow, acc);
    }

    @Override
    protected void applyOppEffects(Pokemon p){
        Effect.paralyze(p);
        Effect effect = new Effect().stat(Stat.ATTACK, -2);
        p.addEffect(effect);
        super.applyOppEffects(p);
    }

    @Override
    protected String describe() {
        return "использует Swagger";
    }
}
