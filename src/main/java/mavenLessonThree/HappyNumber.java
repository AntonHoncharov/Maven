package mavenLessonThree;

public class HappyNumber {

    public static boolean isHappy(int number) {
        while (number / 10 > 0) {
            int sum = 0;
            while (number / 10 > 0) {
                sum += Math.pow((number % 10), 2);
                number = number / 10;
            }
            sum += Math.pow(number, 2);
            number = sum;
        }
        if (number == 1)
            return true;
        return false;
    }
}
