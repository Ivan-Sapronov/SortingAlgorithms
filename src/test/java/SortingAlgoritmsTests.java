import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.util.Arrays;

public class SortingAlgoritmsTests {
    private int[] sourceArr1;
    private int[] sourceArr2;
    private int[] expectedArr1;
    private int[] expectedArr2;

    @Before
    public void setUp() {
        sourceArr1 = new int[]{34, 5, 3, 56, 3, 0, 23, 4, 567, 998, 332, 77};
        sourceArr2 = new int[]{7, 5, 3, 2, 8, 0, 9, 4, 10, 1, 6};

        expectedArr1 = new int[]{0, 3, 3, 4, 5, 23, 34, 56, 77, 332, 567, 998};
        expectedArr2 = new int[]{0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
    }

    @Test
    public void testBubbleSort() {
        BubbleSort.bubleSort(sourceArr1);
        BubbleSort.bubleSort(sourceArr2);
        assertEquals(Arrays.toString(expectedArr1), Arrays.toString(sourceArr1));
        assertEquals(Arrays.toString(expectedArr2), Arrays.toString(sourceArr2));
    }

    @Test
    public void testInsertionSort() {
        BubbleSort.bubleSort(sourceArr1);
        BubbleSort.bubleSort(sourceArr2);
        assertEquals(Arrays.toString(expectedArr1), Arrays.toString(sourceArr1));
        assertEquals(Arrays.toString(expectedArr2), Arrays.toString(sourceArr2));
    }

    @After
    public void tearDown() {
        sourceArr1 = new int[]{34, 5, 3, 56, 3, 0, 23, 4, 567, 998, 332, 77};
        sourceArr2 = new int[]{7, 5, 3, 2, 8, 0, 9, 4, 10, 1, 6};
    }
}
