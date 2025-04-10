import info.gridworld.grid.Grid;
import info.gridworld.grid.Location;
import info.gridworld.grid.BoundedGrid;
import info.gridworld.actor.Actor;
import info.gridworld.actor.ActorWorld;

import java.awt.Color;
import javax.swing.JOptionPane;

public class GridGenerator {
    public static void main(String[] args)
    {
    	int rows = Integer.parseInt(JOptionPane.showInputDialog("How Many Rows?"));
    	int columns = Integer.parseInt(JOptionPane.showInputDialog("How Many Columns?"));
    	generate(rows,columns);
    }
    
    //45 x 76 = full screen
    //23 x 35 = biggest 4 x 4
    
    public static void generate(int r, int c) {
    	Grid<Actor> gr = new BoundedGrid(r,c) ;
    	ActorWorld world = new ActorWorld(gr);
    	int i = 0;
    	int k = 0;
    	double math = 0;
    	int red = 0;
    	int green = 0;
    	int blue = 0;
    	Color Big;
    	Fortress castle = new Fortress();
    	//Horseman sydney = new Horseman();
    	//FootSoldier miles = new FootSoldier();
    	//Archer sally = new Archer();
    	//RockHound bob = new RockHound();
    	//BreederBug sue = new BreederBug();
    	//Rock joe = new Rock();
    	//BreederCritter mike = new BreederCritter();
    	//DoubleBreederMoverBug jeremy = new DoubleBreederMoverBug();
    	
    	while (i < r) {
    		while (k < c) {
    			math = Math.random()*1000;
    			red = (int)(Math.random()*255);
    			green = (int)(Math.random()*255);
    			blue = (int)(Math.random()*255);
    			Big = new Color(red, green, blue);
    			
    			
    			if (math <= 15) {
    				castle = new Fortress();
    				castle.setColor(Big);
    				world.add(new Location(i, k), castle);
    			}
    			
    			/*
    			else if (math <= 15) {
    				sydney = new Horseman();
    				sydney.setColor(Big);
    				world.add(new Location(i, k), sydney);
    			}
    			*/
    			
    			/*
    			else if (math <= 30) {
    				miles = new FootSoldier();
    				miles.setColor(Big);
    				world.add(new Location(i, k), miles);
    			}
    			*/
    			
    			/*
    			else if (math <= 45) {
    				sally = new Archer();
    				sally.setColor(Big);
    				world.add(new Location(i, k), sally);
    			}   		
    			*/
    			
    			/*
    			else if (math < 5 ) {
    				jeremy = new DoubleBreederMoverBug();
    				jeremy.setColor(Big);
    				world.add(new Location(i,k), jeremy);
    			}
    			*/
    			
    			/*
    			else if (math <= 15) {
    				bob = new RockHound();
    				bob.setColor(Big);
    				world.add(new Location(i, k), bob);
    			}
    			*/
    			
    			/*
    			else if (math > 15 && math <= 45) {
    				sue = new BreederBug();
    		        sue.setColor(Big);
    		        world.add(new Location(i, k), sue);
    			}
    			*/
    			/*
    			else if (math > 45 && math <= 50) {
    				mike = new BreederCritter();
    		        mike.setColor(Big);
    		        world.add(new Location(i, k), mike);
    			}
    			*/
    			/*
    			else if (math > 50 && math < 250) {
    				joe = new Rock();
    		        joe.setColor(Big);
    		        world.add(new Location(i, k), joe);
    			}
    			*/
    			k++;
    			}
    		k = 0;
    		i++;
    	}
    	world.show();
    }

}