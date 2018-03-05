package bead;

import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import javax.imageio.ImageIO;

public class Bead {

    int myX = 0;
    int myY = 0;
    BufferedImage bead;

    public Bead(int x, int y) {
        myX = x;
        myY = y;
    }

    public void drawWhite(Graphics g) throws IOException {
        Graphics2D g2 = (Graphics2D) g;
        bead = ImageIO.read(new File("images\\beadWhite.png"));
        g2.drawImage(bead, myX, myY, null);
    }

    public void drawBlack(Graphics g) throws IOException {
        Graphics2D g2 = (Graphics2D) g;
        bead = ImageIO.read(new File("images\\beadBlack.png"));
        g2.drawImage(bead, myX, myY, null);
    }
       


}
