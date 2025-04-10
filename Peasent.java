import info.gridworld.grid.Grid;
import info.gridworld.grid.Location;
import info.gridworld.actor.Actor;
import info.gridworld.actor.Bug;

public class Peasent extends Bug
{
	private int counter;
    private int steps;
    private int sideLength;

    public Peasent()    {
        counter = 0;
    	steps = 0;
        sideLength = 1;
    }
    

    public void act() {
    	if (steps < sideLength && canMove()) {
	    	move();
	    	steps++;
	    }
    	
	    else {
	        turn();
	        turn();
	        steps = 0;
	        counter++;
	        if (counter == 2) {
	        	sideLength++;
	           	counter = 0;
	        }
	    }
    }
   
    public void move() {
    	Grid<Actor> gr = getGrid();
    	if (gr == null)
    		return;
    	Location loc = getLocation();
    	Location next = loc.getAdjacentLocation(getDirection());
    	if (gr.isValid(next))
    		moveTo(next);
    	else
    		removeSelfFromGrid();
    	double math = Math.random()*30;
    	if (math <= 1) {
    		Fortress Rocky = new Fortress();
    		Rocky.setColor(getColor());
    		Rocky.putSelfInGrid(gr, loc);
    	}
    }
}
