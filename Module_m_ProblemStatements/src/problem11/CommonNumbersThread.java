package problem11;

import java.util.ArrayList;
import java.util.List;

public class CommonNumbersThread extends Thread {

    private List<Integer> primes;
    private List<Integer> fibs;

    // Constructor should be public
    public CommonNumbersThread(List<Integer> primes, List<Integer> fibs) {
        this.primes = primes;
        this.fibs = fibs;
    }

    @Override
    public void run() {
        List<Integer> common = new ArrayList<>();

        for (int n : fibs) {
            if (primes.contains(n)) {
                common.add(n);
            }
        }

        System.out.println("\nCommon numbers in Prime and Fibonacci series:");
        System.out.println(common);
    }
}

