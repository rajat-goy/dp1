package net.media.training.designpattern.observer;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by IntelliJ IDEA.
 * User: joelrosario
 * Date: Jul 21, 2011
 * Time: 12:26:53 AM
 * To change this template use File | Settings | File Templates.
 */
public class CharacterTestClient {
    public List<Character> characters;

    public CharacterTestClient() {
        Person person = new Person();
        Dog dog = new Dog();
        Cat cat = new Cat();
        Robot robot = new Robot();

        characters=new ArrayList<Character>();
        characters.add(person);
        characters.add(cat);
        characters.add(dog);
        characters.add(robot);

    }

    public boolean testOutdoors() {
        for(Character character:characters)
        {
            character.goOutdoors();
        }
        for(Character character:characters)
        {
            if(!character.isOutdoors())
                return false;
        }
       return true;
    }

    public boolean testSunRose() {
        for(Character character:characters)
        {
            character.notifySunRose();
        }
        for(Character character:characters)
        {
            if(!character.isFeelingWarm())
                return false;
        }
        return true;
    }

    public boolean testSunSet() {
        for(Character character:characters)
        {
            character.notifySunSet();
        }
        for(Character character:characters)
        {
            if(character.isFeelingWarm())
                return false;
        }
        return true;

    }

    public boolean testIndoors() {
        for(Character character:characters)
        {
            character.goIndoors();
        }
        for(Character character:characters)
        {
            if(character.isOutdoors())
                return false;
        }
        return true;
    }
}
