package solution;

/*
Largest prime factor
Problem 3
The prime factors of 13195 are 5, 7, 13 and 29.

What is the largest prime factor of the number 600851475143 ?
 */

import java.math.BigInteger;

public class Problem3 {

    long getLargestPrimeFactor(BigInteger number) {
        System.out.println("Number in consideration: " + number.longValue());
        for (long i = number.longValue() / 2; i > 2; i--) {
            System.out.println("Processing: " + i);
            if (number.longValue() % i == 0) {
                System.out.println("Number: " + i);
                if (isNumberPrime(i)) {
                    return i;
                }
            }
        }
        return 1;
    }

    boolean isNumberPrime(Long number) {
//        BigInteger result = number.divide(BigInteger.valueOf(2));
        for (long i = 2; i < number / 2; i++) {
            if (number % i == 0)
                return false;
        }
        return true;
    }

    public static void main(String args[]) {
        Problem3 problem3 = new Problem3();
        System.out.println("\nLargest prime factor of 600851475143: " + problem3.getLargestPrimeFactor(new BigInteger("13195")));
    }
}

/**

 Let (A) = 105. (B) = 2 (we always start with 2), and we don't have a value for (C) yet.

 Is (A) divisible by (B)? No. Increment (B) by +1: (B) = 3. Is Is (A) divisible by (B)? Yes.
 (105/3 = 35). The largest divisor found so far is 3. Let (C) = 3. Update (A) = 35. Reset (B) = 2.

 Now, is (A) divisible by (B)? No. Increment (B) by +1: (B) = 3. Is (A) divisible by (B)? No.
 Increment (B) by +1: (B) = 4. Is (A) divisible by (B)? No. Increment (B) by +1: (B) = 5.
 Is (A) divisible by (B)? Yes. (35/5 = 7). The largest divisor we found previously is stored in (C).
 (C) is currently 3. 5 is larger than 3, so we update (C) = 5. We update (A)=7. We reset (B)=2.

 Then we repeat the process for (A), but we will just keep incrementing (B) until (B)=(A), because 7 is prime and
 has no divisors other than itself and 1.
 (We could already stop when (B)>((A)/2), as you cannot have integer divisors greater
 than half of a number - the smallest possible divisor (other than 1) of any number is 2!)

 So at that point we return (A) = 7.

 number A: 2
 current divisor B: 7
 largest divisor C: 7

 * **/