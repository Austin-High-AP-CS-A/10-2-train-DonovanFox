import javax.swing.*;
import java.awt.*;

public class Main{
	public static void main(String[] args){
		JFrame frame = new JFrame("Train");
		frame.setSize(3000,600);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setLocationRelativeTo(null);
		frame.add(new Display());
		frame.setVisible(true);
		RailCar numba1 = new RailCar(color.black,0);
		RailCar.drawCar();
	}
}