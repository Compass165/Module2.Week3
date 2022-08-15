package FizzBuzz;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FizzBuzzTest {

    @Test
    void checkFizzBuzz() {

        String expected = "khong dem duoc";
        String result = FizzBuzz.checkFizzBuzz(100);
        assertEquals(expected,result);
    }
}