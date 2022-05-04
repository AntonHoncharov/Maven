package testMavenLessonTwo;

import mavenLessonTwo.SortedSquares;
import org.junit.Assert;
import org.junit.Test;

public class SortedSquaresTest {

    SortedSquares sortedSquares = new SortedSquares();

    int[] numsOne = {-4, -1, 0, 3, 10};
    int[] numsTwo = {-7, -3, 2, 3, 11};

    int[] resultOne = sortedSquares.sortedSquares(numsOne);
    int[] resultTwo = sortedSquares.sortedSquares(numsTwo);

    @Test
    public void testSortedSquares() {
        Assert.assertEquals(resultOne, numsOne);
        Assert.assertEquals(resultTwo, numsTwo);
    }
}
