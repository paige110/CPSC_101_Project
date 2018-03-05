package gui;

import bead.Bead;
import board.Board;
import java.awt.*;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.*;
import peg.Peg;

public class PaintComponent extends JComponent {

    private final int myAx = 0;
    private final int myAy = 70;
    private final int myBx = 85;
    private final int myBy = 170;
    private final int myCx = 170;
    private final int myCy = 270;
    private final int myDx = 250;
    private final int myDy = 370;

    Board board = new Board();

    public Peg[] myPegs = {new Peg(myAx, myAy, "A1"),
        new Peg(myAx + 207, myAy - 43, "A2"),
        new Peg(myAx + 413, myAy - 86, "A3"),
        new Peg(myAx + 620, myAy - 130, "A4"),
        new Peg(myBx, myBy,  "B1"),
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
            for (Peg myPeg : myPegs) {
                System.out.println(myPeg.getName());
                myPeg.draw(g2);
            }
            /*if (player.getColour() == white && mouse click == true)
            {
            if peg.Height == 0
            Bead bead1 = new Bead(20, 395);
        }*/
            Bead bead1 = new Bead(20, 395);
            Bead bead2 = new Bead(20, 320);
            Bead bead3 = new Bead(20, 245);
            Bead bead4 = new Bead(20, 170);
            bead1.drawWhite(g2);
            bead2.drawBlack(g2);
            bead3.drawWhite(g2);
            bead4.drawBlack(g2);

            //if player == black && mouse click == true
            //Bead bead = new Bead(peg location);
            //bead.drawBlack
        } catch (IOException ex) {
            Logger.getLogger(PaintComponent.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

}
