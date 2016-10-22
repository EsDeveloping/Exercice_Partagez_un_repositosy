import javax.swing.JFrame;
import javax.swing.JLabel;

public class Frame{
	public Frame(String message){
		JFrame frame = new JFrame();
		JLabel label = new JLabel(message);
		
		frame.getContentPane().add(label);
		frame.pack();
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setVisible(true);
	}

	public static void main(String[] args){
		Frame frame = new Frame("Hello World!");
	}
}
