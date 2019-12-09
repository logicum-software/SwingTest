public class CalculatingPrimesThread extends Thread {
    public void run() {

        int nPrimes = 0;
        float fMod = 0;

        for (int i = 3; i < 100000; i++) {
            for (int z = 2; z < i; z++) {
                if (i % z == 0) {
                    nPrimes++;
                    break;
                }
            }
        }
        System.out.println(nPrimes);
    }
}
