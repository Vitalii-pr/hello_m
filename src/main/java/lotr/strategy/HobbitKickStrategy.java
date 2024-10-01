package lotr.strategy;

import lotr.Character;

public class HobbitKickStrategy implements KickStrategy{

    @Override
    public void kick(lotr.Character whoKicks, Character c) {
        System.out.println("😭😭😭");
    }
}
