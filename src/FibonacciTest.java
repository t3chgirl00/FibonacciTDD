import org.junit.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class FibonacciTest {

    Fibonacci fibonacci = new Fibonacci();



    @org.junit.jupiter.api.Test
    public void calculateFibonacci() {
        List<Integer> list = List.of(0, 1, 1, 2, 3);
        assertEquals(list, fibonacci.calculateFibonacci(6));
    }


}