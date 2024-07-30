package net.media.training.designpattern.builder;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class XmlBuilder {
    StringBuilder xml;

    List<Person> persons;
    XmlBuilder(){
        xml = new StringBuilder();
        xml.append("<?xml version=\"1.0\" encoding=\"UTF-8\"?>");
        persons = new ArrayList<Person>();

    }

    public String getPersonXml(Person person){
        if (person == null)
            return "";
        StringBuilder personBuilder = new StringBuilder();
        personBuilder.append("<Person");
        if(person.getId() !=0){
            personBuilder.append(" id=\""+person.getId()+"\"");
        }
        if(person.getName()!=null){
            personBuilder.append(" name=\""+person.getName()+"\"");
        }
        personBuilder.append(">");
        if(person.getCity()!=null || person.getCountry()!=null){
            personBuilder.append("<Address>");

            if(person.getCity()!=null){
                personBuilder.append("<City>" + person.getCity() + "</City>");
            }
            if(person.getCountry()!=null){
                personBuilder.append("<Country>" + person.getCountry() + "</Country>");
            }
            personBuilder.append("</Address>");
        }
        personBuilder.append("</Person>");

        return personBuilder.toString();

    }
    public String build(){
        xml.append("<People number=\"" + persons.size() + "\">");
        persons.forEach(person -> xml.append(getPersonXml(person)));
        xml.append("</People>");
        return xml.toString();
    }

    public void addPerson(Person person){
        persons.add(person);
    }
    public void removePerson(Person person){
        persons.remove(person);
    }


}
