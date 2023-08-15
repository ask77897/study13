package project13;

public class class50 {

	public static void main(String[] args) {
		item<String> str = new item<>();
		str.setItem("아이템");
		
		item<Integer> itg = new item<>();
		itg.setItem(123);
		
		pair<String, String> str2 = new pair<>("첫째", "둘째");
		str2.getI1();
		str2.getI2();

		int num = 123456;
		String st = "123456";
		
//		Integer.MAX_VALUE;//int로 나타낼수 있는 가장 큰 값
//		Integer.MIN_VALUE;//int로 나타낼수 있는 가장 작은 값
		
//		Integer.parseInt(st);//문자열을 int로 변환해준다.
		//문자열 -> int(형변환)
		System.out.println(Integer.parseInt(st));
		int number = 0;
		for(int i=0; i<st.length(); i++) {
			number += st.charAt(i)-48;
			number *= 10;
		}
		number /= 10;
		System.out.println("number : "+number);
//		Integer.toString(num);//int를 문자열로 변환해준다.
		//int -> 문자열
		System.out.println(Integer.toString(num));
		String s = "";
		s+=num;
		System.out.println("number : "+num);
		
	}
	public static void func1(Object obj) {
		
	}

}

class item<T>{
	private T item;
	
	public void setItem(T item) {
		this.item = item;
	}
	
	public T getItem() {
		return item;
	}
}

class pair<T, U> {
	private T i1;
	private U i2;
	
	public pair(T i1, U i2) {
		this.i1 = i1;
		this.i2 = i2;
	}
	public T getI1() {
		return i1;
	}
	public U getI2() {
		return i2;
	}
	
	
	
	
	
	
}



//제네릭(Generic)
//클래스, 메소드, 인터페이스에서 매개변수 전달 받을 때 타입에 관계없이 사용할 수 있도록 해주는 기능
//타입을 <> 안에 적는다.
//ArrayList<Object>



//객체끼리 전달하면 프로그램이 실행되거나, 그와 비슷한 메소드, 자료구조 등이 있을 때 변수는 같이 사용할 수 없다.
//그러면 변수도 객체화할 수 있으면 어떨까?

//레퍼클래스(Wrapper Class)
//Integer -> int를 객체화 시켜줄 수 있는 클래스