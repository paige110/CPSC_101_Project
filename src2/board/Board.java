package board;

import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import javax.imageio.ImageIO;

public class Board {
 public static int rows=4;
 public static int cols=4;
 public static int height=4;   
 Point[] peglist=new Point[(rows+1)*(cols+1)];
 boolean gameOver=false;
 boolean isWhite=true;  
 int pegCount;
 int beadCount;
    BufferedImage image;

    public Board() {

    }
    public void restartGame(){
      for(int i=0;i<peg.length;i++)
          peg[i]=null;
       gameOver=false;
       pegCount=0;
       beadCount=0;
       repaint();     
    }
    public void draw(Graphics g) throws IOException {

        Graphics2D g2 = (Graphics2D) g;
        image = ImageIO.read(new File("images\\emptyboard.png"));
        g2.drawImage(image, 30, 300, null);

    }
}
