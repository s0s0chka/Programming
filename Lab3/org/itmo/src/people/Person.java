package people;

import java.util.Objects;

public abstract class Person {
    private String name;
    private Condition condition;

    {
        name = "безымянный";
        condition = Condition.NORMAL;
    }

    public Person(String name) {
        this.name = name;
    }

    public Person(String name, Condition condition){
        this.name = name;
        this.condition = condition;
    }

    public String getName(){
        return this.name;
    }

    public Condition getConditon() {
        return condition;
    }

    public void setCondition(Condition condition) {
        this.condition = condition;
    } 

    public String getReadableCodition() {
        if (condition == Condition.FEAR) {
            return "напуганный";
        }
        return "";
    }

    public String getNameWithCondition() {
        return getReadableCodition() + " " + getName();
    }

    @Override
    public boolean equals(Object otherObject) {
        if (this == otherObject) return true;
        if (otherObject == null) return false;
        if (!this.getClass().equals(otherObject.getClass())) return false;
        Person other = (Person) otherObject;

        return this.name.equals(other.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(this.name, this.condition);
    }

    @Override
    public String toString() {
        return this.getClass().getName() + "[" + "name=" + name + "]" + 
                "[" + "condition=" + condition + "]";
    }
}