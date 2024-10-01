package lotr;

import lotr.strategy.RandomFromRangeKickStrategy;

import java.util.Random;


public class Knight extends Character{

    public Knight() {
        super(new Random().nextInt(2, 12), new Random().nextInt(2, 12), new RandomFromRangeKickStrategy());
    }

}
