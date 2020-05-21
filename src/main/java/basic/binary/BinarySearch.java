package basic.binary;

public class BinarySearch {

  public static void main(String[] args) {

    int[] arr = {3,4,5,6,7,8,9,10};

    int q = 8;
    System.out.println(binarySearch(arr, q));

    q = 3;
    System.out.println(binarySearch(arr, q));

    q = 10;
    System.out.println(binarySearch(arr, q));



  }

  private static int binarySearch(int[] arr, int q) {
    int first = 0;
    int last = arr.length - 1;
    int pivot = (first + last) / 2;

    while (arr[pivot] != q) {
      if (q < arr[pivot]) {
        last = pivot - 1;

      } else {
        first  = pivot + 1;
      }
      pivot = (first + last) / 2;
    }

    return pivot;
  }


}
