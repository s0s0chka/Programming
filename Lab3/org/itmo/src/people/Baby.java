package people;

import java.util.Objects;

import things.ISittable;

public class Baby extends Person {

    private ISittable sittingOn;

    public Baby(String name){
        super(name);
    }
    public Baby(String name, Condition condition){
        super(name, condition);
    }

    public void understand(String something, boolean canUnderstand) {
        if (canUnderstand) {
            System.out.println(this.getName() + " мог понять " + something + ". ");
        } else {
            System.out.println(this.getName() + " не мог понять " + something + ". ");
        }
    }

    public void sitOn(ISittable thing) {
        this.sittingOn = thing;
        thing.setSittingPerson(this.getName());
    }

    public void shakeHead() {
        System.out.println(this.getName() + " покачал головой" + ". ");
    }

    public void lookAt(Person person){
        System.out.println(this.getName() + " посмотрел на " + person.getNameWithCondition() + ". ");
    }

    @Override
    public boolean equals(Object otherObject) {
        Baby other = (Baby) otherObject;
        return super.equals(otherObject) && this.sittingOn.equals(other.sittingOn);
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), this.sittingOn);
    }

    @Override
    public String toString() {
        return super.toString() + "[sittingOn=" + sittingOn + "]";
    }
}