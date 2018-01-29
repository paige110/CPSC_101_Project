package Score_4;

import java.util.Scanner;

public class Score_4 {


    Scanner scan = new Scanner(System.in);

    player p1;
    player p2;

    public char[] symbols_choice={'W','B'};
    public int symbolschoice=0;



    Score_4(){
        p1=getplayer();
        p2=getplayer();


    }


    private player getplayer(){

        String name;

        System.out.print("Enter the name for the player with symbol("+symbols_choice[symbolschoice]+") :");
        name=scan.next();

        player p=new player(name,symbols_choice[symbolschoice]);
        return  p;

    }

}
