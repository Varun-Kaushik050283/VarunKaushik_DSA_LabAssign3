/**
 * 
 */
package q1.balancingBrackets;

/**
 * Question 2: Write a program of Balancing Brackets, use a suitable data
 * structure to print whether the string entered is a Balanced Brackets or
 * Unbalanced String
 * 
 * Provided Inputs: 
 * 1.Test Case 1. String ( [ [ { } ] ] ) as a bracket expression to be inserted in a stack as an input
 * 2.Test Case 2. String ( [ [ { } ] ] ) ) as a bracket expression to be inserted in a stack as an input
 * 
 * Using custom created stack having functionality to accommodate input String as character array
 */
public class BalancedBracketsCheckerTest {

	
	public static void main(String[] args) {

		test01();
		
		System.out.println();
		
		test02();
	}

	static void test01() {

		String bracketsExpression = "([[{}]])";
		System.out.println("Test Case 1: sample input : "+bracketsExpression);
		testBalancedBracketsChecker(bracketsExpression);
	}
	
	static void test02() {

		String bracketsExpression = "([[{}]]))";
		System.out.println("Test Case 2: sample input : "+bracketsExpression);
		testBalancedBracketsChecker(bracketsExpression);
	}

	static Boolean testBalancedBracketsChecker(String bracketsExpression) {
		BalancedBracketsChecker checker = new BalancedBracketsChecker(bracketsExpression);
		return checker.check();
	}

}
