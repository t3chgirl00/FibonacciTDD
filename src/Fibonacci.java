import java.util.ArrayList;
import java.util.List;

public class Fibonacci {


    public int fibonacci(int n) {
        if (n <= 1) {
            return n;
        }
        return fibonacci(n - 1) + fibonacci(n - 2);

    }

    public List<Integer> fibonacciToList(int n) {
        List<Integer> fibList = new ArrayList<>();
        for (int a = 0; a < n; a++) {
            fibList.add(fibonacci(a));
        }
        return fibList;


    }
}
