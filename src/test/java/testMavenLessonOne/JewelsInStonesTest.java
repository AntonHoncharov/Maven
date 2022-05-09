package testMavenLessonOne;

import mavenLessonOne.JewelsInStones;
import org.junit.Assert;
import org.junit.Test;

public class JewelsInStonesTest {

    JewelsInStones jewelsInStones = new JewelsInStones();

    @Test
    public void testNumJewelsInStones() {
        Assert.assertEquals(3, jewelsInStones.numJewelsInStones("aA", "aAAbbbb"));
        Assert.assertEquals(0, jewelsInStones.numJewelsInStones("z", "ZZ"));
    }
}