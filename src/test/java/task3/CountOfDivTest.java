package task3;

import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class CountOfDivTest {

    @Test
    public void countDivOfNumber() {
        CountOfDiv countOfDiv = new CountOfDiv();

        List<Integer> expected;
        List<Integer> actual;

        expected = new ArrayList<>(Arrays.asList(7560,9240));


        actual = countOfDiv.getNumWithMaxDivider();

        for (int i = 0; i < actual.size(); i++) {
            Assert.assertEquals(expected.get(i), actual.get(i));
        }

    }
}