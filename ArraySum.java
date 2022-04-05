package arraySum;

import java.util.Arrays;
import java.util.Random;

public class ArraySum {

	public static void main(String[] args) {

		int[] randomNum = new int[200000000]; // Array, default 200 million.
		Random random = new Random();
		// Minimum and maximum numbers allowed in the array. Default 1-10. Listed as 11, it's actually 10.
		int min = 1;
		int max = 11;
		
		for (int i = 0; i < 200000000; i++) {
			randomNum[i] = random.nextInt(max - min) + min;
		}
		// System.out.println(Arrays.toString(randomNum)); // Uncomment to see array in console

		// Run both threads
		for (int i = 1; i <= 2; i++) {
			MultiThreading multiThread = new MultiThreading(randomNum, i);
			multiThread.start();
		}
		
		// Run single thread
		SingleThread singleThread = new SingleThread(randomNum);
		singleThread.start();
	}
}
