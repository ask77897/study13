package project13;

import java.util.ArrayList;
import java.util.Scanner;

public class test05_Blackjack extends test05_Cardgame{
	Scanner sc = new Scanner(System.in);
	private int players;
	
	test05_Blackjack(){
		players =0;
	}
	
	@Override
    public String toString() {
    	System.out.println("최대 플레이어는 5명 입니다.");
    	players = sc.nextInt();
    	return "플레이어는 "+players+"명 입니다."+"\n";
    }
	void play() {
    	test05_Cardgame deck = new test05_Cardgame(1.2);
    	test05_Cardgame commu = new test05_Cardgame("딜러 카드");
//    	test05_Cardgame p1 = new test05_Cardgame("플레이어1");
//    	test05_Cardgame p2 = new test05_Cardgame("플레이어2");
    	
    	deck.shuffle();
    	
    	ArrayList<ArrayList<test05_Cardgame>> playerHand = new ArrayList<>();
    	
		for(int i = 0; i<players; i++) {
	    	ArrayList<test05_Cardgame> hand = new ArrayList<>();
	    	for (int j = 0; j<2; j++) {
	    		hand.add(deck.drawCard());
	    	}
	    	playerHand.add(hand);
		}
		for(int i = 0; i<players; i++) {
			System.out.print("\n"+"player"+(i+1)+": ");
			for(test05_Cardgame card : playerHand.get(i)) {
				System.out.print(card+" ");
			}
		}
		System.out.println();
		
    	ArrayList<test05_Cardgame> commucard = new ArrayList<>();
    	for(int i = 0; i<2; i++){
			commucard.add(deck.drawCard());
		}
    	System.out.println(commu.getplayer()+": "+commucard);
		
    	
    	
    	ArrayList<test05_Cardgame> addhand = new ArrayList<>();
		for(int j = 0; j>=0; j++) {
			int cnt=0;
    		for(int i = 0; i<players; i++){
				String OK = sc.next();
				if(OK.equals("hit")) {
					addhand.add(deck.drawCard());
					System.out.println("players"+(i+1)+" hit");
				}
				else if(OK.equals("stay")) {
					addhand.add(null);
					cnt++;
					System.out.println("players"+(i+1)+" stay");
				}
			}
    		for(int i = 0; i<players; i++) {
    			System.out.print("\n"+"player"+(i+1)+": ");
    			for(test05_Cardgame card : playerHand.get(i)) {
    				System.out.print(card+" ");
    			}
    			if(cnt>=0) {
    				System.out.print(addhand.get(i)+" ");
    			}
    			if(cnt>1)
    				System.out.print(addhand.get(i+players));
    		}
    		System.out.println();
    		System.out.println(addhand);
    		if(cnt==players) {
    			break;
    		}
		}
			
			
			
			
		
//		for(int i = 0; i>=0; i++) {
//			if() {
//				
//			}
//		}
	}
}
