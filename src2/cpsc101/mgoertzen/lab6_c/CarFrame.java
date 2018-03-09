package cpsc101.mgoertzen.lab6_c;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JFrame;
import javax.swing.Timer;

public class CarFrame extends JFrame {


    private final CarComponent scene;

    class TimerListener implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent event) {
            scene.moveCar(3,0);//moves car over 3 pixels per timer tick
        }
    }

    public CarFrame() {
        scene = new CarComponent();
        add(scene);

        setSize(800, 300);

        ActionListener listener = new TimerListener();

        final int DELAY = 10; // Milliseconds between timer ticks
        Timer t = new Timer(DELAY, listener);
        t.start();
    }
}
