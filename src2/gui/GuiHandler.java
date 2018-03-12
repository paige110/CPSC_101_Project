package gui;

import Player.Player;
import java.awt.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.*;

public class GuiHandler {

    Player player1;
    Player player2;

    public void createWindow(Player p1, Player p2) {

        player1 = p1;
        player2 = p2;

        JFrame jf = new JFrame("Team Caffeine - Score Four");
        jf.setSize(1280, 900);
        jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        JPanel area = new JPanel(new BorderLayout());
        JPanel sideBar = new JPanel();
        sideBar.setLayout(new BoxLayout(sideBar, BoxLayout.PAGE_AXIS));
        JPanel p3 = new JPanel();
        sideBar.setBackground(Color.DARK_GRAY);

        MyItemListener lis=new MyItemListener();
        
        Color myColour = new Color(195, 173, 173);
        area.setBackground(myColour);
        JButton quit = new JButton("Quit");
        JButton start = new JButton("start");
        quit.addActionListener(lis);
        start.addActionListener(lis);


        JLabel label1 = new JLabel("Current Turn: ");
        JLabel textest = new JLabel("lel");

        PaintComponent board = new PaintComponent();

  
        sideBar.add(quit);
        sideBar.add(restart);
        sideBar.add(label1);
        sideBar.add(textest);

        JLabel label = new JLabel("It is Currently " + player1.getName() + "'s turn.");
        //JTextField textField = new JTextField("text field");

        p3.add(label);
        //p3.add(textField);
        label = new JLabel("It is Currently " + player2.getName() + "'s turn.");
        p3.add(label);
        area.add(board, BorderLayout.CENTER);
        jf.add(area, BorderLayout.CENTER);
        jf.add(sideBar, BorderLayout.EAST);
        jf.add(p3, BorderLayout.PAGE_END);
        jf.setVisible(true);

        System.out.println(player1.getName());
        System.out.println(player2.getName());
        System.out.println(player1.getColour());
        System.out.println(player2.getColour());
    }
private class MyItemListener implements ActionListener{
    public void actionPerformed(ActionEvent e){
    Object obj = e.getSource();
        if(obj==start){
         system.out.println("start a new game");
         Board.restartGame();
        }else if(obj==quit){
         system.exit(0);
        }
    }
}
}
