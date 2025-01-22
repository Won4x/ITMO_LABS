package moves.physical;
import ru.ifmo.se.pokemon.*;

public class Superpower extends PhysicalMove {

    public Superpower(double pow, double acc){
        super(Type.FIGHTING, pow, acc);
    }

    @Override
    protected void applySelfEffects(Pokemon p) {
        p.setMod(Stat.ATTACK, -1);
        p.setMod(Stat.DEFENSE, -1);
        super.applySelfEffects(p);
    }

    @Override
    protected String describe() {
        return "использует Superpower";
    }
}
