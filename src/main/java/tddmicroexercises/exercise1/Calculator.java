package tddmicroexercises.exercise1;

import java.util.Arrays;
import java.util.List;

public class Calculator {

    public Double calculator(String op, List<Integer> input) {
    		if(null == input) {
    			throw new IllegalArgumentException("Invalid input: " + input);
    		}
        if("sum".equals(op)) {
            double acc = 0.0;
            for(int i = 0; i < input.size(); ++i) {
                acc += input.get(i);
            }
            return acc;
        } else if ("avg".equals(op)) {
            double sum = calculator("sum", input);
            return sum / input.size();
        }
        throw new IllegalArgumentException("Invalid op: " + op);          
    }

    public static void main(String[] args) {
        List<Integer> input = Arrays.asList(1, 1, 2, 3, 5, 8, 13);
        Calculator exercise1 = new Calculator();
        System.out.println(exercise1.calculator("sum", input));
        System.out.println(exercise1.calculator("avg", input));
    }

}
