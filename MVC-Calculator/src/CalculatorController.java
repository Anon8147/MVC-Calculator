import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/*
 * Here's where the "controller" brings the "view" and the "model" together.
 */
public class CalculatorController {
	private CalculatorModel mModel;
	private CalculatorView mView;

	/*
	 * First we create the Controller. Inside the Controller's constructor, we
	 * say that "this" controller object contains Model and View objects.
	 * 
	 * We ensure that the Controller is "connected" to the View by
	 * ActionListeners (via the "actionPeformed() method implemented by the "
	 * CalculateClicked" & "LookAtMe" objects) via the View's "addListener()"
	 * method.
	 * 
	 * So now, every time the "calculate" push button is clicked in the GUI, the
	 * "CalculateClicked()" & "LookAtMe()" methods will be invoked. As it
	 * happens, in this example "LookATMe()" will be invoked twice, just to
	 * illustrate that multiple ActionListeners can be invoked and that the same
	 * one can be invoked multiple times.
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
