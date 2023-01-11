package things.furniture;

import locations.Location;
import things.ISittable;
import things.Thing;

public class SittableFurniture extends Thing implements ISittable {
    private String whosSitting; 

    public SittableFurniture(String name) {
        super(name);
    }

    public SittableFurniture(String name, Location location){
        super(name, location);
    }

    public void setSittingPerson(String personName){
        this.whosSitting = personName;
        System.out.print(personName + " сел на " + getName() + ". ");
    }

    public String getSittingPerson() {
        return whosSitting;
    }
}
