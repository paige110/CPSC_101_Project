package cpsc101.mgoertzen.lab6_a;

import javax.swing.*;

public class Viewer {

    public static void main(String[] args) {
        JFrame frame = new JFrame("Triangle Draw");
        frame.setSize(600, 500);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        TriangleComponent component = new TriangleComponent();
        frame.add(component);
        frame.setVisible(true);

    }
}
