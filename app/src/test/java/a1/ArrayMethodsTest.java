package a1;

//import org.junit.*;
import static org.junit.Assert.*;
import org.junit.Test;
import a1.Assert;

/** A JUnit tester class for ArrayMethods */
public class ArrayMethodsTest {
    /** Runs test on wholeSum */
    @Test public void testWholeSum1(){
        float[] arr1 = {1f, 2f, 3f, 4f};
        Assert.assertEquals("[1 2 3 4] -> 10", 10f, ArrayMethods.wholeSum(arr1), 1e-6);
    }
    @Test public void testWholeSum2(){
        float[] arr1 = {-7.5f, 3.2f};
        Assert.assertEquals("[-7.5 3.2] -> -4.3", -4.3f, ArrayMethods.wholeSum(arr1), 1e-6);
    }
    @Test public void testWholeSum3(){
        float[] arr1 = {};
        Assert.assertEquals("[] -> 0", 0f, ArrayMethods.wholeSum(arr1), 1e-6);
    }
    @Test public void testWholeSum4(){
        float[] arr1 = {3.2f};
        Assert.assertEquals("[3.2] -> 3.2", 3.2f, ArrayMethods.wholeSum(arr1), 1e-6);
    }
    @Test public void testWholeSum5(){
        float[] arr1 = {12f, 2f, 0f, 3.5f};
        Assert.assertEquals("[12 2 0 3.5] -> 15.5", 15.5f, ArrayMethods.wholeSum(arr1), 1e-6);
    }

    /** Runs tests on sum */
    @Test public void testSum1(){
        float[] arr1 = {1f, 2f, 3f, 4f};
        Assert.assertEquals("[1 2 3 4], 1, 3 -> 5", 5f, ArrayMethods.sum(arr1,1,3), 1e-6);
    }
    @Test public void testSum2(){
        float[] arr1 = {1f, 2f, 3f, 4f};
        Assert.assertEquals("[1 2 3 4], 0, 4 -> 10", 10f, ArrayMethods.sum(arr1,0,4), 1e-6);
    }
    @Test public void testSum3(){
        float[] arr1 = {1f, 2f, 3f, 4f};
        Assert.assertEquals("[1 2 3 4], 2, 2 -> 0", 0f, ArrayMethods.sum(arr1,2,2), 1e-6);
    }
    @Test public void testSum4(){
        float[] arr1 = {8.2f, 3f, 2.5f};
        Assert.assertEquals("[8.2, 3, 2.5], 1, 2 -> 5.5", 5.5f, ArrayMethods.sum(arr1,1,3), 1e-6);
    }
    @Test public void testSum5(){
        float[] arr1 = {2f, 18f, 0f};
        Assert.assertEquals("[2 18 0], 1, 2 -> 18", 18f, ArrayMethods.sum(arr1,1,2), 1e-6);
    }
    @Test public void testSum6(){
        float[] arr1 = {2f, 18f, 0f};
        Assert.assertEquals("[2 18 0], 0, 1 -> 20", 20f, ArrayMethods.sum(arr1,0,1), 1e-6);
    }

    /** Runs tests on overloaded sum */
    @Test public void testOverLoadedSum1(){
        float[] arr1 = {1f, 2f, 3f, 4f};
        Assert.assertEquals("[1 2 3 4] -> 10", 10f, ArrayMethods.sum(arr1), 1e-6);
    }
    @Test public void testOverloadedSum2(){
        float[] arr1 = {-7.5f, 3.2f};
        Assert.assertEquals("[-7.5 3.2] -> -4.3", -4.3f, ArrayMethods.sum(arr1), 1e-6);
    }
    @Test public void testOverloadedSum3(){
        float[] arr1 = {};
        Assert.assertEquals("[] -> 0", 0f, ArrayMethods.sum(arr1), 1e-6);
    }
    @Test public void testOverloadedSum4(){
        float[] arr1 = {3.2f};
        Assert.assertEquals("[3.2] -> 3.2", 3.2f, ArrayMethods.sum(arr1), 1e-6);
    }
    @Test public void testOverloadedSum5(){
        float[] arr1 = {12f, 2f, 0f, 3.5f};
        Assert.assertEquals("[12 2 0 3.5] -> 15.5", 15.5f, ArrayMethods.sum(arr1), 1e-6);
    }

    /** Runs tests on mean */
    @Test public void testMean1(){
        float[] arr1 = {1f, 2f, 3f, 4f};
        Assert.assertEquals("[1 2 3 4], 1, 3 -> 5", 5f, ArrayMethods.mean(arr1,1,3), 1e-6);
    }
    @Test public void testMean2(){
        float[] arr1 = {1f, 2f, 3f, 4f};
        Assert.assertEquals("[1 2 3 4], 0, 4 -> 10", 10f, ArrayMethods.mean(arr1,0,4), 1e-6);
    }
    @Test public void testMean3(){
        float[] arr1 = {};
        Assert.assertEquals("[] -> 0", 0f, ArrayMethods.mean(arr1), 1e-6);
    }
    @Test public void testMean4(){
        float[] arr1 = {3f, 8f, 9f, 2f};
        Assert.assertEquals("[3 8 9 2] -> 5.5", 5.5f, ArrayMethods.sum(arr1), 1e-6);
    }
    @Test public void testMean5(){
        float[] arr1 = {5f, 4f, 3f, 2f, 1f};
        Assert.assertEquals("[5 4 3 2 1], 1, 3 -> 3", 3f, ArrayMethods.sum(arr1,1,3), 1e-6);
    }
    @Test public void testMean6(){
        float[] arr1 = {5f, 4f, 3f, 2f, 1f};
        Assert.assertEquals("[5 4 3 2 1 0], 0, 4 -> 3", 3f, ArrayMethods.sum(arr1,0,4), 1e-6);
    }

    /** Runs test for min */
    @Test public void testMin1(){
        float[] arr1 = {1f, 2f, 3f, 4f};
        Assert.assertEquals("[1 2 3 4], 1, 4 -> 2", 2f, ArrayMethods.min(arr1, 1, 4), 1e-6);
    }
    @Test public void testMin2(){
        float[] arr1 = {1f, 2f, 3f, 4f};
        Assert.assertEquals("[1 2 3 4] -> 1", 1f, ArrayMethods.min(arr1), 1e-6);
    }
    @Test public void testMin3(){
        float[] arr1 = {};
        Assert.assertEquals("[] -> Float.NaN", Float.NaN, ArrayMethods.min(arr1), 1e-6  );
    }
    @Test public void testMin4(){
        float[] arr1 = {5f, 4f, 3f, 2f, 1f};
        Assert.assertEquals("[5 4 3 2 1 0] -> 0", 0f, ArrayMethods.min(arr1), 1e-6);
    }
    @Test public void testMin5(){
        float[] arr1 = {5f, 4f, 3f, 2f, 1f};
        Assert.assertEquals("[5 4 3 2 1 0] , 0, 2 -> 3", 3f, ArrayMethods.min(arr1), 1e-6);
    }
    @Test public void testMin6(){
        float[] arr1 = {-7.5f, 3.2f};
        Assert.assertEquals("[-7.5 3.2] -> -7.5", -7.5f, ArrayMethods.min(arr1), 1e-6);
    }

    /** Runs test on max */
    @Test public void testMax1(){
        float[] arr1 = {1f, 2f, 3f, 4f};
        Assert.assertEquals("[1 2 3 4], 1, 4 -> 4", 4f, ArrayMethods.max(arr1, 1, 4), 1e-6);
    }
    @Test public void testMax2(){
        float[] arr1 = {1f, 2f, 3f, 4f};
        Assert.assertEquals("[1 2 3 4] -> 4", 4f, ArrayMethods.max(arr1), 1e-6);
    }
    @Test public void testMax3(){
        float[] arr1 = {};
        Assert.assertEquals("[] -> Float.NaN", Float.NaN, ArrayMethods.max(arr1), 1e-6  );
    }
    @Test public void testMax4(){
        float[] arr1 = {5f, 4f, 3f, 2f, 1f};
        Assert.assertEquals("[5 4 3 2 1 0] -> 5", 5f, ArrayMethods.max(arr1), 1e-6);
    }
    @Test public void testMax5(){
        float[] arr1 = {5f, 4f, 3f, 2f, 1f};
        Assert.assertEquals("[5 4 3 2 1 0] , 0, 2 -> 5", 5f, ArrayMethods.max(arr1), 1e-6);
    }
    @Test public void testMax6(){
        float[] arr1 = {-7.5f, 3.2f};
        Assert.assertEquals("[-7.5 3.2] -> 3.2", 3.2f, ArrayMethods.max(arr1), 1e-6);
    }

    // /** Runs tests on lowest */
    // @Test public void testLowest1(){
    //     float[] arr1 = {1f, 3f, 2f, 4f};
    //     Assert.assertEquals("[1 3 2 4] -> 0,4,2", {1f, 2f}, ArrayMethods.lowest(arr1, 0, 4, 2), 1e-6);
    // }

    @Test public void testMeanMissing1(){
        float[] arr1 = {1.0f, -9999.0f, 3.0f, 2.0f};
        boolean[] arr2 = {true, false, true, true};
        Assert.assertEquals("[1, -9999, 3, 2], [true, false, true, true], 0, 4 -> 2", 2.0f, ArrayMethods.mean(arr1,arr2, 0, 4), 1e-6);
    }
    @Test public void testMeanMissing2(){
        float[] arr1 = {1.0f, 18.0f, 3.0f, 2.0f};
        boolean[] arr2 = {true, true, true, false};
        Assert.assertEquals("[1, 18, 3, 2], [true, true, true, false], 0, 2 -> 9.5", 9.5f, ArrayMethods.mean(arr1,arr2, 0, 2), 1e-6);
    }

    /** Runs all the tests */
    public static void main(String[] args){
        // testWholeSum1();
        // testWholeSum2();
        // testWholeSum3();
        // testWholeSum4();
        // testWholeSum5();
        // testSum1();
        // testSum2();
        // testSum3();
        // testSum4();
        // testSum5();
        // testSum6();
    }
}