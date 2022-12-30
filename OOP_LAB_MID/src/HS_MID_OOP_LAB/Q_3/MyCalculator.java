package HS_MID_OOP_LAB.Q_3;

public class MyCalculator implements AdvancedArithmetic {
    @Override
    public int divisor(int n) {
        int sum = 0;
        for (int i = 1; i <= n; i++) {
            if (n % i == 0)
                sum += i;
        }
        return sum;
    }
}
