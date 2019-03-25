package task1;

/**
 * Checks if square of the number contains digit three.
 * @author Yurii Antokhiv
 * @version 1.0
 */
public class NumberContainsDigitThree {

    /**
     * Returns true if and only if square of this number
     * contains digit three.
     *
     * @param n input number
     * @return true if square of the number contains digit three
     *         , false if not
     */
    public boolean numberContainsThree(int n) {
        n = n * n;

        while (n != 0) {
            if (n % 10 == 3) {
                return true;
            }
            n /= 10;
        }
        return false;
    }
}
