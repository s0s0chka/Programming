package things.furniture;

import things.Thing;
import things.IMovable;

public class Table extends Thing implements IMovable {
    
    public Table(String name){
        super(name);
    }

    public void moveTo(String location, String whosMoving) {
        super.setLocation(location);
    }
}