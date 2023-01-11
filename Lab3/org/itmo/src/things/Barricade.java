package things;

import java.util.ArrayList;
import java.util.Objects;

import locations.Location;

public class Barricade extends Thing{
    
    private ArrayList<Thing> consistsOf;

    {
        consistsOf = new ArrayList<>();
    }

    public Barricade(String name, Location location) {
        super(name, location);
    }

    public void addToBarricade(Thing thing) {
        consistsOf.add(thing);
        if (consistsOf.size() > 3) { 
            System.out.print("Перед " + getLocationName() + " сформировалась " + getName() + ". "); 
        }
    }

    @Override
    public boolean equals(Object otherObject){
        if (!super.equals(otherObject)) return false;
        Barricade other = (Barricade) otherObject;
        return this.consistsOf.equals(other.consistsOf);
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), consistsOf);
    }

    @Override
    public String toString() {
        return super.toString() + "[consitsOf=" + consistsOf.toString() + "]";
    }
}
