package lotr;

import lotr.strategy.RandomFromRangeKickStrategy;

import java.util.Random;

public class King extends Character{
    public King() {
        Random rand = new Random();
        super(rand.nextInt(5, 16), rand.nextInt(5, 16), new RandomFromRangeKickStrategy());
    }
}
