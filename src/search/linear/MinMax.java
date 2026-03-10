package search.linear;

public class MinMax {
    public static void main(String[] args) {
        int arr[] = {8, 6, 9, 10, 4};
        System.out.println(min(arr));
    }
// min value from the array, lly max value can be found
    static int min(int[] arr) {
        if (arr.length == 0) {
            return -1;
        }

        int minValue = arr[0];
        for (int i = 1; i < arr.length; i++) {

            if (arr[i] < minValue) {
                minValue = arr[i];
            }
        }
        return minValue;


    }
}
