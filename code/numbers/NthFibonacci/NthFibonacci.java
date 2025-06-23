package code.numbers.NthFibonacci;

import java.math.BigInteger;
import java.util.HashMap;

public class NthFibonacci {
    public static HashMap<Integer,BigInteger> foundStorage = new HashMap<>();
    public static BigInteger findNthFibonacci(int n) {

        if(foundStorage.containsKey(n)) {
            return foundStorage.get(n);
        }
        else if(n <= 0) {
            return BigInteger.valueOf(0);
        }
        else if(n == 1 || n == 2) {
            return BigInteger.valueOf(1);
        }
        else {
            BigInteger result = findNthFibonacci(n-1).add(findNthFibonacci(n-2));
            foundStorage.put(n,result);
            return result;
        }
    }
}
