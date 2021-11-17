import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class FibonacciTest {

    Fibonacci fibonacci = new Fibonacci();



    @org.junit.jupiter.api.Test
    public void calculateFibonacci() {
        List<Integer> list = List.of(0, 1, 1, 2, 3, 8);
        assertEquals(list, fibonacci.fibonacciToList(7));
        System.out.println("The fibonacci list is " + list);
    }


    @Test
    void fibonacci() {
        assertEquals(5, fibonacci.fibonacci(5));
        System.out.println("Fibonacci sum is " + 5);

    }
}