package project13;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class test05_Poker extends test05_Cardgame{
    //자기만의 프로그램 -> 상속, 오버라이딩, 오버로딩...
	//카드게임(카드덱, 승률, 상금, 플레이어) -> blackjack(딜러, 카드받기, A특수성), poker(공용카드, 카드받기, 카드제출)
    Scanner sc = new Scanner(System.in);
    private int players;
    private String pa;
    private String nu;
	
    test05_Poker(){
    	players = 0;
    }
    
    test05_Poker(int players){
    	this.players = players; 
    }
    test05_Poker(String pa, String nu){
    	this.pa = pa;
    	this.nu = nu;
    }
    
    @Override
    public String toString() {
    	System.out.println("최대 플레이어는 5명 입니다.");
    	players = sc.nextInt();
    	return "플레이어는 "+players+"명 입니다."+"\n";
    }
    int getPlayers() {
    	return players;
    }
    void play() {
    	test05_Cardgame deck = new test05_Cardgame();
    	test05_Cardgame commu = new test05_Cardgame("커뮤니티 카드");
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
    	for(int i = 0; i<3; i++){
			commucard.add(deck.drawCard());
		}
    	System.out.println(commu.getplayer()+": "+commucard);
		
		for(int i = 0; i<2; i++){
			String OK = sc.next();
			if(OK.equals("ok"))
			commucard.add(deck.drawCard());
			System.out.println(commu.getplayer()+": "+commucard);
		}
		System.out.println();
//		for(int i = 0; i<2; i++) {
//			test05_Cardgame card1 = deck.drawCard();
//			test05_Cardgame card2 = deck.drawCard();
//			
//			System.out.println(p1.getplayer()+": "+card1);
//			System.out.println(p2.getplayer()+": "+card2);
//		}
	}
    
    
    void play(int a) {
    	test05_Cardgame deck = new test05_Cardgame(1);
    	test05_Cardgame commu = new test05_Cardgame("커뮤니티 카드");
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
    	for(int i = 0; i<3; i++){
			commucard.add(deck.drawCard());
		}
    	System.out.println(commu.getplayer()+": "+commucard);
		
    	for(int i = 0; i<2; i++){
			String OK = sc.next();
			if(OK.equals("ok"))
			commucard.add(deck.drawCard());
			System.out.println(commu.getplayer()+": "+commucard);
		}
		System.out.println();
	}
		
		
		
//    public String result(ArrayList<test05_Poker> playerHand, ArrayList<test05_Poker> commucard) {
//    	ArrayList<test05_Poker> allcards = new ArrayList<>(playerHand);
//    	allcards.addAll(commucard);
//    	
//    	if(allcards.contains(RoyalFlush)) {
//    		return "Royal Flush";
//    	}
//    	return "High Card";
//    }
//    public static Ranking rank(ArrayList<test05_Cardgame> playerHand, ArrayList<test05_Cardgame> commucard) {
//    	ArrayList<test05_Cardgame> allcards = new ArrayList<>(playerHand);
//    	allcards.addAll(commucard);
//    	Collections.sort(allcards);
//    	
//    	
//    	
//    }
//    public ArrayList<String> RoyalFlush = new ArrayList<>();
//    public String[] pas = {"스페이드", "하트", "클로버", "다이아"};
//    public String[] nus = {"10", "J", "Q", "K", "A"};
//    
//    for(test05_Poker t : playerHand) {
//    	RoyalFlush.add(t);
//    }
//    for(String pa : pas){
//    	if(pa.equals("클로버"))
//        	for(String nu : nus){
//        		RoyalFlush.add(new test05_Poker(pa,nu));
//        	}
//    }

}


	
	









enum Ranking {
    ROYAL_FLUSH, STRAIGHT_FLUSH, FOUR_OF_A_KIND, FULL_HOUSE, FLUSH,
    STRAIGHT, THREE_OF_A_KIND, TWO_PAIR, ONE_PAIR, HIGH_CARD
}
