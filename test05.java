 package project13;

public class test05 {

	public static void main(String[] args) {
		//자기만의 프로그램 -> 상속, 오버라이딩, 오버로딩...
		//카드게임(카드덱, 승률, 상금, 플레이어) -> blackjack(딜러, 카드받기, A특수성), poker(공용카드, 카드받기, 카드제출)
		//poker를 비슷한 게임룰을 가진걸로 오버로딩해보기.
		test05_Cardgame p1 = new test05_Cardgame("player1");
		test05_Cardgame p2 = new test05_Cardgame("player2");
		test05_Cardgame commu = new test05_Cardgame("커뮤니티 카드");
		test05_Cardgame deck = new test05_Cardgame();
		test05_Poker Pplay = new test05_Poker();
		test05_Blackjack Bplay = new test05_Blackjack();
		
//		deck.shuffle();
		System.out.println(Pplay);
		Pplay.play();//텍사스홀덤
//		Pplay.play(0);//숏덱
		
		
//		System.out.println(Bplay);
//		Bplay.play();//블랙잭
		
		
		
//		play.rank(test05_Cardgame commucard, null);
		
		
		
				
//		for(int i = 0; i<5; i++){
//			test05_Cardgame commucard = deck.drawCard();
//			System.out.println(commu.getplayer()+": "+commucard);
//		}
//		
//		for(int i = 0; i<2; i++) {
//			test05_Cardgame card1 = deck.drawCard();
//			test05_Cardgame card2 = deck.drawCard();
//			
//			System.out.println(p1.getplayer()+": "+card1);
//			System.out.println(p2.getplayer()+": "+card2);
//		}
		


	}

}
