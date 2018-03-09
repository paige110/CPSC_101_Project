package cpsc101.mgoertzen.lab6_b;

import java.awt.*;
import java.awt.event.MouseListener;
import java.awt.event.MouseEvent;
import javax.swing.*;
import java.awt.geom.*;

public class CircleComponent extends JPanel implements MouseListener {//same as last question, but paintComponent is different
    
    boolean drawPoint = false;
    boolean drawCircle = false;
    int clicks = 0;
    int pointX;
    int pointY;
    int lastX;
    int lastY;
    
    public CircleComponent() {
        pointX = 0;
        pointY = 0;
        addMouseListener(this);
    }
    
    @Override
    public void paintComponent(Graphics g) {
        Graphics2D g2 = (Graphics2D) g;
        Ellipse2D.Double point = new Ellipse2D.Double(pointX - 2, pointY - 2, 4, 4);

        if (drawCircle) {
            int x = Math.abs(pointX - lastX);
            int y = Math.abs(pointY - lastY);
            double r =  Math.sqrt((y * y) + (x * x));//pythagorus
            g2.drawOval(lastX - (int)r, lastY - (int)r, (int)r * 2, (int)r * 2);
            
        }
        
        if (drawPoint) {
            
            g2.fill(point);
            g2.draw(point);
            lastX = pointX;
            lastY = pointY;
            drawCircle = true;
        }
        if (clicks > 2) {
            g2.clearRect(0, 0, 600, 500);
            repaint();
            clicks = 1;
            drawCircle = false;
        }
    }
    
    @Override
    public void mouseClicked(MouseEvent mouse) {
        
        pointX = mouse.getX();
        pointY = mouse.getY();
        if (!drawPoint) {
            pointX = mouse.getX();
            pointY = mouse.getY();
            drawPoint = true;
        }
        clicks++;
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
        
    }
}
