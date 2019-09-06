import java.util.Arrays;

public class BubbleSort {

    public static void bubleSort(int[] arr){
        boolean isSorted = false;
        while(! isSorted){
            isSorted = true;
            for (int i = 0; i < arr.length - 1; i++) {
                if(arr[i] > arr[i+1]) {
                    isSorted = false;
                    arr[i+1] ^= (arr[i] ^= arr[i+1]);
                    arr[i] ^= arr[i+1];
                }
            }
        }
    }

    public static void main(String[] args) {
        int[] testArr = new int[]{7, 5, 3, 2, 8, 0, 9, 4, 10, 1, 6};
        bubleSort(testArr);
        System.out.println(Arrays.toString(testArr));
    }
}
