package recursion_l2;

public class Task3 {
    public int[] temp;

    public int climbStairs(int n) {
        temp = new int[n+1];
        temp[0] = 1;
        temp[1] = 1;

        rec(n);
        return temp[n];

    }
    public int rec(int n){
        if (temp[n] != 0){
            return temp[n];
        }

        temp[n] = rec(n-1) + rec(n-2);
        return temp[n];
    }
}
