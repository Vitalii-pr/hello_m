package lotr;


import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import lotr.strategy.KickStrategy;

@AllArgsConstructor
@Getter
@Setter
public abstract class Character {
    private int hp;
    private int power;
    private KickStrategy kickStrategy;


    public  void kick(Character c){
        if (this == c){System.out.println("Don't hurt youself");}
        else{kickStrategy.kick(this,c);}
    }

    public boolean isAlive(){
        return hp > 0;
    }

    public void setHp(int hp){
        this.hp = Math.max(hp, 0);
    }


    @Override
    public String toString(){
        return this.getClass().getSimpleName() + "{hp=" + this.getHp() + ", power=" + this.getPower() + "}";
    }

}
