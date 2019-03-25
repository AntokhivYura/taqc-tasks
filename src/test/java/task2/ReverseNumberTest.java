package task2;

import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

/**
 * Returns reversed inputted number
 *
 * Technique used here is Equivalence Partitioning
 */
public class ReverseNumberTest {


    @DataProvider
    public Object[][] addData() {
        return new Object[][]{
                {12, 21},
                {123, 321},
                {-123, -321},
                {0, 0}
        };
    }

    @Test(dataProvider = "addData")
    public void reverseNumberTest(int expected, int arg) {
        ReverseNumber reverseNumber = new ReverseNumber();

        int actual = reverseNumber.reverseNumber(arg);

        Assert.assertEquals(actual, expected);
    }
}