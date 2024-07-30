package net.media.training.designpattern.observer;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by IntelliJ IDEA.
 * User: joelrosario
 * Date: Jul 21, 2011
 * Time: 9:06:22 AM
 * To change this template use File | Settings | File Templates.
 */
public class SunTestClient {
    private Sun sun;

    private List<Character>characters;

    private List<Character>nonAnimals;

    private List<Character>animals;

    public SunTestClient() {
        Person person = new Person();
        Robot robot = new Robot();
        Cat cat = new Cat();
        Dog dog = new Dog();
        characters=new ArrayList<Character>();
        characters.add(person);
        characters.add(cat);
        characters.add(dog);
        characters.add(robot);
        this.sun = new Sun();
        for(Character character:characters){
         sun.registerCharacter(character);
        }
        nonAnimals=new ArrayList<Character>();
        nonAnimals.add(person);
        nonAnimals.add(robot);
        animals=new ArrayList<Character>();
        animals.add(cat);
        animals.add(dog);
    }

    public void aFewCharactersGoOutdoors() {
        for (Character character:nonAnimals)
        {
            character.goOutdoors();
        }
    }

    public void aFewOtherCharactersGoOutdoors() {
        for (Character character:animals)
        {
            character.goOutdoors();
        }
    }

    public void sunRise() {
        sun.rise();
    }

    public void sunSet() {
        sun.set();
    }

    public boolean charactersWhoWereOutAreFeelTired() {
        for(Character character:characters)
        {
            if (character.isOutdoors() && !character.isFeelingTired())
                return false;
        }

        return true;
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
}
