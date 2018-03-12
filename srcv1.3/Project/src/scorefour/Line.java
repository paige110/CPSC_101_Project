package scorefour;



import java.awt.*;
import peg.Peg;

public class Line {

    Peg[] pegs = new Peg[100];

    public boolean check(Peg currentPeg, int indexPeg) {

        int indexnumber = (indexPeg % 4),
                height = currentPeg.height;

        Color color = currentPeg.array[currentPeg.height].getColour();


        if (color == pegs[indexnumber + 4].array[height].c && color == pegs[indexnumber + 8].array[height].c && color == pegs[indexnumber + 12].array[height].c) {    // To check beads at the same height of the bead added
            return true;
        }

        if (color == pegs[indexnumber + 4].array[height + 1].c && color == pegs[indexnumber + 8].array[height + 2].c && color == pegs[indexnumber + 12].array[height + 3].c) {
            return true;
        }

        if (color == pegs[indexnumber + 4].array[height - 1].c && color == pegs[indexnumber + 8].array[height - 2].c && color == pegs[indexnumber + 12].array[height - 3].c) {
            return true;
        }


        indexnumber = (indexPeg / 4) * 4;

        if (color == pegs[indexnumber + 1].array[height].c && color == pegs[indexnumber + 2].array[height].c && color == pegs[indexnumber + 3].array[height].c) {
            return true;
        }


        if (color == pegs[indexnumber + 1].array[height + 1].c && color == pegs[indexnumber + 2].array[height + 2].c && color == pegs[indexnumber + 3].array[height + 3].c) {
            return true;
        }


        if (color == pegs[indexnumber + 1].array[height - 1].c && color == pegs[indexnumber + 2].array[height - 2].c && color == pegs[indexnumber + 3].array[height - 3].c) {
            return true;
        }


        if (indexPeg % 3 == 0) {

            if (color == pegs[3].array[height].c && color == pegs[6].array[height].c && color == pegs[9].array[height].c && color == pegs[12].array[height].c) {
                return true;
            }

            if (color == pegs[3].array[0].c && color == pegs[6].array[1].c && color == pegs[9].array[2].c && color == pegs[12].array[3].c) {
                return true;
            }

            if (color == pegs[3].array[3].c && color == pegs[6].array[2].c && color == pegs[9].array[1].c && color == pegs[12].array[0].c) {
                return true;
            }

        }

        if (indexPeg % 5 == 0) {

            if (color == pegs[0].array[height].c && color == pegs[5].array[height].c && color == pegs[10].array[height].c && color == pegs[15].array[height].c) {
                return true;
            }

            if (color == pegs[0].array[0].c && color == pegs[5].array[1].c && color == pegs[10].array[2].c && color == pegs[15].array[3].c) {
                return true;
            }

            if (color == pegs[0].array[3].c && color == pegs[5].array[2].c && color == pegs[10].array[1].c && color == pegs[15].array[0].c) {
                return true;
            }

        }

        return false;

    }

}