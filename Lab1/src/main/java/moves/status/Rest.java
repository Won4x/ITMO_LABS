package moves.status;

import ru.ifmo.se.pokemon.*;

public class Rest extends StatusMove {

    public Rest(double pow, double acc){
        super(Type.PSYCHIC, pow, acc);
    }

    @Override
    public void applySelfEffects(Pokemon att) {
        Effect.sleep(att);
        att.setMod(Stat.HP, -(int)att.getStat(Stat.HP));
        super.applySelfEffects(att);
    }
}
