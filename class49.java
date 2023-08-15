package project13;

public class class49 {

	public static void main(String[] args) {
//		class49_Thread thread = new class49_Thread();
//		thread.start();
//		
//		class49_Exam exam = new class49_Exam();
//		Thread thread2 = new Thread(class49_Exam);
//		thread2.start();
//		
//		System.err.println();//쉽게 볼 수 있는 쓰레드 예시
		MultiThread multi1 = new MultiThread(1);
		MultiThread multi2 = new MultiThread(2);
		MultiThread multi3 = new MultiThread(3);
		
		multi1.start();
		multi2.start();
		multi3.start();
		
	}

	
	
}	
class class49_Thread extends Thread{
	@Override
	public void run() {
		//원하는 작업을 실행한다.
		System.out.println("쓰레드를 실행함");
	}
}

//interface class49_test implements Runnable{
//	@Override
//	public void run() {
//		System.out.println("쓰레드를 실행함2.");
//	}
//}

class Counter{
	private int count;
	
	public synchronized void increment() {
		count++;
	}
	public synchronized void decrement() {
		count--;
	}
	
	public void printCount() {
		System.out.println(count);
		synchronized(this) {
			count*=2;			
		}
	}
	public int getCount() {
		return count;
	}
}
class MultiThread extends Thread{
	private int id;
	
	public MultiThread(int id) {
		this.id = id;
	}
	@Override
	public void run() {
		for(int i = 0; i<10; i++) {
			System.out.println("ID: "+id +" : "+ i);
			try {
				sleep(1000);
			}catch(InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
}



//쓰레드(Thread)
//프로그램의 작업 흐름

//멀티쓰레드 -> 멀티쓰레딩(MultiThreading) : 쓰레드를 동시에 실행시킨다.

//쓰레드 사용방법
//1. Thread 클래스를 상속받아서 사용하기
//2. Runnable 인터페이스를 상속받아 사용하기

//쓰레드의 문제점
//데이터 경쟁(race condition) -> 여러 개의 쓰레드가 동시에 공유된 데이터 접근하여 발생할 수 있는 문제.
//synchronized 키워드 사용
//원하는 코드에 한번에 쓰레드 하나씩만 접근 가능하게 된다. 
