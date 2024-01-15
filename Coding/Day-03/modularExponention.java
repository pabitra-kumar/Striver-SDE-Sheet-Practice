public class modularExponention {
    public static void main(String[] args) {
        System.out.println(modularExponentiation(10000000, 10, 10000005));
    }

    public static int findExp(long x, long n, long m) {
        if (n == 0)
            return 1;
        long sq = findExp(x, n / 2, m);
        int res = (int) (((sq % m) * sq) % m);
        if (n % 2 == 1)
            return (int) (((long) res * x) % m);
        return res;
    }

    public static int modularExponentiation(int x, int n, int m) {
        return findExp(x, n, m);
    }
}
