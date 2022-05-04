package mavenLessonTwo;

public class MaxProduct {

    public int maxProduct(int[] nums) {

        int a = 0;
        int b = 0;
        for (int num : nums) {
            if (num > a) {
                a = num;
            }
            if (a > b) {
                int result = a;
                a = b;
                b = result;
            }
        }
        return (a - 1) * (b - 1);
    }
}
