import info.gridworld.grid.Location;
import info.gridworld.actor.Actor;
import info.gridworld.actor.Critter;
import java.util.ArrayList;

public class Archer extends Critter
{


    public Archer()    {
    	
    }
    

    public void act() {
    	ArrayList<Actor> actors = getActors();
    	processActors(actors);
    	ArrayList<Location> moveLocs = getMoveLocations();
    	Location loc = selectMoveLocation(moveLocs);
    	makeMove(loc);
    }
    
    public void processActors(ArrayList<Actor> actors) {
    	for (Actor a : actors) {
    		double math = Math.random()*8;
        	if (math <= 1 && !(a.getColor().equals(getColor()))) {
    			a.removeSelfFromGrid();
        	}
    	}
    }
    
}
