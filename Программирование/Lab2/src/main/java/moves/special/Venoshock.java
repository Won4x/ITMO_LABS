package moves.special;

import ru.ifmo.se.pokemon.*;

public class Venoshock extends SpecialMove {

    public Venoshock(double pow, double acc){
        super(Type.POISON, pow, acc);
    }

    @Override
    protected void applyOppDamage(Pokemon p, double damage) {
        if (p.getCondition() == Status.POISON){
            damage *= 2;
        }
        super.applyOppDamage(p, damage);
    }

    @Override
    protected String describe() {
        return "использует Venoshock";
    }
}
