package aula02;

public class Exemplo {
	public static void main(String[] args) {
		class HelloParalelo implements Runnable {
			public void run() {
			System.out.println("Hello world paralelo!");
			}
		}
			Thread t1 = new Thread(new HelloParalelo());
			t1.start();
			System.out.println("Thread principal: " + Thread.currentThread().getName());
	}
}
