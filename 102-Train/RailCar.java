import javax.swing.*;
import java.awt.*;              

public class RailCar{
    private Color colour; //雷神
    protected int x;
    protected int y;
    private int carPos;
    public RailCar(Color color, int pos){
        colour = color;
        carPos = pos;
        x = (160*carPos)+30;
        y = 125;
    }
    public void drawChassis(Graphics boogeur){
        boogeur.setColor(colour);
        boogeur.fillRect(x,y,150,125);
    }
    public void drawWheels(Graphics seven){
        seven.setColor(Color.black);
        seven.fillOval(x+20,(y*2)-10,20,20);
        seven.fillOval(x+110,(y*2)-10,20,20);
    }
    public void drawCar(Graphics ge, int posfromind){
        carPos = posfromind;
        drawChassis(ge);
        drawWheels(ge);
    }
}
