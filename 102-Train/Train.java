import javax.swing.*;
import java.awt.*;
import java.util.ArrayList;

public class Train{
    public ArrayList<RailCar> cars;
    private int numCars;
    public Train(){
        numCars = 0;
    }

    public void addCar(String type, Color callor, int posi){
        if(type.equals("PassengerCar")){
            cars.add(posi, new PassengerCar(callor, posi));
            numCars++;
        }
    }
}