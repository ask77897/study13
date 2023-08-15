package project13;

public class class48_Exam2 {

	public static void main(String[] args) {
		int[] arr = {1, 2, 3, 4, 5};
		
		try {
			for(int i =0; i<10; i++) {
				System.out.println(arr[i]);
			}
		}catch(ArrayIndexOutOfBoundsException e) {
			System.out.println("배열의 범위를 초과했습니다.");
		}

	}

}
