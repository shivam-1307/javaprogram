public class Max {
    public static void main(String[] args) {
        int[] arr = {1, 2, 44, 9, 6654445};
        System.out.println(maxrange(arr, 1, 3));
    }

    // work on edge cases here, like array being

    static int maxrange(int[] arr, int start, int end) {
        if (end > start){
            return -1;
        }

        if (arr == null ){
            return -1;
        }
        int maxval = arr[0];
        for (int i = start; i <= end; i++) {
            if (arr[i] > maxval) {
                maxval = arr[i];
            }
        }
        return maxval;
    }

    // imagine that arr is not empty
    static int max(int[] arr) {
        if (arr.length == 0){
            return -1;
        }
        int maxval = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > maxval) {
                maxval = arr[i];
            }
        }
    return maxval;
    }
}
