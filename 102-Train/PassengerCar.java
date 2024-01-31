import java.awt.*;

public class PassengerCar extends RailCar {

    public PassengerCar(Color colr, int cpos){
        super(colr, cpos);
    }
    public void drawWindows(Graphics toledo){
        toledo.setColor(new Color(200,200,255));
        toledo.fillRect(x+20,y+20,45,85);
        toledo.fillRect(x+85,y+20,45,85);
    }
    public void drawConnector(Graphics zork){
        zork.setColor(new Color(100,100,100));
        zork.fillRect(x+150,(y*2)-10,10,5);
    }
    public void drawCar(Graphics g, int ni){
        super.drawCar(g,ni);
        drawWindows(g);
        drawConnector(g);
    }
    
}
