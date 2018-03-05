package scorefour;

import gui.GuiHandler;

public class Main {

    public static void main(String[] args) {

        GuiHandler gui = new GuiHandler();
        //gui.startGame();
        gui.createWindow();
        String name1 = gui.getName(1);
        String name2 = gui.getName(2);
        String colour1 = gui.getColour(1);
        String colour2 = gui.getColour(2);
        System.out.println(name1);
        System.out.println(name2);
        System.out.println(colour1);
        System.out.println(colour2);

    }

}
