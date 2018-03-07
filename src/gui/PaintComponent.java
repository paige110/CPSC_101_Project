package gui;

import bead.Bead;
import board.Board;
import java.awt.*;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.*;
import peg.Peg;

public class PaintComponent extends JComponent implements MouseListener {

    private final int myAx = 0;
    private final int myAy = 70;
    private final int myBx = 85;
    private final int myBy = 170;
    private final int myCx = 170;
    private final int myCy = 270;
    private final int myDx = 250;
    private final int myDy = 370;

    boolean click = false;

    int beadX;
    int beadY;

    Board board = new Board();

    public PaintComponent() {
        addMouseListener(this);
    }

    public PaintComponent(int x, int y) {
        beadX = x;
        beadY = y;
    }

    public Peg[] myPegs = {new Peg(myAx, myAy, "A1"),
        new Peg(myAx + 207, myAy - 43, "A2"),
        new Peg(myAx + 413, myAy - 86, "A3"),
        new Peg(myAx + 620, myAy - 130, "A4"),
        new Peg(myBx, myBy, "B1"),
        new Peg(myBx + 207, myAy + 57, "B2"),
        new Peg(myBx + 413, myAy + 14, "B3"),
        new Peg(myBx + 637, myAy - 39, "B4"),
        new Peg(myCx, myCy, "C1"),
        new Peg(myCx + 207, myAy + 157, "C2"),
        new Peg(myCx + 413, myAy + 114, "C3"),
        new Peg(myCx + 653, myAy + 61, "C4"),
        new Peg(myDx, myDy, "D1"),
        new Peg(myDx + 225, myAy + 245, "D2"),
        new Peg(myDx + 450, myAy + 190, "D3"),
        new Peg(myDx + 675, myDy - 162, "D4")};

    @Override
    public void paintComponent(Graphics g) {

        try {
            Graphics2D g2 = (Graphics2D) g;

            board.draw(g2);
            int i = 0;
            for (Peg myPeg : myPegs) {

                String name = myPeg.getName();
                i++;
                System.out.println(name);
                myPeg.draw(g2);
            }
            System.out.println(i);
            /*if (player.getColour() == white && mouse click == true)
            {
            if peg.Height == 0
            Bead bead1 = new Bead(20, 395);
        }*/

            if (click == true) {
                Bead bead = new Bead(beadX, beadY);
                bead.drawBlack(g2);
            }

        } catch (IOException ex) {
            Logger.getLogger(PaintComponent.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

    @Override
    public void mouseClicked(MouseEvent e) {
        beadX = e.getX();
        beadY = e.getY();
        if (!click) {
            beadX = e.getX();
            beadY = e.getY();
            click = true;
        }
        repaint();
    }

    @Override
    public void mousePressed(MouseEvent e) {
    }

    @Override
    public void mouseReleased(MouseEvent e) {
    }

    @Override
    public void mouseEntered(MouseEvent e) {

    }

    @Override
    public void mouseExited(MouseEvent e) {
    }

}
