# Module-8-Concurrency
Module 8 | Concurrency Assignment:
ArraySum.Java contains the main method that will create the array of random integers and run the threads.
Both Multi and Single thread java files will take int[] array and add each number together, finding the total.
  Single thread will add each element of the array and print the result.
  Multithread will split the array into two seperate arrays, then both thread 1 and thread 2 will display their results
    * Need to find a way to get both threads to add to one total. As of right now, each thread gets the correct number 
      using its own half of the original array, but does not add them together.
