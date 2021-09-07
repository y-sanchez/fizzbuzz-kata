
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.assertEquals;

class FizzBuzzTest {

    @ParameterizedTest
    @CsvSource({"3, 3 Fizz", "5, 5 Buzz", "7, 7 FizzBuzz"})
    void playFizzBuzz(String num, String expected ){

        String result  = FizzBuzz.playFizzBuzz(Integer.parseInt(num));
        assertEquals(expected, result);

    }
}