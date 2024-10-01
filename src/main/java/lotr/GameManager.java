package lotr;

public class GameManager {
    public void fight(Character c1, Character c2) {
        while ((c1.getHp() > 0) && (c2.getHp() > 0)) {
            c1.kick(c2);
            if (c2.getHp() > 0) {
                c2.kick(c1);
            }
        }
    }
}