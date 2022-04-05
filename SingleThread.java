package arraySum;

import java.util.stream.IntStream;

public class SingleThread extends Thread {
	private int[] randomNum;

	public SingleThread(int[] randomNum) {
		this.randomNum = randomNum;
	}

	@Override
	public void run() {
		long startTime = System.nanoTime();

		int sum = IntStream.of(randomNum).sum();

		long endTime = System.nanoTime();
		long duration = (endTime - startTime);

		System.out.println("The sum is " + sum + " found in " + duration + " nanoseconds. Found in single thread.");
	}
}
