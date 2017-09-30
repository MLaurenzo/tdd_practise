import org.junit.Assert;
import org.junit.Test;

public class FizzBuzz {

    private static String fizzbuzz(int i) {
        // TODO remove duplication
        if (i % 3 == 0) return "fizz";
        if (i % 5 == 0) return "buzz";
        return String.valueOf(i);
    }

    @Test
    public void fizzbuzztest() {
        fizzbuzz_should_return(1, "1");
        fizzbuzz_should_return(2, "2");

        fizzbuzz_should_return(3, "fizz");
        fizzbuzz_should_return(6, "fizz");

        fizzbuzz_should_return(5, "buzz");
        fizzbuzz_should_return(10, "buzz");

        // TODO implement this test with "fake it" method
        // fizzbuzz_should_return(15, "fizzbuzz");
    }

    private void fizzbuzz_should_return(int input, String expected) {
        Assert.assertEquals(expected, fizzbuzz(input));
    }
}
