package testMavenLessonThree;

import mavenLessonThree.HappyNumber;
import org.junit.Assert;
import org.junit.Test;

public class HappyNumberTest {

    HappyNumber happyNumber = new HappyNumber();

    int numberOne = 19;
    int numberTwo = 2;

    @Test
    public void happyNumberTest() {

        Assert.assertTrue(happyNumber.isHappy(numberOne));
        Assert.assertFalse(happyNumber.isHappy(numberTwo));
    }
}

