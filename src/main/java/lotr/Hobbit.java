package lotr;

import lotr.strategy.*;

public class Hobbit extends Character {

    public Hobbit(){
        super(3, 0, new HobbitKickStrategy());
    }

}
