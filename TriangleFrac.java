import java.util.Scanner;
import javax.swing.JFrame;

public class TriangleFrac {

    public static void main (String[] args) {
	Scanner console = new Scanner(System.in);
	System.out.print("Input the number of iterations: ");
	int i = console.nextInt();

	JFrame frame = new JFrame();
	frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	frame.setSize(1000,1000);
	frame.setTitle("Triangle Frac");
	
	TriangleFracComponent component = new TriangleFracComponent(i);

	frame.add(component);	
	frame.setVisible(true);

    }
}