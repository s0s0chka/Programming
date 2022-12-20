package things;

import java.util.Objects;

public abstract class Thing{
    private String name;
    private String location;

    {
        name = "вещь без имени";
        location = "неизвестное положение";
    }

    protected Thing() {

    }

    protected Thing(String name) {
        this.setName(name);
    }

    public String getName(){
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLocation() {
        return location;
    }

    protected void setLocation(String location) {
        this.location = location;
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
        return this.getClass().getName() + "[" + "name=" + name + "]";
    }
}