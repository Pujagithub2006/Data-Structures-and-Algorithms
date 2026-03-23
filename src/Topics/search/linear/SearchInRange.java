package Topics.search.linear;

public class SearchInRange {
    public static void main(String[] args) {
        int arr[] = {34, 56, 35, 65, 78};
        int target = 65;
        int start = 2;
        int end = 4;

        int ans = linearSearch(arr, target, start, end);
        System.out.println(ans);
    }

    static int linearSearch (int[] arr, int target, int start, int end) {
        if (arr.length == 0) {
            return -1;
        }

        for (int i = start; i <= end ; i++) {
            int element = arr[i];
            if (element == target) {
                return i;
            }
        }

        return -1;

    }
}

