package task1;

import com.softserve.task1.NumberContainsDigitThree;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

/**
 * Unit test for <code>NumberContainsDigitThree</code> class
 * which check if square of the inputted number contains digit three.
 *
 * Technique used here is Equivalence Partitioning
 */
public class NumberContainsDigitThreeTest {

    @DataProvider
    public Object[][] addData() {
        return new Object[][]{
                {true, 6},
                {true, -18},
                {false, 5},
                {false, -7}

        };
    }

    @Test(dataProvider = "addData")
    public void numberContainsThree(boolean expected, int arg) {
        NumberContainsDigitThree obj = new NumberContainsDigitThree();

        boolean actual = obj.numberContainsThree(arg);

        Assert.assertEquals(actual, expected);
    }
}