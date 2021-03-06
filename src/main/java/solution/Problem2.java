package solution;

/*
Even Fibonacci numbers
Problem 2
Each new term in the Fibonacci sequence is generated by adding the previous two terms. By starting with 1 and 2, the first 10 terms will be:

1, 2, 3, 5, 8, 13, 21, 34, 55, 89, ...

By considering the terms in the Fibonacci sequence whose values do not exceed four million, find the sum of the even-valued terms.
 */

public class Problem2 {

    int getSumOfEvenNumbersInFibonacci(int threshold) {
        return getFibonacci(1, 2, 0, threshold);
    }

    int getFibonacci(int term1, int term2, int sum, int threshold) {
        if (term2 >= threshold) {
            return sum;
        }
        int nextNum = term1 + term2;
        if (term2 % 2 == 0) {
            sum += term2;
        }
        return getFibonacci(term2, nextNum, sum, threshold);
    }

    public static void main(String args[]) {
        Problem2 problem2 = new Problem2();
        System.out.println("\nSum of all the even-valued terms in Fibonacci sequence below threshold of 4 million: " + problem2.getSumOfEvenNumbersInFibonacci(4000000));
    }
}
