import things.furniture.*;
import things.*;
import locations.Location;
import people.*;

public class Program {
    public static void main(String[] args){

        Baby baby = new Baby("Малыш");
        FrekenBock frekenBock = new FrekenBock("Фрекен Бок", Condition.FEAR);
        Frid frid = new Frid("Фрид");
        
        SittableFurniture bed = new SittableFurniture("папина кровать");

        baby.understand("это", false);
        baby.sitOn(bed);
        baby.lookAt(frekenBock);
        baby.shakeHead();
        frekenBock.wantToHearAbout(frid, false);
        
        Location door = new Location("дверь");

        MovableFurniture dresser = new MovableFurniture("комод");
        MovableFurniture table = new MovableFurniture("стол");
        MovableFurniture chair = new MovableFurniture("стул");
        MovableFurniture bookcase = new MovableFurniture("этажерка");

        Barricade barricade = new Barricade("баррикада", door);

        dresser.moveTo(door, frekenBock);
        barricade.addToBarricade(dresser);

        table.moveTo(door, frekenBock);
        barricade.addToBarricade(table);

        chair.moveTo(door, frekenBock);
        barricade.addToBarricade(chair);
        
        bookcase.moveTo(door, frekenBock);
        barricade.addToBarricade(bookcase);

        System.out.println();
    }
}
