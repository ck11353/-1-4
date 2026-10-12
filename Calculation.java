package question3;

public class Calculation {
    public int calculateFactorial(int n) {
        if (n <= 1) {
            return 1;
        }
        return n * calculateFactorial(n - 1);
    }
}

