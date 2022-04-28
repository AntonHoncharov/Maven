import org.junit.Assert;
import org.junit.Test;

public class TaskOneTest {

    TaskOne taskOne = new TaskOne();

    @Test
    public void test() {
        Assert.assertEquals(3, taskOne.numJewelsInStones("aA", "aAAbbbb"));
        Assert.assertEquals(0, taskOne.numJewelsInStones("z", "ZZ"));
    }
}