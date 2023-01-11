package things;

import locations.Location;
import people.Person;

public interface IMovable {
    public void moveTo(Location location, Person person);
}