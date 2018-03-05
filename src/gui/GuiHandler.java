package gui;

import java.awt.*;
import javax.swing.*;

public class GuiHandler {

    String name1;
    String name2;
    String color;
    String color2;

    public void startGame() {
        Boolean colorBoolean = false;
        Boolean nameBoolean = false;

        name1 = JOptionPane.showInputDialog(null, "Player 1,\nPlease Enter Your name: ");

        while (nameBoolean == false) {
            if (name1 != null && !name1.isEmpty()) {
                nameBoolean = true;
            } else {
                name1 = JOptionPane.showInputDialog(null, "" + name1 + "\nPlease enter a name:", "Invalid Name", JOptionPane.ERROR_MESSAGE);
            }
        }

        color = JOptionPane.showInputDialog(null, "Hello, " + name1 + "!\nPlease pick your colour (white or black):");

        while (colorBoolean == false) {
            color = color.toLowerCase();

            if (color.equals("white") || color.equals("black")) {

                JOptionPane.showMessageDialog(null, "Your bead colour is " + color + ". Press OK to continue.", "Colour Set", JOptionPane.NO_OPTION);
                colorBoolean = true;

            } else {

                color = JOptionPane.showInputDialog(null, "" + name1 + ", \nPlease choose either White or Black:", "Invalid Colour", JOptionPane.ERROR_MESSAGE);
            }
        }

        nameBoolean = false;
        name2 = JOptionPane.showInputDialog(null, "Player 2,\nPlease Enter Your name:");

        if (color.equals("black")) {
            color2 = "white";
        } else {
            color2 = "black";
        }

        while (nameBoolean == false) {
            if (name2 != null && !name2.isEmpty()) {
                JOptionPane.showMessageDialog(null, "Your bead colour is " + color2 + ". Press OK to start the game.", "Game Starting", JOptionPane.NO_OPTION);
                nameBoolean = true;
            } else {
                name2 = JOptionPane.showInputDialog(null, "" + name2 + "\nPlease enter a name: ", "Invalid Name", JOptionPane.ERROR_MESSAGE);
            }
        }

        createWindow();
    }

    public void createWindow() {
        JFrame jf = new JFrame("Team Caffeine - Score Four");
        jf.setSize(1280, 900);
        jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        JPanel area = new JPanel(new BorderLayout());
        JPanel sideBar = new JPanel();
        sideBar.setLayout(new BoxLayout(sideBar, BoxLayout.PAGE_AXIS));
        JPanel p3 = new JPanel();
        sideBar.setBackground(Color.DARK_GRAY);

        Color myColour = new Color(195, 173, 173);
        area.setBackground(myColour);
        JButton endTurn = new JButton("Submit");
        JButton quit = new JButton("Quit");

        JLabel label1 = new JLabel("Current Turn: ");
        JLabel textest = new JLabel("lel");

        PaintComponent board = new PaintComponent();
        sideBar.add(endTurn);
        sideBar.add(quit);
        sideBar.add(label1);
        sideBar.add(textest);

        JLabel label = new JLabel("It is Currently " + name1 + "'s turn.");
        //JTextField textField = new JTextField("text field");

        p3.add(label);
        //p3.add(textField);
        label = new JLabel("It is Currently " + name2 + "'s turn.");
        p3.add(label);
        area.add(board, BorderLayout.CENTER);

        jf.add(area, BorderLayout.CENTER);
        jf.add(sideBar, BorderLayout.EAST);
        jf.add(p3, BorderLayout.PAGE_END);
        jf.setVisible(true);
    }

    public String getName(int x) {
        if (x == 1) {
            return name1;
        } else {
            return name2;
        }
    }

    public String getColour(int x) {

        if (x == 1) {
            return color;
        } else if (color.equals("black")) {
            color2 = "white";
        } else {
            color2 = "black";
        }
        return color2;
    }
}
