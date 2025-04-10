import info.gridworld.grid.Grid;
import info.gridworld.grid.Location;
import info.gridworld.actor.Actor;
import info.gridworld.actor.Bug;

public class FootSoldier extends Bug
{
	private int counter;
    private int steps;
    private int sideLength;

    public FootSoldier()    {
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
    
    public boolean canMove() {
    	Grid<Actor> gr = getGrid();
    	if (gr == null)
    		return false;
    	Location loc = getLocation();
    	Location next = loc.getAdjacentLocation(getDirection());
        if (!gr.isValid(next)) 
        	return false;
        Actor a = gr.get(next);
        if (a != null) {
        	if (!(a.getColor().toString().compareTo(this.getColor().toString()) != 0)) {
        		return false;
        	}
        }
    	return true;
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
    }
}
