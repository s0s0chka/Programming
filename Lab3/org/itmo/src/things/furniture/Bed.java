package things.furniture;
import things.ISittable;
import things.Thing;

public class Bed extends Thing implements ISittable{

    private String whosSitting; 

    public Bed(String name) {
        super(name);
    }

    public void setSittingPerson(String personName){
        this.whosSitting = personName;
        System.out.println(personName + " сел на " + this.getName());
    }

    public String getSittingPerson() {
        return whosSitting;
    }
}