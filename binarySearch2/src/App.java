public class App {

    public static int recBinarySearch(int[] sortedArray, int key, int low, int high) {
          int middle = (low + high) / 2;
              
          if (high < low) {
              return -1;
          }
          if (key == sortedArray[middle]) {
              return middle;
          } else if (key < sortedArray[middle]) {
              return recBinarySearch(
                sortedArray, key, low, middle - 1);
          } else {
              return recBinarySearch(
                sortedArray, key, middle + 1, high);
          }
      }
    public static void main(String[] args) throws Exception {
        int[] intArray = new int[]{1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18,19,20};
        int position;

        position = recBinarySearch(intArray, 7, 0, 19);
        System.out.print(position);
    }
}
