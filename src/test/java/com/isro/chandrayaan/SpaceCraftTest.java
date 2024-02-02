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

}
