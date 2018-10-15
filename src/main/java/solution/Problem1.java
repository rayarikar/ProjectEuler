package solution;

/*
Multiples of 3 and 5
Problem 1
If we list all the natural numbers below 10 that are multiples of 3 or 5, we get 3, 5, 6 and 9. The sum of these multiples is 23.

Find the sum of all the multiples of 3 or 5 below 1000.
 */

public class Problem1 {

    int getSumOfMultiples(int threshold) {
        int sum = 0;
        for (int i = 1; i < threshold; i++) {
            if (i % 3 == 0 || i % 5 == 0) {
                sum += i;
            }
        }
        return sum;
    }
    
    public static void main(String args[]) {
        Problem1 problem1 = new Problem1();
        System.out.println("\nSum of all the multiples of 3 & 5 below 1000: " + problem1.getSumOfMultiples(1000));
    }
}
