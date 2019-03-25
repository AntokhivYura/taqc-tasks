package task4;

import com.softserve.task4.EuclidAlgorithm;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class EuclidAlgorithmTest {

    @DataProvider
    public Object[][] addData() {
        return new Object[][]{
                {12, 36, 60},
                {4,4,8},
                {1,3,7},
                {5,35,10}
        };
    }

    @Test(dataProvider = "addData")
    public void getHighestDiv(int expected, int arg0, int arg1) {
        EuclidAlgorithm algorithm = new EuclidAlgorithm();

        int actual = algorithm.getHighestDiv(arg0, arg1);

        Assert.assertEquals(actual, expected);
    }
}