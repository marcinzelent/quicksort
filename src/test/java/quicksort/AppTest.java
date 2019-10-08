package quicksort;

import org.junit.Test;
import org.junit.Assert;

public class AppTest 
{
    @Test
    public void shouldAnswerWithTrue()
    {
        int[] unsortedArray = new int[] { 1, 3, 3, 7, -4, -2, 0, 69};
        int[] sortedArray = new int[] { -4, -2, 0, 1, 3, 3, 7, 69};

        Quicksort.quicksort(unsortedArray, 0, unsortedArray.length - 1);

        Assert.assertArrayEquals(sortedArray, unsortedArray);
    }
}
