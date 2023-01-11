package things;

import java.util.Objects;
import locations.Location;

public abstract class Thing{
    private String name;
    private Location location;
    {
        name = "вещь без имени";
    }

    public Thing(String name) {
        this.setName(name);
    }

    public Thing(String name, Location location) {
        this.setName(name);
        this.location = location;
    }

    public String getName(){
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Location getLocation() {
        return location;
    }

    protected void setLocation(Location location) {
        this.location = location;
    }

    public String getLocationName() {
        return location.getName();
    }

    @Override
    public boolean equals(Object otherObject) {
        if (this == otherObject) return true;
        if (otherObject == null) return false;
        if (!this.getClass().equals(otherObject.getClass())) return false;
        Thing other = (Thing) otherObject;

        return this.name.equals(other.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name);
    }

    @Override
    public String toString() {
        return this.getClass().getName() + "[name=" + name + "]" + "[location=" + location + "]";
    }
}