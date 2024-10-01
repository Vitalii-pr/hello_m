package lotr;

import lombok.Getter;
import lombok.Setter;
import lotr.strategy.ElfKickStrategy;

@Getter @Setter
public class Elf extends Character {

    public Elf(int hp, int power) {
        super(hp, power, new ElfKickStrategy());
    }

    public Elf(){
        super(10, 10, new ElfKickStrategy());
    }

}
