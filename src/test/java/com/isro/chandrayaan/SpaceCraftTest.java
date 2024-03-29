package com.isro.chandrayaan;

import java.util.Arrays;
import java.util.stream.Stream;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;
import com.isro.chandrayaan.SpaceCraft.Direction;

public class SpaceCraftTest {
	
	
	@Test
    public void testGetPosition() {
        
		 SpaceCraft spacecraft = new SpaceCraft(0, 0, 0, Direction.N);
		 Assertions.assertEquals("(0, 0, 0)", spacecraft.getPosition());
		 
    } 
	
	@ParameterizedTest
    @MethodSource("validateForwardDirection")
    void test_forwardDirection(String output, Direction direction) {
		SpaceCraft spacecraft = new SpaceCraft(0, 0, 0, direction);
		spacecraft.moveForward();
        Assertions.assertEquals(output, spacecraft.getPosition());
    }

    static Stream<Arguments> validateForwardDirection() {
        return Stream.of(
                Arguments.of("(0, 1, 0)", Direction.N),    
                Arguments.of("(-1, 0, 0)", Direction.W),
                Arguments.of("(0, 0, 1)", Direction.U)
        );
    }
    
    @ParameterizedTest
    @MethodSource("validateBackwardDirection")
    void test_backwardDirection(String output, Direction direction) {
		SpaceCraft spacecraft = new SpaceCraft(0, 0, 0, direction);
		spacecraft.moveBackward();
        Assertions.assertEquals(output, spacecraft.getPosition());
    }

    static Stream<Arguments> validateBackwardDirection() {
        return Stream.of(
                Arguments.of("(0, -1, 0)", Direction.N),    
                Arguments.of("(1, 0, 0)", Direction.W),
                Arguments.of("(0, 0, -1)", Direction.U)
        );
    }
    
    @ParameterizedTest
    @MethodSource("validateLeftDirection")
    void test_leftDirection(Direction output, Direction direction) {
		SpaceCraft spacecraft = new SpaceCraft(0, 0, 0, direction);
		spacecraft.turnLeft();
        Assertions.assertEquals(output, spacecraft.getDirection());
    }

    static Stream<Arguments> validateLeftDirection() {
        return Stream.of(
                Arguments.of(Direction.W, Direction.N),    
                Arguments.of(Direction.S, Direction.W),
                Arguments.of(Direction.U, Direction.U)
        );
    }
    
    
    @ParameterizedTest
    @MethodSource("validateRightDirection")
    void test_rightDirection(Direction output, Direction direction) {
		SpaceCraft spacecraft = new SpaceCraft(0, 0, 0, direction);
		spacecraft.turnRight();
        Assertions.assertEquals(output, spacecraft.getDirection());
    }

    static Stream<Arguments> validateRightDirection() {
        return Stream.of(
                Arguments.of(Direction.E, Direction.N),    
                Arguments.of(Direction.N, Direction.W),
                Arguments.of(Direction.U, Direction.U)
        );
    }
    

    @ParameterizedTest
    @MethodSource("validateUpDirection")
    void test_upDirection(Direction output, Direction direction) {
		SpaceCraft spacecraft = new SpaceCraft(0, 0, 0, direction);
		spacecraft.moveUp();
        Assertions.assertEquals(output, spacecraft.getDirection());
    }

    static Stream<Arguments> validateUpDirection() {
        return Stream.of(
                Arguments.of(Direction.U, Direction.N),    
                Arguments.of(Direction.U, Direction.S)
        );
    }
    

    @ParameterizedTest
    @MethodSource("validateDownDirection")
    void test_downDirection(Direction output, Direction direction) {
		SpaceCraft spacecraft = new SpaceCraft(0, 0, 0, direction);
		spacecraft.moveDown();
        Assertions.assertEquals(output, spacecraft.getDirection());
    }

    static Stream<Arguments> validateDownDirection() {
    	 return Stream.of(
                 Arguments.of(Direction.D, Direction.N),    
                 Arguments.of(Direction.D, Direction.S)
         );
    }
    
    
    @ParameterizedTest
    @MethodSource("validateUpdatePositionDirection")
    void test_validateUpdatePositionDirection(String output, Direction direction, char[] commands) {
		SpaceCraft spacecraft = new SpaceCraft(0, 0, 0, direction);
		 
		spacecraft.updatePosition(commands);
        Assertions.assertEquals(output, spacecraft.getPosition());
    }

    static Stream<Arguments> validateUpdatePositionDirection() {
    	return Stream.of(
                Arguments.of("(0, 1, -1)", Direction.N,  new  char[]{'f', 'r', 'u', 'b', 'l'})
        );
    }
    
    
	 
}
