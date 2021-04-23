package Function;

import java.util.Scanner;

public class Player1 {
public static void main(String[] args){
Player1 play = new Player1();
play.player1(); 
}
	
	public void player1() {
	Scanner sc = new Scanner(System.in);
	System.out.println("choose rock, papper, siser");
	System.out.println("inputplayer1 turn");
	String inputplayer1 = sc.nextLine();
	System.out.println("inputplayer12 turn");
	String inputplayer2 = sc.nextLine();
	
    
	if(inputplayer1.equals(inputplayer2)) {
		System.out.println("both are same");
	}
	else if(inputplayer1.equals("rock") && inputplayer2.equals("papper")) {
		System.out.println("inputplayer2 win");
	}
	else if(inputplayer1.equals("papper") && inputplayer2.equals("rock")) {
		System.out.println("inputplayer1 win");
	}
	if(inputplayer1.equals("siser") && inputplayer2.equals("rock")) {
		System.out.println("inputplayer2 win");
	}
	if(inputplayer1.equals("rock") && inputplayer2.equals("siser")) {
		System.out.println("inputplayer1 win");
	}
	else if(inputplayer1.equals("papper") && inputplayer2.equals("siser")) {
		System.out.println("inputplayer2 win");
	}
	if(inputplayer1.equals("siser") && inputplayer2.equals("paper")) {
		System.out.println("inputplayer1 win");
	}
	
 }
	
}
