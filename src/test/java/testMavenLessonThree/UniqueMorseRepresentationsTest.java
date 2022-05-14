package testMavenLessonThree;

import mavenLessonThree.UniqueMorseRepresentations;
import org.junit.Assert;
import org.junit.Test;

public class UniqueMorseRepresentationsTest {

    UniqueMorseRepresentations uniqueMorseRepresentations = new UniqueMorseRepresentations();

    String[] wordsOne = {"gin", "zen", "gig", "msg"};
    String[] wordsTwo = {"a"};

    @Test
    public void testUniqueMorseRepresentations() {

        Assert.assertEquals(2, uniqueMorseRepresentations.uniqueMorseRepresentations(wordsOne));
        Assert.assertEquals(1, uniqueMorseRepresentations.uniqueMorseRepresentations(wordsTwo));

    }
}