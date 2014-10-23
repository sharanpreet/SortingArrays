
package sortingarrays;

import static org.junit.Assert.assertArrayEquals;
import org.junit.Test;

public class SortingArraysTest {
    
    public SortingArraysTest() {
    }

    /**
     * Test of sortArray method, of class SortingArrays.
     */
    @Test
    public void testSortArray() {
        System.out.println("sortArray");
        int[] arr = {4,3,9,7};
        int sorted[]={3,4,7,9};
        SortingArrays.sortArray(arr);
        assertArrayEquals(sorted,arr);
        
    }
    
}
