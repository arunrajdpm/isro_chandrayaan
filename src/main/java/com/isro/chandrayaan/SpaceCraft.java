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
    
    public void moveForward() {
        switch (direction) {
            case N:
                y++;
                break;
            case S:
                y--;
                break;
            case E:
                x++;
                break;
            case W:
                x--;
                break;
            case U:
                z++;
                break;
            case D:
                z--;
                break;
        }
    }
    
    public void moveBackward() {
        switch (direction) {
            case N:
                y--;
                break;
            case S:
                y++;
                break;
            case E:
                x--;
                break;
            case W:
                x++;
                break;
            case U:
                z--;
                break;
            case D:
                z++;
                break;
        }
    }

    public void turnLeft() {
        direction = direction.turnLeft();
    }

    public void turnRight() {
        direction = direction.turnRight();
    }
    
    public Direction getDirection() {
        return direction;
    }

    
    
    public enum Direction {
        N, E, S, W, U, D;
    	
    	public Direction turnLeft() {
            switch (this) {
                case N:
                    return W;
                case W:
                    return S;
                case S:
                    return E;
                case E:
                    return N;
                case U:
                    return U;  
                case D:
                    return D;  
            }
            throw new IllegalStateException("Unexpected direction: " + this);
        }

        
        
        public Direction turnRight() {
            switch (this) {
                case N:
                    return E;
                case W:
                    return N;
                case S:
                    return W;
                case E:
                    return S;
                case U:
                    return U; 
                case D:
                    return D;  
            }
            throw new IllegalStateException("Unexpected direction: " + this);
        }
    }
}
