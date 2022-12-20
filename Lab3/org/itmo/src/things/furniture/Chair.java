package things.furniture;

import things.Thing;
import things.IMovable;

public class Chair extends Thing implements IMovable {
    
    public Chair(String name){
        super(name);
    }

    public void moveTo(String location, String whosMoving) {
        super.setLocation(location);
    }

}