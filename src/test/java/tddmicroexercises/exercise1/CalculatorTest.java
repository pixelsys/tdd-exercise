package tddmicroexercises.exercise1;

import static org.junit.Assert.*;

import java.util.Arrays;
import java.util.List;

import org.junit.Test;

public class CalculatorTest {

    @Test(expected = Exception.class)
    public void teszt_op_cannot_be_null() {
    		// arrange
    		Calculator c = new Calculator();
    		String op = null;
    		List<Integer> input = Arrays.asList(1, 2, 3);
    		
    		// act
    		c.calculator(op, input);
    }
    
    @Test(expected = IllegalArgumentException.class)
    public void teszt_input_cannot_be_null() {
		// arrange
		Calculator c = new Calculator();
		String op = "sum";
		List<Integer> input = null;
		
		// act
		c.calculator(op, input);    		
    }
    
    @Test
    public void test_average_of_integers() {
    		// arrange
    		Calculator c = new Calculator();
    		String op = "avg";
    		List<Integer> input = Arrays.asList(3, 3, 3, 3);
    		double expected = 3.0d;
    		
    		// act
    		double actual = c.calculator(op, input);
    		
    		// assert
    		assertTrue(expected == actual);
    }

}
