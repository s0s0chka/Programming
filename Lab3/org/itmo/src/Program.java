import things.furniture.*;
import things.*;
import people.*;

public class Program {
    public static void main(String[] args){
        Baby baby = new Baby("Малыш");
        FrekenBock frekenBock = new FrekenBock("Фрекен Бок");
        Bed bed = new Bed("папина кровать");
        baby.understand("это", false);
        baby.sitOn(bed);
        baby.lookAt(frekenBock);
        baby.shakeHead();
        Frid frid = new Frid("Фрид");
        frekenBock.wantToHearAbout(frid, false);
        
        Dresser dresser = new Dresser("комод");
        Table table = new Table("стол");
        Chair chair = new Chair("стул");
        Bookcase bookcase = new Bookcase("этажерка");
        Barricade barricade = new Barricade("баррикада");

        dresser.moveTo("дверь", frekenBock.getName());
        barricade.addToBarricade(dresser);
        table.moveTo("дверь", frekenBock.getName());
        barricade.addToBarricade(table);
        chair.moveTo("дверь", frekenBock.getName());
        barricade.addToBarricade(chair);
        bookcase.moveTo("дверь", frekenBock.getName());
        barricade.addToBarricade(bookcase);
    }
}
