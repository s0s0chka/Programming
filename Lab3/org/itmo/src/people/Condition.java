package people;

public enum Condition {
    NORMAL(""),
    FEAR("напуганный");

    private String name;
    private Condition(String name) {
        this.name = name;
    }
    public String getName() {
        return name;
    }
}
