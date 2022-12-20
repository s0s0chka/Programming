package things;

import java.util.ArrayList;
import java.util.Objects;

public class Barricade extends Thing{
    
    private ArrayList<Thing> consistsOf;

    {
        consistsOf = new ArrayList<>();
    }

    public Barricade(String name) {
        super(name);
    }

    public void addToBarricade(Thing thing) {
        consistsOf.add(thing);
        System.out.println("К " + this.getName() + " добавили " + thing.getName());
        if (consistsOf.size() > 3) { 
            System.out.println("Перед " + this.getLocation() + " сформировалась " + this.getName()); 
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
        return super.toString() + "[" + "consitsOf=" + consistsOf.toString() + "]";
    }
}
