package a1;

public class ArrayMethods {
    /** sum of whole array
     * @param arr1
     * @return sum
     */
    public static float wholeSum(float[] arr1){
        float sum = 0.0f;
        for (int i = 0; i < arr1.length; i++){
            sum += arr1[i];
        }
        return sum;
    }

    /** partial sum of the array with a range
     * @param arr1
     * @param lo
     * @param high
     * @return
     */
    public static float sum(float[] arr1, int lo, int high){
        float sum = 0.0f;
        for (int i = lo; i < high; i++){
            sum += arr1[i];
        }
        return sum;
    }

    /** overloaded partial sum of the array (without a range)
     * @param arr1
     * @return sum(arr1, lo, high)
     */
    public static float sum(float[] arr1){
        int lo = 0;
        int high = arr1.length;
        return sum(arr1, lo, high);
    }

    /**mean of whole array
     * @param arr1
     * @return sum/arr1.length
     */
    public static float mean(float[] arr1){
        float sum = wholeSum(arr1);
        if (sum == 0.0f){
            return 0.0f;
        }
        return (sum/arr1.length);
    }

    /**overloaded mean of the array with a range
     * @param arr1
     * @param lo
     * @param hi
     * @return sum/(hi-lo)
     */
    public static float mean(float[] arr1, int lo, int hi){
        float sum  = sum(arr1, lo, hi);
        return (sum/(hi-lo));
    }

    
    /**minimum value of the array
     * @param arr1
     * @return lowest
     */
    public static float min(float[] arr1){
        if (arr1.length  == 0){
            return Float.NaN;
        }
        float lowest = arr1[0];
        for (int i = 1; i < arr1.length; i++){
            if (lowest  <= arr1[i]){
                continue;
            } 
            else{
                lowest = arr1[i];
            }
        }
        return lowest;
    }

    /**overloaded min value of array
     * @param arr1
     * @param lo
     * @param hi
     * @return lowest
     */
    public static float min(float[] arr1, int lo, int hi){
        if (arr1.length  == 0){
            return Float.NaN;
        }
        float lowest = arr1[lo];
        for (int i = 1; i < hi; i++){
            if (lowest  <= arr1[i]){
                continue;
            } 
            else{
                lowest = arr1[i];
            }
        }
        return lowest;

    }


    /**overloaded min value using a boolean[] to ignore values
     * @param arr1
     * @param arr2
     * @return lowest
     */
    public static float min(float[] arr1, boolean[] arr2){
        if (arr1.length  == 0){
            return Float.NaN;
        }
        float lowest = arr1[0];
        for (int i = 1; i < arr1.length; i++){
            if (arr2[i]){
                if (lowest > arr1[i]){
                    lowest = arr1[i];
                }
            }
        }
        return lowest;
    }
    
    
    /**max value of the array
     * @param arr1
     * @return highest
     */
    public static float max(float[] arr1){
        if (arr1.length  == 0){
            return Float.NaN;
        }
        float highest = arr1[0];
        for (int i = 1; i < arr1.length; i++){
            if (highest  >= arr1[i]){
                continue;
            } 
            else{
                highest = arr1[i];
            }
        }
        return highest;
    }

    /**overloaded max value of the array (with a range)
     * @param arr1
     * @param lo
     * @param hi
     * @return highest
     */
    public static float max(float[] arr1, int lo, int hi){
        if (hi <=lo){
            return Float.NaN;
        }
        float highest = arr1[lo];
        for (int i = lo +1; i < hi; i++){
            if (highest >= arr1[i]){
                continue;
            }
            else{
                highest = arr1[i];
            }
        }
        return highest;
    }
    

    /**removes the index from the list
     * @param arr1
     * @param index
     * @return arr2
     */
    public static float[] remove(float[] arr1, int index){
        float[] arr2 = new float[arr1.length - 1];
        System.arraycopy(arr1, 0, arr2, 0, index);
        System.arraycopy(arr1, index + 1, arr2, index, arr1.length - index - 1);
        return arr2;
    }
    

    /**lowest k-number of values in the array
     * @param arr1
     * @param lo
     * @param hi
     * @param k
     * @return low_to_high
     */
    public static float[] lowest(float[] arr1, int lo, int hi, int k){
        float[] low_to_high = new float[k];
        int count = 0;
        float[] arr2 = arr1;
        float temp_low = 0.0f;
        for (int i = 0; arr2.length != 0; i++){
            temp_low = min(arr1, lo, hi);
            low_to_high[count] = temp_low;
            arr2 = remove(arr1, i);
            count += 1;
        }
        if (k > arr1.length){
            for (int c = count; c < k; c++){
                arr2[c] = Float.NaN;
            }
        }
        return low_to_high;
    }
    

    /**highest k-number of values in the array
     * @param arr1
     * @param lo
     * @param hi
     * @param k
     * @return high_to low
     */
    public static float [] highest(float[] arr1, int lo, int hi, int k){
        float[] high_to_low = new float[k];
        int count = 0;
        float[] arr2 = arr1;
        float temp_high = 0.0f;
        for (int i = 0; count < k; i++){
            temp_high = max(arr1, lo, hi);
            high_to_low[count] = temp_high;
            arr2 = remove(arr1, i);
            count += 1;
        }
        if (k > arr1.length){
            for (int c = count; c < k; c++){
                arr2[c] = Float.NaN;
            }
        }
        return high_to_low;
    }

    /**returns a boolean array of whether or not the value at each index is equal to a given float value
     * @param arr1
     * @param val
     * @return true_val
     */
    public static boolean[] isEqualTo(float[] arr1, float val){
        boolean[] true_val = new boolean[arr1.length];
        for (int i = 0; i < arr1.length; i++){
            if (arr1[i] == val){
                true_val[i] = true;
            }
            else{
                true_val[i] = false;
            }
        }
        return true_val;
    }
    
    /**switches the values of true and false at each index.
     * @param arr1
     * @return arr1
     */
    public static boolean[] logicalNot(boolean[] arr1){
        for (int i = 0; i < arr1.length; i++){
            if (arr1[i]){
                arr1[i] = false;
            }
            else{
                arr1[i] = true;
            }
        }
        return arr1;
    }
    
    /**takes the mean of the values not including that have a corresponding true index value
     * @param arr1
     * @param arr2
     * @param lo
     * @param hi
     * @return sum/count
     */
    public static float mean(float[] arr1, boolean[] arr2, int lo, int hi){
        float sum = 0;
        int count = 0;
        for (int i = lo; i < hi; i++){
            if (arr2[i]){
                sum += arr1[i];
                count += 1;
            }
        }
        return (sum/count);
    }
    
    /**returns a boolean array of whether or not each value in the given array is above an indicated given value
     * @param arr1
     * @param val
     * @return greater_than
     */
    public static boolean[] isGreaterThan(float[] arr1, float val){
        boolean[] greater_than = new boolean[arr1.length];
        for (int i = 0; i < arr1.length; i++){
            if (arr1[i] > val){
                greater_than[i] = true;
            }
            else{
                greater_than[i] = false;
            }
        }
        return greater_than;
    }
    
    /**returns an array that determines if each string date occurs between the beginning and end dates given
     * @param dates
     * @param start
     * @param end
     * @return equals
     */
    public static boolean[] datesBetween(String[] dates, String start, String end){
        boolean[] equals = new boolean[dates.length];
        int compares_start;
        int compares_end;
        for (int i = 0; i < dates.length; i++){
            compares_start = start.compareTo(dates[i]);
            compares_end = end.compareTo(dates[i]);
            equals[i] = compares_start < 0 && compares_end > 0;
        }
        return equals;
    }

    /** returns a boolean array that determines if both values at the same index are true
     * @param arr1
     * @param arr2
     * @return match
     */
    public static boolean[] logicalAnd(boolean[] arr1, boolean[] arr2){
        int length = 0;
        if (arr1.length < arr2.length){
            length = arr1.length;
        }
        else{
            length = arr2.length;
        }
        boolean[] match = new boolean[length];
        for(int i = 0; i < arr1.length; i++){
            if (arr1[i] != arr2[i]){
                match[i] = false;
            }
            else if (arr1[i]){
                match[i] = true;
            }
            else{
                match[i] = false;
            }
        }
        return match;
    }
    

    /**counts the number of true occurences in a boolean array
     * @param arr1
     * @return count
     */
    public static int count(boolean[] arr1){
        int count = 0;
        for (int i = 0; i < arr1.length; i++){
            if (arr1[i]){
                count += 1;
            }
        }
        return count;
    }


    /** finds the index of the first true occurence in a boolean array
     * @param arr1
     * @return i //(index)
     */
    public static int findFirst(boolean[] arr1){
        for (int i = 0; i < arr1.length; i++){
            if (arr1[i]){
                return i;
            }
        }
        return -1;
    }


    /**returns an int array of indices of true occurrences in a boolean array
     * @param arr1
     * @return found
     */
    public static int[] find(boolean[] arr1){
        int count = 0;
        for (int i = 0; i < arr1.length; i++){
            if(arr1[i]){
                count += 1;
            }
        }
        int curr_count = 0;
        int[] found = new int[count];
        for(int i = 0; i < arr1.length; i++){
            if (arr1[i]){
                found[curr_count] = i;
                curr_count += 1;
            }
        }
        return found;
    }


    public static void main(String[] args){
        //float [] arr1 = {1.0f, 2.0f, 3.0f, 4.0f};
        //float [] arr2 = {-7.5f, 3.2f};
        //float [] arr3 = {};
        //float [] arr4 = {1.0f, 3.0f, 2.0f};
        //System.out.print(wholeSum(arr3));
        //System.out.print(sum(arr1, 0,0));
        //System.out.print(sum(arr1));
        //System.out.print(mean(arr1, 2,4));
        //System.out.print(mean(arr3));
        //System.out.print(min(arr1, 1, 4));
        //System.out.print(min(arr3));
        //System.out.print(max(arr4, 0, 0));
        //System.out.print(max(arr4));
        // boolean[] arr5 = isEqualTo(arr4, 3.0f);
        // for (int i = 0; i < arr5.length; i++){
        //     System.out.println(arr5[i]);
        // }
        String[] arr6 = {"20", "18", "30", "5"};
        boolean [] dates = (datesBetween(arr6, "10", "25"));
        for (int i = 0; i < dates.length; i++){
            System.out.println(dates[i]);
        }
    }
}

