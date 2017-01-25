/*
 * The "Model" is going to take care of the data and the operations.
 * 
 * In this case, we have a simple single operation: addTwoNumbers().
 * We also need to be able to get the value of the operation.
 * Note the way the result of the operation is stored inside THIS object.
 * 
 * The operations are simple and could be done in other parts of the application
 * but we are not tempted to take that route, which is often shorter.
 * 
 * The goal here is to demonstrate/use a strategy for separating data from how its 
 * viewed in order to allow more complex scalable, maintainable applications 
 * to be built.
 */
public class CalculatorModel {
	
	private int result;
	
	public int getResult() {
		return result;
	}
	
	public void addTwoNumbers(int op1, int op2) {
		result = op1 + op2;
	}
}
