package code.numbers.pitotheDecimal;

//Chudnovsky algorithm
//Wrong after 15'th digit, I dont know why

import java.math.BigDecimal;
import java.math.RoundingMode;

public class PiToTheDecimal {
    private static final RoundingMode rounding = RoundingMode.HALF_EVEN;
    public static BigDecimal printPiToTheDecimal(int decimal, int presicion) {
        BigDecimal infiniteSum = BigDecimal.ZERO;
        for(int k = 0;k < presicion;k++) {
            infiniteSum = infiniteSum.add(BigDecimal.valueOf(factorial(6 * k) * (545140134 * k + 13591409))
                    .divide(BigDecimal.valueOf(factorial(3 * k) * Math.pow(factorial(k), 3) * Math.pow(-262537412640768000L, k)),decimal,rounding));

        }
        return BigDecimal.valueOf(426880 * Math.sqrt(10005)).divide(infiniteSum,decimal,rounding);

    }

    //Takes factorial of the number
    public static long factorial(int number) {
        long result = 1;

        for (int factor = 2; factor <= number; factor++) {
            result *= factor;
        }

        return result;
    }
}
