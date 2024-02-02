package com.isro.chandrayaan;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import com.isro.chandrayaan.SpaceCraft.Direction;
 

public class SpaceCraftTest {
	
	
	@Test
    public void testGetPosition() {
        
		 SpaceCraft spacecraft = new SpaceCraft(0, 0, 0, Direction.N);
		 Assertions.assertEquals("(0, 0, 0)", spacecraft.getPosition());
		 
    }
	
	
	@Test
    public void testMoveFroward_North() {
        
		 SpaceCraft spacecraft = new SpaceCraft(0, 0, 0, Direction.N);
		 spacecraft.moveForward();
		 Assertions.assertEquals("(0, 1, 0)", spacecraft.getPosition());
		 
    }
	 
	@Test
    public void testMoveFroward_West() {
        
		 SpaceCraft spacecraft1 = new SpaceCraft(0, 0, 0, Direction.W);
		 spacecraft1.moveForward();
		 Assertions.assertEquals("(-1, 0, 0)", spacecraft1.getPosition());
		 	 
    }
	@Test
    public void testMoveFroward_UpWithMultipleSteps() {
   
		 SpaceCraft spacecraft2 = new SpaceCraft(0, 0, 0, Direction.U);
		 spacecraft2.moveForward();
		 spacecraft2.moveForward();
		 Assertions.assertEquals("(0, 0, 2)", spacecraft2.getPosition());
		 
		 
    }

}
