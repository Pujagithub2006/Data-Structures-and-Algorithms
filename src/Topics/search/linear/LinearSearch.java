package Topics.search.linear;

public class LinearSearch {
    public static void main(String[] args) {
        int[] nums = {23, 56, 34, 10, 5};
        int target = 34;
        int ans = linearSearch(nums, target);
        System.out.println(ans);
    }

    static int linearSearch (int[] arr, int target) {
        if (arr.length == 0) {
            return -1;
        }

        for(int element : arr) {  // enhanced for loop
            if(element == target) {
                return element;
            }
        }

        return Integer.MAX_VALUE; // since -1 can be a number in the array so cant return it

    }

    static int linearSearch2 (int[] arr, int target) {
        if (arr.length == 0) {
            return -1;
        }

        for (int i = 0; i < arr.length; i++) {
            int element = arr[i];
            if (element == target) {
                return i;
            }
        }

        return -1; // can return -1 since index can never be -1
    }

    static boolean linearSearch3 (int[] arr, int target) {
        if (arr.length == 0) {
            return false;
        }

        for(int element : arr) {  // enhanced for loop
            if(element == target) {
                return true;
            }
        }

        return false; // since -1 can be a number in the array so cant return it

    }
}

