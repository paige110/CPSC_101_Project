package Player;

public class Player {

    private final String colour;
    private final String name;

    public Player(String n, String c) {
        name = n;
        colour = c;
    }

    public String getName() {
        return name;
    }

    public String getColour() {
        return colour;
    }
}
