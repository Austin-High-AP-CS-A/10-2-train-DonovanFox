import javax.swing.*;
import java.awt.*;
import java.util.ArrayList;


public class Display extends JPanel{
	public Display(){}
	// paintCommponent is not explicitly called. It is executed whenever the JPanel is called.
	// Graphics g object is implicitly passed to function.
	public void paintComponent(Graphics g){
		super.paintComponent(g); //satisfies the parent class' requirements.
		setBackground(Color.WHITE);
		RailCar numba1 = new RailCar(Color.black,0);
		RailCar numba2 = new RailCar(Color.green,1);
		RailCar numba3 = new RailCar(Color.red,2);
		RailCar numba4 = new RailCar(Color.green,3);
		numba1.drawCar(g);
	}
}