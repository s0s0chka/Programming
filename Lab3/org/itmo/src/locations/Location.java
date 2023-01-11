package locations;

import java.util.Objects;

public class Location {
    private String name;

    {
        name = "неизвестная локация";
    }

    public Location(String name) {
        this.name = name;
    }

    public String getName(){
        return this.name;
    }
    
    @Override
    public boolean equals(Object otherObject) {
        if (this == otherObject) return true;
        if (otherObject == null || getClass() != otherObject.getClass()) return false;
        Location other = (Location) otherObject;
        return this.name.equals(other.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name);
    }

    @Override
    public String toString() {
        return this.getClass().getName() + "[name=" + name + "]";
    }
}
