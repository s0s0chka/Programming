package things.furniture;

import things.Thing;
import things.IMovable;

public class Dresser extends Thing implements IMovable {
    
    public Dresser(String name){
        super(name);
    }

    public void moveTo(String location, String whosMoving) {
        super.setLocation(location);
        System.out.println(whosMoving + " пододвинул " + this.getName() +  " к " + location);

    }

}