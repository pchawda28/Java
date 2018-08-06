public class ConsecutiveSum
{
    static int consecutive(long number)
    {
        // constraint on values of L gives us the
        // time Complexity as O(N^0.5)
        int count = 0;
        for (int L = 1; L * (L + 1) < 2 * number; L++)
        {
            float a = (float) ((1.0 * number-(L * (L + 1)) / 2) / (L + 1));
            if (a-(int)a == 0.0)
                count++;
        }
        return count;
    }

    // Driver code to test above function
    public static void main(String[] args) {
        long N = 15;
        System.out.println(consecutive(N));
        N = 10;
        System.out.println(consecutive(N));
    }
}
