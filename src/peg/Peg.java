package peg;

import bead.Bead;
import java.awt.*;
import java.awt.event.*;
import java.awt.image.BufferedImage;
import java.io.*;
import javax.imageio.ImageIO;
import javax.swing.*;

public class Peg {

    int myX = 0;
    int myY = 0;
    public int position;
    public Bead[] array = new Bead[4];
    public int height = 0;
    public BufferedImage peg;
    private String name;

    public Peg() {

    }

    public Peg(int x, int y, String n) {
        myX = x;
        myY = y;
        name = n;
    }

    public void draw(Graphics g) throws IOException {

        Graphics2D g2 = (Graphics2D) g;
        peg = ImageIO.read(new File("images\\peg2.png"));
        g2.drawImage(peg, myX, myY, null);
        //JButton[] pegButtons = {};
    }

    public JButton pegButton() {
        JButton button = new JButton(new ImageIcon("images\\peg2.png"));
        button.setBorderPainted(false);
        button.setFocusPainted(false);
        button.setContentAreaFilled(false);
        button.addActionListener(new PegListener());
        return button;
    }

    public class PegListener implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent x) {
            System.out.println("this is a peg");
        }

    }

    public void addBead(Bead bead) {      // Adding the bead to the peg
        if (height >= 4) {
            System.err.println("Maximum height of the Peg reached!");   // Printing an error line when going out of bounds
        } else if (height >= 0) {
            array[height] = bead; //  pointing the array index to the bead object
            height++;
        }
    }

    public void clearPeg() {
        int cnt = 0;
        while (cnt < height) {
            array[cnt] = null;
            cnt++;
        }
    }

    public int getHeight() {
        return (height);
    }

    public String getName()
    {
        return name;
}
}
