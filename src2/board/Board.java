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
 int beadCount;
 int xIndex,yIndex,zIndex;
    BufferedImage image;

    public Board() {
       /* addMouseListener(this);
        addMouseMotionListener(new MouseMotionListener(){
         
         @Override
         public void mouseMoved(MouseEvent e){
         }
        
        } 
    }*/
    public void restartGame(){
      for(int i=0;i<peglist.length;i++)
          peglist[i]=null;
       gameOver=false;
       beadCount=0;
       repaint();     
    }
    public void draw(Graphics g) throws IOException {

        Graphics2D g2 = (Graphics2D) g;
        image = ImageIO.read(new File("images\\emptyboard.png"));
        g2.drawImage(image, 30, 300, null);

    }
}
