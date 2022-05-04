package testMavenLessonTwo;

import mavenLessonTwo.MaxProduct;
import org.junit.Assert;
import org.junit.Test;

public class MaxProductTest {

    MaxProduct maxProduct = new MaxProduct();

    int[] numsOne = {3, 4, 5, 2};
    int[] numsTwo = {1, 5, 4, 5};
    int[] numsThree = {3, 7};

    @Test
    public void testMaxProduct() {
        Assert.assertEquals(12, maxProduct.maxProduct(numsOne));
        Assert.assertEquals(16, maxProduct.maxProduct(numsTwo));
        Assert.assertEquals(12, maxProduct.maxProduct(numsThree));
    }
}
