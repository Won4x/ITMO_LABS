package moves.status;
import ru.ifmo.se.pokemon.*;

public class DoubleTeam extends StatusMove {

    public DoubleTeam(double pow, double acc){
        super(Type.NORMAL, pow, acc);
    }

    @Override
    protected void applySelfEffects(Pokemon p) {
        p.setMod(Stat.EVASION, +1);
        super.applySelfEffects(p);
    }

    @Override
    protected String describe() {
        return "использует Double Team";
    }
}
