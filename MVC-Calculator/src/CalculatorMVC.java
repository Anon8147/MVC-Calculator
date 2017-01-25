
public class CalculatorMVC {

	public static void main(String[] args) {
		CalculatorModel myModel = new CalculatorModel();
		CalculatorView myView = new CalculatorView();
		CalculatorController myController = new CalculatorController(myModel, myView);
	}
}
