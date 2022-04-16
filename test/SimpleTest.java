import org.junit.Test;
import org.junit.Assert;

//aaa

public class SimpleTest {
    @Test
    public void test(){
        // arrange
        int a = 11;
        int b = 20;
        int expected = 30;

        // action
        int actual = a + b;

        // assert
        if (expected != actual) {
            Assert.fail();
        }
    }
}
