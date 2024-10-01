package lotr.factory;

import java.util.Set;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import lombok.SneakyThrows;
import org.reflections.Reflections;

public interface CharacterFactory {
    @SneakyThrows
    public static Character createCharacter() {
        Reflections reflections = new Reflections("lotr");

        Set<Class<? extends Character>> charactersSet = reflections.getSubTypesOf(Character.class);
        List<Class<? extends Character>> characters = new ArrayList<>(charactersSet);
        return characters.get(new Random().nextInt(characters.size())).getDeclaredConstructor().newInstance();
    }
}