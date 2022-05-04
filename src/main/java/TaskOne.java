public class TaskOne {

    public int numJewelsInStones(String jewels, String stones) {

        char[] s = new char[100];
        int result = 0;
        for (int i = 0; i < jewels.length(); i++) {
            s[i] = jewels.charAt(i);
        }
        for (int j = 0; j < stones.length(); j++) {
            for (int m = 0; m < jewels.length(); m++) {
                if (s[m] == stones.charAt(j))
                    result++;
            }
        }
        return result;
    }
}
