package com.isro.chandrayaan;
 

public class SpaceCraft {
	private int x;
    private int y;
    private int z;
    private Direction direction; 
    
    public SpaceCraft(int x, int y, int z, Direction direction) {
        this.x = x;
        this.y = y;
        this.z = z;
        this.direction = direction;
    }
    
    
    public String getPosition() {
        return "(" + x + ", " + y + ", " + z + ")";
    }
    
    
    
    public enum Direction {
        N, E, S, W, U, D;
    }
}
