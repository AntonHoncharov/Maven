package testMavenLessonOne;

import mavenLessonOne.IdenticalPairs;
import org.junit.Assert;
import org.junit.Test;

public class IdenticalPairsTest {

    IdenticalPairs identicalPairs =new IdenticalPairs();

    int[] numsOne = {1,2,3,1,1,3};
    int[] numsTwo = {1,1,1,1};
    int[] numsThree = {1,2,3};

    @Test
    public void testNumIdenticalPairs() {
        Assert.assertEquals(4, identicalPairs.numIdenticalPairs(numsOne));
        Assert.assertEquals(6, identicalPairs.numIdenticalPairs(numsTwo));
        Assert.assertEquals(0, identicalPairs.numIdenticalPairs(numsThree));
    }
}