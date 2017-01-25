import java.awt.event.ActionListener;
import javax.swing.*;

/*
 * This has all the GUI bits.
 */

public class CalculatorView extends JFrame {

	/*
	 * Here's all the GUI "widgets" we will need.
	 */
	private JLabel op1Label = new JLabel("Op1");
	private JLabel op2Label = new JLabel("Op2");
	private JLabel resultLabel = new JLabel("Result");

	private JTextField op1Text = new JTextField(10);
	private JTextField op2Text = new JTextField(10);
	private JTextField resultText = new JTextField(10);
	private JButton calculateButton = new JButton("Calculate");

	/*
	 * Constructor.
	 * Create a simple JPanel and add a few widgets.
	 * We won't worry about layout managers or any of that - KISS.
	 */
	CalculatorView() {
		JPanel panel = new JPanel();
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);

		panel.add(op1Label);
		panel.add(op1Text);
		panel.add(op2Label);
		panel.add(op2Text);
		panel.add(resultLabel);
		panel.add(resultText);
		panel.add(calculateButton);
		
		/*
		 * Add the JPanel into the JFrame - without this we see nothing!
		 * The JFrame is not visible by default - so we fix that & we give it a size.
		 */
		this.setSize(600, 100);
		this.add(panel);
		this.setVisible(true);
	}

	public int getOp1() {
		return Integer.parseInt(op1Text.getText());
	}

	public int getOp2() {
		return Integer.parseInt(op2Text.getText());
	}

	public void setResult(int result) {
		resultText.setText(Integer.toString(result));
	}

	/*
	 * This is needed because we want to be notified when certain actions occur
	 * in the view. In this case, a listener is added to the "calculateButton"
	 * every time this method is invoked. BTW: there's nothing preventing more
	 * than one action being added to this "calculateButton". There's no control
	 * over the number of times this method is invoked.
	 *
	 * So read this as.... Add a listener to the calculateButton.
	 */
	void addListener(ActionListener myListener) {
		calculateButton.addActionListener(myListener);
	}

	void displayErr(String errMessage) {
		JOptionPane.showMessageDialog(this, errMessage);
	}
}
