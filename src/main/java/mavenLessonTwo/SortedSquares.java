package mavenLessonTwo;

import java.util.Arrays;

public class SortedSquares {

    public int[] sortedSquares(int[] nums) {
        int square = nums.length;
        for (int i = 0; i < square; i++) {
            nums[i] = nums[i] * nums[i];
        }
        Arrays.sort(nums);
        return nums;
    }
}
