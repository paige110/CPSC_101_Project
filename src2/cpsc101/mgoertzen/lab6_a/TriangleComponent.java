package cpsc101.mgoertzen.lab6_a;

import java.awt.*;
import java.awt.event.MouseListener;
import java.awt.event.MouseEvent;
import javax.swing.*;
import java.awt.geom.*;

public class TriangleComponent extends JPanel implements MouseListener {

    boolean drawPoint = false;
    boolean drawLine = false;
    boolean drawTriangle = false;
    int points = 0;
    int pointX;
    int pointY;
    int lineX;
    int lineY;
    int firstX;
    int firstY;

    public TriangleComponent() {
        pointX = 0;
        pointY = 0;
        lineX = 0;
        lineY = 0;
        addMouseListener(this);
    }

    @Override
    public void paintComponent(Graphics g) {
        Graphics2D g2 = (Graphics2D) g;
        Ellipse2D.Double point = new Ellipse2D.Double(pointX - 2, pointY - 2, 4, 4);

        if (drawLine) {
            if (points < 4) {
                g2.drawLine(pointX, pointY, lineX, lineY);
            }
            if (points == 3) {//on third click, triangle is closed
                g2.drawLine(pointX, pointY, firstX, firstY);
            }
        }

        //drawPoint starts as false so point will not be drawn until mouse ic clicked
        if (drawPoint) {

            g2.fill(point);
            g2.draw(point);
            lineX = pointX;
            lineY = pointY;
            drawLine = true;
        }
        //clears component on 4th mouse click
        if (points > 3) {
            g2.clearRect(0, 0, 600, 500);
            repaint();
            points = 1;
        }
    }

    @Override
    public void mouseClicked(MouseEvent mouse) {//sets values for mouse click location

        pointX = mouse.getX();
        pointY = mouse.getY();
        if (!drawPoint) {
            pointX = mouse.getX();
            pointY = mouse.getY();
            drawPoint = true;
        }
        //increments number of clicks and repaints component
        points++;
        repaint();
    }

    @Override
    public void mouseEntered(MouseEvent mouse) {
    }

    @Override
    public void mouseExited(MouseEvent mouse) {
    }

    @Override
    public void mousePressed(MouseEvent mouse) {
    }

    @Override
    public void mouseReleased(MouseEvent mouse) {
        if (points == 1) {
            firstX = pointX;
            firstY = pointY;
        }
    }
}
