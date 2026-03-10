package search.linear;

import java.util.Arrays;

public class SearchIn2DArray {
    public static void main(String[] args) {
        int arr[][] = {
                {2, 6, 8, 10},
                {45, 64, 21, 54},
                {43, 54},
                {65, 4, 78, 3}
        };
        int target = 64;

        int[] ans1 = searchIn2D(arr, target);
        System.out.println(Arrays.toString(ans1)); // important step

        int ans2 = maxIn2D(arr);
        System.out.println(ans2);

        System.out.println();
    }

    static int[] searchIn2D(int arr[][], int target) { // return type of the function is a 1D array
        if (arr.length == 0) {
            return new int[]{-1, -1}; // since this return array is not declared so create using new keyword
        }

        for (int row = 0; row < arr.length; row++) {
            for (int col = 0; col < arr[row].length; col++) { // important code
                int element = arr[row][col];
                if (element == target) {
                    return new int[]{row, col};
                }
            }

        }

        return new int[] {-1, -1};
    }

    static int maxIn2D(int arr[][]) { // return type of the function is a 1D array
        if (arr.length == 0) {
            return -1; // since this return array is not declared so create using new keyword
        }

        int maxElement = arr[0][0]; // initializing this out of for loop for max or min in arrays
//        int maxElement = Integer.MAX_VALUE; can use this initialization also
        for (int row = 0; row < arr.length; row++) {
            for (int col = 0; col < arr[row].length; col++) { // important code
                    if (arr[row][col] > maxElement) {
                    maxElement = arr[row][col];

                }
            }

        }

        // using enhanced for loop
//        for (int[] i : arr) { // for every array i.e. row in the 2D array
//            for (int j : i) { // for every int i.e. col in the 1D row array
//                if (j > maxElement) { // j is the indivisual every single element
//                    maxElement = j;
//                }
//            }
//        }

        return maxElement; // return statement out of for loop for max or min in arrays
    }
}



