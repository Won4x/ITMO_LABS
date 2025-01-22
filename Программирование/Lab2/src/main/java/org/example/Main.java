package org.example;
import ru.ifmo.se.pokemon.Battle;
import pokemons.*;

public class Main {
    public static void main(String[] args) {
        Battle b = new Battle();
        Comfey comfey = new Comfey("Comfey", 1);
        Rufflet rufflet = new Rufflet("Rufflet", 1);
        Braviary braviary = new Braviary("Braviary", 1);
        Bellsprout bellsprout = new Bellsprout("Bellsprout", 1);
        Weepinbell weepinbell = new Weepinbell("Weepinbell", 1);
        Victreebel victreebel = new Victreebel("Victreebel", 1);

        b.addAlly(comfey);
        b.addAlly(rufflet);
        b.addAlly(braviary);

        b.addFoe(bellsprout);
        b.addFoe(weepinbell);
        b.addFoe(victreebel);

        b.go();
    }

}