public class Count_Primes_204 {
    public static void main(String[] args) {

        System.out.println("counttPrimes(100) = " + counttPrimes(100));
    }

    public static int counttPrimes(int n) {
        boolean[] prime = new boolean[n];


        for (int i = 2; i * i < prime.length; i++) {
            if (!prime[i]) {
                for (int j = i; j * i < prime.length; j++) {
                    prime[i * j] = true;
                }
            }
        }

        int count = 0;
        for (int i = 2; i < prime.length; i++) {
            if (!prime[i]) {
                count++;
            }
        }
        return count;
    }


    public static int countPrimes(int n) {
        int count = 0;
        for (int i = 0; i < n; i++) {
            if (isPrime(i)) {
                System.out.println("n = " + i);
                count++;
            }
        }
        return count;
    }

    public static boolean isPrime(int n) {
        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }
}

