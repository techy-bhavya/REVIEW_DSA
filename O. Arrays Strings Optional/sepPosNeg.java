public class sepPosNeg{
    public static void swap(int[] arr, int a, int b) {
    int temp = arr[a];
    arr[a] = arr[b];
    arr[b] = temp;
  }

  public static void rearrange(int[] arr) {
    int i = -1;
    int j = arr.length - 1;

    while (i < j) {
        if (arr[i + 1] < 0) {
            i++;
        } else {
            swap(arr, i + 1, j);
            j--;
        }
    }
  }
}

