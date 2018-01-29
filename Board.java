package Score_4;

public class Board {

    private char[][] board;
    player p1;
    player p2;



    Board(player p1, player p2){

        this.p1 = p1;
        this.p2 = p2;
        for(int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                board[i][j] = ' ';
            }
        }

    }


    public void print() {
        // TODO Auto-generated method stub
        System.out.println("     =============");

        for(int i = 0; i < 4; i++){
            System.out.print("    || ");
            for(int j = 0; j < 3; j++){
                System.out.print(board[i][j]+" | ");
            }
            System.out.print("  || ");
            System.out.println("      ");
        }
        System.out.println("     =============");
    }



}
