import org.junit.Assert;
import org.junit.Test;

public class Triangulation {

    private static String fizzbuzz(int i) {
        return "1";
    }

    @Test
    public void fizzbuzztest() {
        fizzbuzz_should_return(1, "1");

        // TODO implement the following tests with "triangulation" method
        //fizzbuzz_should_return(2, "2");

        //fizzbuzz_should_return(3, "fizz");
        //fizzbuzz_should_return(6, "fizz");

        //fizzbuzz_should_return(5, "buzz");
        //fizzbuzz_should_return(10, "buzz");
    }

    private void fizzbuzz_should_return(int input, String expected) {
        Assert.assertEquals(expected, fizzbuzz(input));
    }
}
