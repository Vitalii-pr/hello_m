package lotr.strategy;

import lotr.Character;

import java.util.Random;

public class RandomFromRangeKickStrategy implements KickStrategy{

    @Override
    public void kick(Character whoKicks, Character c) {
        Random rand = new Random();
        int damage = rand.nextInt(whoKicks.getPower()+1);
        c.setHp(Math.max(c.getHp() - damage, 0));
    }
}
