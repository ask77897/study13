package project13;
import java.util.ArrayList;
import java.util.Collections;

public class test05_Cardgame {
    //자기만의 프로그램 -> 상속, 오버라이딩, 오버로딩...
	//카드게임(카드덱, 승률, 상금, 플레이어) -> blackjack(딜러, 카드받기, A특수성), poker(공용카드, 카드제출)
    private ArrayList<test05_Cardgame> cards = new ArrayList<>();
	private int rate;
    private int prize;
    private int betting;
    private int numb;
    private String player;
    private String pattern;
    private String num;

	test05_Cardgame(){//텍사스 홀덤
        cards = new ArrayList<>();
        String[] patterns = {"♠", "♥", "♣", "◆"};
        String[] nums = {"2", "3", "4", "5", "6", "7", "8", "9", "10", "J", "Q", "K", "A"};

        for(String pattern : patterns){
            for(String num : nums){
                cards.add(new test05_Cardgame(pattern,num));
            }
        }
    }
	test05_Cardgame(int a){//숏덱
        cards = new ArrayList<>();
        String[] patterns = {"♠", "♥", "♣", "◆"};
        String[] nums = {/*"2", "3", "4", "5",*/ "6", "7", "8", "9", "10", "J", "Q", "K", "A"};

        for(String pattern : patterns){
            for(String num : nums){
                cards.add(new test05_Cardgame(pattern,num));
            }
        }
    }
	test05_Cardgame(double b){//블랙잭
        cards = new ArrayList<>();
        String[] patterns = {"♠", "♥", "♣", "◆"};
        String[] nums = {"2", "3", "4", "5", "6", "7", "8", "9", "10", "J", "Q", "K", "A"};
//        int[] nums = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 10, 10, 10, 11};

        for(int i=0; i<2; i++) {
        	for(String pattern : patterns){
        		for(String num : nums){
        			cards.add(new test05_Cardgame(pattern,num));
        		}
        	}        	
        }
    }
	test05_Cardgame(String pattern, int numb){
		this.pattern = pattern;
		this.numb = numb;
	}
	
    test05_Cardgame(String num, String pattern){
        this.num = num;
        this.pattern = pattern;
    }

    test05_Cardgame(String player){
        this.player = player;
    }

//    test05_Cardgame(String player, int rate){
//        this.player = player;
//        this.rate = rate;
//        prize = 0;
//    }

    test05_Cardgame(String player, int rate, int prize){
        this.player = player;
        this.rate = rate;
        this.prize = prize;
    }

    @Override
    public String toString(){
        return num + " " + pattern;
    }
    
    public String getplayer() {
    	return this.player;
    }

    public void shuffle(){
        Collections.shuffle(cards);
    }

    public test05_Cardgame drawCard(){
        if(cards.isEmpty()){
            return null;
        }
        return cards.remove(0);
    }
    public int getNumb() {
    	return numb;
    }
    public String getPattern() {
    	return pattern;
    }
    





}
