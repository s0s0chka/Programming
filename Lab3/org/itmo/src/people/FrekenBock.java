package people;

public class FrekenBock extends Person {
    public FrekenBock(String name) {
        super(name);
    }
    public FrekenBock(String name, Condition condition){
        super(name, condition);
    }

    public void wantToHearAbout(Person person, boolean wantsToHear) {
        if (wantsToHear) {
            System.out.print(this.getName() + "хочет слышать о " + person.getName() + ". ");
        } else {
            System.out.print(this.getName() + " не хочет слышать о " + person.getName() + ". ");
        }
    }
}
