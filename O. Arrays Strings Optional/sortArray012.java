public class sortArray012{
  
  public static void swap(int[] arr, int a, int b) {
      int temp = arr[a];
      arr[a] = arr[b];
      arr[b] = temp;
  }

  public static void sort012(int[] arr) {
    int p1 = -1;
    int p2 = 0;
    int p3 = arr.length - 1;
  
    while (p2 <= p3) {
  
        if (arr[p2] == 0) {
            p1++;
            swap(arr, p1, p2);
            p2++;
        } 
        else if (arr[p2] == 1) {
            p2++;
        } 
        else { // arr[p2] == 2
            swap(arr, p2, p3);
            p3--;
        }
    }
  }
}

