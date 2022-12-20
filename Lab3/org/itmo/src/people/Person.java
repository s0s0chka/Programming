package people;

import things.ISittable;
import java.util.Objects;

public abstract class Person {
    private String name;
    private Condition condition;

    {
        name = "безымянный";
    }

    public Person(String name) {
        this.name = name;
    }

    public String getName(){
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setCondition(Condition condition) {
        this.condition = condition;   
    }

    public void understand(String something, boolean canUnderstand) {
        if (canUnderstand) {
            System.out.println(this.name + " мог понять " + something);
        } else {
            System.out.println(this.name + " не мог понять " + something);
        }
    }

    public void sitOn(ISittable thing) {
        thing.setSittingPerson(name);
    }

    public void shakeHead() {
        System.out.println(this.name + " покачал головой");
    }

    public void lookAt(Person person){
        System.out.println(this.name + " посмотрел на " + person.getName());
    }

    public void wantToHearAbout(Person person, boolean wantsToHear) {
        if (wantsToHear) {
            System.out.println(this.name + "хочет слышать о " + person.getName());
        } else {
            System.out.println(this.name + " не хочет слышать о " + person.getName() + "е");
        }
    }


    @Override
    public boolean equals(Object otherObject) {
        if (this == otherObject) return true;
        if (otherObject == null) return false;
        if (!this.getClass().equals(otherObject.getClass())) return false;
        Person other = (Person) otherObject;

        return this.name.equals(other.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(this.name);
    }

    @Override
    public String toString() {
        return this.getClass().getName() + "[" + "name=" + name + "]";
    }
}