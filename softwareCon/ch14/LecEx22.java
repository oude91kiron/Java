// Create a method that Evaluates the given prefix expression and returns its result.
// Precondition: string represents a legal postfix expression

import java.util.*;

public class LecEx22 {
    public static void main(String[] args){

        String postFixExp = "5 2 4 / 2 3 + * + 7 -";

        // CALL THE METHOD
        int result = postFixEvaluate(postFixExp);

        System.out.println("The result of your post fix expression is: " + result);
    } // End of the main method

    public static int postFixEvaluate(String expression){

        // Declaring a stack
        Stack<Integer> s =  new Stack<Integer>();
        Scanner input = new Scanner(expression);

        while(input.hasNext()){
            if(input.hasNextInt()){  // an operand integer
                s.push(input.nextInt());
            } else {                                // an operator
                String operator = input.next();
                int operator2 = s.pop();
                int operator1 = s.pop();

                if(operator.equals("+")){
                    s.push(operator1 + operator2);
                }else if (operator.equals("-")){
                    s.push(operator1 - operator2);
                }else if (operator.equals("*")){
                    s.push(operator1 * operator2);
                }else{
                    s.push(operator1/operator2);
                }
            }
        }
        return s.pop();
    }
}