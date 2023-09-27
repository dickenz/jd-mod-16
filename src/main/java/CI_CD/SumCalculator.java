package CI_CD;

public class SumCalculator {
    public int sum(int n) throws IllegalArgumentException {
        if (n == 0) {
            throw new IllegalArgumentException("n must be a positive number");
        }

        int sum = 0;
        for (int i = 1; i <=n; i++) {
            sum += i;
        }

        return sum;
    }
}