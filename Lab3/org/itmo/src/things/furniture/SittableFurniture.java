package things.furniture;

import java.util.Objects;

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

    @Override
    public void setSittingPerson(String personName){
        this.whosSitting = personName;
        System.out.print(personName + " сел на " + getName() + ". ");
    }

    @Override
    public String getSittingPerson() {
        return whosSitting;
    }

    @Override
    public boolean equals(Object otherObject) {
        SittableFurniture other = (SittableFurniture) otherObject;
        return super.equals(otherObject) && this.whosSitting.equals(other.whosSitting);
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), whosSitting);
    }

    @Override
    public String toString() {
        return super.toString() + "[whosSitting=" + whosSitting + "]";
    }
}
