package things.furniture;

import locations.Location;
import people.Person;
import things.IMovable;
import things.Thing;

public class MovableFurniture extends Thing implements IMovable {
    public MovableFurniture(String name){
        super(name);
    }

    public MovableFurniture(String name, Location location){
        super(name, location);
    }

    public void moveTo(Location location, Person person) {
        setLocation(location);
        System.out.print(person.getName() + " пододвинул " + getName() +  " к " + location.getName() + ". ");
    }
}
