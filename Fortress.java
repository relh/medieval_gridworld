import info.gridworld.grid.Grid;
import info.gridworld.grid.Location;
import info.gridworld.actor.Actor;
import info.gridworld.actor.Critter;
import java.util.ArrayList;

public class Fortress extends Critter
{

	public Fortress()    {

    }
    
    public void act() {
    	ArrayList<Location> Adjacent = getMoveLocations();
    	int n = Adjacent.size();
    	if (!(n == 0)) {
	    	Grid<Actor> gr = getGrid();
	   		double math = Math.random()*1000;
	    	if (math <= 100) {
	    		FootSoldier Rocky = new FootSoldier();
	    		Rocky.setColor(getColor());
	    		Rocky.putSelfInGrid(gr, Adjacent.get(0));
	    	}
	    	else if (math <= 125) {
	    		Horseman Rocky = new Horseman();
	    		Rocky.setColor(getColor());
	    		Rocky.putSelfInGrid(gr, Adjacent.get(0));
	    	}
	    	else if (math <= 150) {
	    		Archer Rocky = new Archer();
	    		Rocky.setColor(getColor());
	    		Rocky.putSelfInGrid(gr, Adjacent.get(0));
	    	}
	    	else if (math <= 160) {
	    		Peasent Rocky = new Peasent();
	    		Rocky.setColor(getColor());
	    		Rocky.putSelfInGrid(gr, Adjacent.get(0));
	    	}
    	}
    }
}
