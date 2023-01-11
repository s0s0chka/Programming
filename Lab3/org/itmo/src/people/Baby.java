package people;

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
            System.out.print(this.getName() + " мог понять " + something + ". ");
        } else {
            System.out.print(this.getName() + " не мог понять " + something + ". ");
        }
    }

    public void sitOn(ISittable thing) {
        this.sittingOn = thing;
        thing.setSittingPerson(this.getName());
    }

    public void shakeHead() {
        System.out.print(this.getName() + " покачал головой" + ". ");
    }

    public void lookAt(Person person){
        System.out.print(this.getName() + " посмотрел на " + person.getNameWithCondition() + ". ");
    }
}