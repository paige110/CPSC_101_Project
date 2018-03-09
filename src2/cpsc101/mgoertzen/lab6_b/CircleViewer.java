package cpsc101.mgoertzen.lab6_b;

import javax.swing.*;

public class CircleViewer {

    public static void main(String[] args) {
        JFrame frame = new JFrame("CIRCLES");
        frame.setSize(600, 500);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        CircleComponent component = new CircleComponent();
        frame.add(component);
        frame.setVisible(true);

    }
}
