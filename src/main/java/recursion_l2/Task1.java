package recursion_l2;

public class Task1 {
    public double myPow(double x, int n) {
        if (x == 0) return 0;
        if (n == 0) return 1;
        if (n < 0){
            return 1 / x * myPow(1 / x, -(n + 1));
        }

        double k = myPow(x, n/2);
        if (n % 2 == 0){
            return k * k;
        } else {
            return k * k * x;
        }
    }
}
