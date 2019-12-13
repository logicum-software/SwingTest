public class CalculatingPrimesThread extends Thread {
    public void run() {

        int nPrimes = 0;

        for (int i = 3; i < 10000; i++) {
            for (int z = 2; z < i; z++) {
                if (i % z == 0) {
                    break;
                }
                if (z == i - 1)
                    nPrimes++;
            }
        }
        System.out.println(nPrimes);
    }
}
