import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/*
 * Here's where the "controller" brings the "view" and the "model" together.
 */
public class CalculatorController {
	private CalculatorModel mModel;
	private CalculatorView mView;

	/*
	 * First we create the Controller.
	 * Inside the constructor, we say that "this" controller object contains Model and View objects.
	 * We also ensure that the View 
	 *
	 */
	public CalculatorController(CalculatorModel model, CalculatorView view) {
		mModel = model;
		mView = view;

		this.mView.addListener(new CalculateClicked());
		this.mView.addListener(new LookAtMe());
		this.mView.addListener(new LookAtMe());
	}

	class CalculateClicked implements ActionListener {
		@Override
		public void actionPerformed(ActionEvent e) {
			int num1, num2 = 0;
			try {
				num1 = mView.getOp1();
				num2 = mView.getOp2();

				mModel.addTwoNumbers(num1, num2);
				mView.setResult(mModel.getResult());
			} catch (Exception ex) {
				mView.displayErr("Oh no! Something went wrong!!");
			}
		}
	}
	class LookAtMe implements ActionListener {
		@Override
		public void actionPerformed(ActionEvent e) {
			System.out.println("Hello Bb");
		}
	}
}
