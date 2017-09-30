import org.junit.Assert;
import org.junit.Test;

public class FakeIt {

    private static String fizzbuzz(int i) {
        // the following line of code has been adding with the "fake it" method.
        // TODO refactor it to remove the duplication with the rest of the method.
        if (isMultipleOf(i, 15)) return "fizzbuzz";

        if (isMultipleOf(i, 3)) return "fizz";
        if (isMultipleOf(i, 5)) return "buzz";
        return String.valueOf(i);
    }

    private static boolean isMultipleOf(int i, int multiple) {
        return i % multiple == 0;
    }

    @Test
    public void fizzbuzztest() {
        fizzbuzz_should_return(1, "1");
        fizzbuzz_should_return(2, "2");

        fizzbuzz_should_return(3, "fizz");
        fizzbuzz_should_return(6, "fizz");

        fizzbuzz_should_return(5, "buzz");
        fizzbuzz_should_return(10, "buzz");

        fizzbuzz_should_return(15, "fizzbuzz");
    }

    private void fizzbuzz_should_return(int input, String expected) {
        Assert.assertEquals(expected, fizzbuzz(input));
    }
}
