import javax.swing.*;
import java.awt.*;              

public class RailCar{
    private Color colour; //雷神
    private int x;
    private int y;
    private int carPos;
    public RailCar(Color color, int pos){
        colour = color;
        carPos = pos;
        x = 160*carPos;
        y = 125;
    }
    public void drawChassis(Graphics boogeur){
        boogeur.setColor(colour);
        boogeur.fillRect(x,y,150,125);
    }
    public void drawWheels(Graphics seven){
        seven.setColor(Color.black);
        seven.fillOval(x+30,(y*2)-10,20,20);
        seven.fillOval(x-120,(y*2)-10,20,20);
    }
    public void drawWindows(Graphics toledo){
        toledo.setColor(Color(200,200,255));
        toledo.fillRect(x+20,y+20,45,85);
        toledo.fillRect(x+85,y+20,45,85);
    }
    public void drawConnector(Graphics zork){
        zork.setColor(Color(100,100,100));
        zork.fillRect(x+150,(y*2)-10,10,5);
    }
    public static void drawCar(){
        drawChassis(g);
        drawWindows(g);
        drawWheels(g);
        drawConnector(g);
    }
}
