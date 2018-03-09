package cpsc101.mgoertzen.lab6_c;

import javax.swing.JFrame;

public class CarViewer {

    public static void main(String[] args) {
        JFrame frame = new CarFrame();
        frame.setTitle("vroom vroom");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }
}
