/*
 In mathematics, the Fibonacci sequence is a sequence in which each number is the sum of the two preceding ones. 
Individual numbers in the Fibonacci sequence are known as Fibonacci numbers
 */
package algorithms;

/**
 *
 * @author JOWEN
 */
public class FibonacciSequence {
    
    // Here is a recursive for Fibonacci Sequence
    // The thing is its slow as the value of parameters become higher
    public int fibonacciRecursive(int num) {
        if (num <= 1) {
            return num;
        } else {
            return fibonacciRecursive(num - 1) + fibonacciRecursive(num-2);
        }
    }
    
    /*
    This is more effecient compared to the simple recursive function 
     This is possible because of the programming technique called memoization
     It is a technique wherein we store some values in an array for future use so that
     we wouldn't need to compute some data again saving us a lot of time and memory.
    */
    
    public int fibonacciMemoization(int num) {
        int[] memo = new int[num+1];
        return fibonacciMemoizationHelper(num, memo);
    }
    public int fibonacciMemoizationHelper(int num, int[] memo) {
        if (num <= 1) {
            return num;
        } else if (memo[num] != 0) {
            return memo[num];
        } else {
            memo[num] = fibonacciMemoizationHelper(num-1, memo) + fibonacciMemoizationHelper(num-2, memo);
            return memo[num];
        }
    }
    
    /*
    
    Using Dyanamic Programming, with the help of for loop we simulate the fibonacci
    by creating an array and then adding the previous number to the latest number
    */
    public int fibonacciDynamic(int num) {
        int[] arr = new int[num + 1];
        arr[0] = 0;
        arr[0] = 1;
        for (int i = 2;i < num;i++) {
            arr[i] = arr[i - 1] + arr[i - 2];
        }
        return arr[num];
    }
    
    public FibonacciSequence() {
        
    }
}
