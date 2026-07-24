import java.util.Arrays;

public class segregPosNeg {

    public static void swap(int left, int right, int[] arr) {
        int temp = arr[left];
        arr[left] = arr[right];
        arr[right] = temp;
    }

    public static void segregatePosNeg(int[] arr) {
        int n = arr.length;

        int i = -1;
        int j = n - 1;

        while (i < j) {

            // Check the first unexplored element
            if (arr[i + 1] < 0) {
                i++;
            } else {
                swap(i + 1, j, arr);
                j--;
            }
        }
    }

    public static void main(String[] args) {
        int[] arr = {-8, 14, 15, -11, -12, 13, -7, 8, -19};

        segregatePosNeg(arr);

        System.out.println(Arrays.toString(arr));
    }
}