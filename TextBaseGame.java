
import java.util.Scanner;

public class TextBaseGame {
	
	public static void main(String[] args) {
		
		player1();
	}
	
	public static void player1() {
		int count = 0;
		while(count < 5) {
	Scanner sc = new Scanner(System.in);
	System.out.println("Total five chance");
	System.out.println("choose stone, paper, scissor");
	System.out.println("player1 turn");
	String inputplayer1 = sc.nextLine();
	System.out.println("player2 turn");                         
	String inputplayer2 = sc.nextLine();
	
    
	if(inputplayer1.equals("")) {
		System.out.println("plez enter the correct note");
	}
	else if(inputplayer1.equals(inputplayer2)) {
			System.out.println("########## both are same ##########");
	}
	else if(inputplayer1.equals("stone") && inputplayer2.equals("paper")) {
		System.out.println("########## player2 win ##########");
	}
	else if(inputplayer1.equals("paper") && inputplayer2.equals("stone")) {
		System.out.println("########## player1 win ##########");
	}
	if(inputplayer1.equals("scissor") && inputplayer2.equals("stone")) {
		System.out.println("########## player2 win ##########");
	}
	if(inputplayer1.equals("stone") && inputplayer2.equals("scissor")) {
		System.out.println("########## player1 win ##########");
	}
	else if(inputplayer1.equals("paper") && inputplayer2.equals("scissor")) {
		System.out.println("########## player2 win ##########");
	}
	if(inputplayer1.equals("scissor") && inputplayer2.equals("paper")) {
		System.out.println("########## player1 win ##########");
	}
		count = count+1;
		int re = 5-count;
		System.out.println("total:  "+count+" remaind chance "+re);
		}
	
 }
	
}
