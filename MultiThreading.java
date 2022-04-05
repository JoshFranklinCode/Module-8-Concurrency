package arraySum;

import java.util.stream.*;

public class MultiThreading extends Thread {
	private int[] randomNum;
	private int threadNumber;
	
	public MultiThreading (int[] randomNum, int threadNumber) {
		this.randomNum = randomNum;
		this.threadNumber = threadNumber;
	}
	
	@Override
	public void run() {
		long startTime = System.nanoTime();
		
		int n = randomNum.length;
		int position = randomNum.length / 2;
		
		int a[] = new int[position];
	    int b[] = new int[n - position];
		
		// Check current thread number, take half of array, put into another array?
		if (threadNumber == 1) {
			for (int i = 0; i < position; i++) {
				a[i] = randomNum[i];
			}
		} else if (threadNumber == 2) {
			for (int i = 0; i < n - position; i++) {
				b[i] = randomNum[i + position];
			}
		}
		
		// Need to get each thread to recognize the other's result.
		// Need to add both thread additions together into one.
		// Currently, the two numbers found in each thread, when added, WILL equal the total found in the single thread.
		int sum1 = IntStream.of(a).sum();
		int sum2 = IntStream.of(b).sum();
		int sum3 = sum1 + sum2;
		
		long endTime = System.nanoTime();
		long duration = (endTime - startTime);
		
		System.out.println("The sum is " + sum3 + " found in " + duration + " nanoseconds. Found in multithread. Thread " + threadNumber);
		
	}
}
