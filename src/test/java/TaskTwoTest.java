import org.junit.Assert;
import org.junit.Test;

public class TaskTwoTest{

    TaskTwo taskTwo =new TaskTwo();
    int[] numsOne = {1,2,3,1,1,3};
    int[] numsTwo = {1,1,1,1};
    int[] numsThree = {1,2,3};



    @Test
    public void testNumIdenticalPairs() {
        Assert.assertEquals(4, taskTwo.numIdenticalPairs(numsOne));
        Assert.assertEquals(6, taskTwo.numIdenticalPairs(numsTwo));
        Assert.assertEquals(0, taskTwo.numIdenticalPairs(numsThree));
    }
}