package project13;

import java.util.InputMismatchException;
import java.util.Scanner;

public class class48_Exam1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		try {
			System.out.println("number: ");
			int n1 = sc.nextInt();
			System.out.println("number: ");
			int n2 = sc.nextInt();
			
			int result = n1/n2;
			System.out.println("result: "+result);
		}catch(ArithmeticException e) {
			System.out.println("0으로 나눌 수 없습니다.");
		}catch(InputMismatchException e) {
			System.out.println("올바른 숫자를 입력해주세요");
		}

	}

}
