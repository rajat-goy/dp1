package net.media.training.designpattern.observer;

import java.util.ArrayList;
import java.util.List;

public class GameTestClient {
    public Sun sun;
    public Game game;

    public List<Character>characters;
    public void setup() {
        Person person = new Person();
        Dog dog = new Dog();
        Cat cat = new Cat();
        Robot robot = new Robot();

        sun = new Sun();
        characters=new ArrayList<Character>();
        characters.add(person);
        characters.add(cat);
        characters.add(dog);
        characters.add(robot);
        this.sun = new Sun();
        for(Character character:characters){
            sun.registerCharacter(character);
        }
        game = new Game(sun);
    }

    public void everyoneGoesOut() {
        for(Character character:characters)
        {
            character.goOutdoors();
        }
    }

    public void everyoneOutdoorsComesIn() {
        for(Character character:characters)
        {
           if(character.isOutdoors())
               character.goIndoors();
        }
    }

    public void tickOnce() {
        game.tick();
    }

    public void tickTwice() {
        game.tick();
        game.tick();
    }

    public boolean outdoorsCharactersFeelWarm() {
        for(Character character:characters)
        {
            if (character.isOutdoors() && !character.isFeelingWarm())
                return false;
        }
        for(Character character:characters)
        {
            if (!character.isOutdoors() && character.isFeelingWarm())
                return false;
        }

        return true;
    }

    public boolean allFeelCold() {
        for(Character character:characters)
        {
            if (character.isFeelingWarm())
                return false;
        }
        return true;
    }
}