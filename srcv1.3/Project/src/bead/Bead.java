package bead;

import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import javax.imageio.ImageIO;

public class Bead {

    int myX = 0;
    int myY = 0;
    int myTurn;
    BufferedImage bead;

    public Bead(int x,int y,int myTurn) {
        myX = x;
        myY = y;
        this.myTurn=myTurn;
    }

    public void drawWhite(Graphics g,int x,int y) throws IOException {
        Graphics2D g2 = (Graphics2D) g;
        myX=x;
        myY=y;
        bead = ImageIO.read(new File("images\\beadWhite.png"));
        g2.drawImage(bead, myX - 20, myY - 20, null);
    }

    public void drawBlack(Graphics g) throws IOException {
        Graphics2D g2 = (Graphics2D) g;
        bead = ImageIO.read(new File("images\\beadBlack.png"));
        g2.drawImage(bead, myX - 20, myY - 20, null);
        
    }
    public void draw(Graphics g)throws IOException{
        Graphics2D g2= (Graphics2D) g;
        if((myTurn%2)==0){
            bead = ImageIO.read(new File("images\\beadWhite.png"));
            g2.drawImage(bead,myX-20,myY-20,null);
        }
        else{
            bead = ImageIO.read(new File("images\\beadBlack.png"));
            g2.drawImage(bead, myX - 20, myY - 20, null);
        }
    }   


}


/*

String colour;

bead class getColour()
{
return colour;
}



(in drawWHite)
{
colour = white;
}

vica versa for bl
*/