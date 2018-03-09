package cpsc101.mgoertzen.lab6_c;

import java.awt.*;
import javax.swing.*;

public class CarComponent extends JComponent {

    private Rectangle body;
    private Rectangle hood;
    private Rectangle frontWheel;
    private Rectangle backWheel;
    private Rectangle trunk;

    public CarComponent() {
        //setting all shapes of the car
        body = new Rectangle(50, 180, 100, 50);
        hood = new Rectangle(150, 205, 25, 25);
        trunk = new Rectangle(25, 215, 25, 15);
        frontWheel = new Rectangle(52, 230, 25, 25);
        backWheel = new Rectangle(130, 230, 25, 25);

    }

    @Override
    public void paintComponent(Graphics g) {
        Graphics2D g2 = (Graphics2D) g;
        g2.fill(body);
        g2.fill(hood);
        g2.fill(trunk);
        g2.draw(body);
        g2.draw(hood);
        g2.draw(frontWheel);
        g2.draw(backWheel);
        g2.draw(trunk);
        g2.setColor(Color.BLACK);
        g2.fill(frontWheel);
        g2.fill(backWheel);
    }

    public void moveCar(int dx, int dy) {//each tick, this method is called, and translates the shapes with given values
        body.translate(dx, dy);
        hood.translate(dx, dy);
        frontWheel.translate(dx, dy);
        backWheel.translate(dx, dy);
        trunk.translate(dx, dy);
        repaint();
    }
}
