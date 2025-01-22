package pokemons;

import moves.physical.Facade;
import moves.physical.PlayRough;
import moves.status.Swagger;
import moves.status.SweetScent;
import ru.ifmo.se.pokemon.Pokemon;
import ru.ifmo.se.pokemon.Type;

public class Comfey extends Pokemon {

    public Comfey(){
        this("Безымянный",1);
    }

    public Comfey(String name, int level) {
        super(name, level);
        this.setType(Type.FAIRY);
        this.setStats(51, 52, 90, 82, 110, 100);

        Swagger swagger = new Swagger(0, 0.85);
        Facade facade = new Facade(70, 1);
        PlayRough playRough = new PlayRough(90, 0.9);
        SweetScent sweetScent = new SweetScent(0, 1);

        super.setMove(swagger, facade, playRough, sweetScent);
    }
}
