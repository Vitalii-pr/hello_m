package lotr.strategy;

import lotr.Character;

public class ElfKickStrategy implements KickStrategy{

    @Override
    public void kick(lotr.Character whoKicks, Character c) {
        if (whoKicks.getPower() > c.getPower()) { c.setHp(0);} else { c.setPower(c.getPower()-1);}
    }
}
