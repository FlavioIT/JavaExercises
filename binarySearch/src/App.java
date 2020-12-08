public class App {

    public static int binarySearch(int[] sortedArray, int searchNum, int low, int high) {
    int index = Integer.MAX_VALUE;
    int comp = 0;
    
    while (low <= high) {
        int mid = (low + high) / 2;
        if (sortedArray[mid] < searchNum) {
            low = mid + 1;
            comp++;
        } else if (sortedArray[mid] > searchNum) {
            high = mid - 1;
            comp++;
        } else if (sortedArray[mid] == searchNum) {
            index = mid;
            break;
        }
    }
    return comp;
}


    public static void main(String[] args) throws Exception {
        int[] intArray = new int[]{1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18,19,20};
        int compNum;

        compNum = binarySearch(intArray, 7, 0, 19);
        System.out.print(compNum);
        
    }
}
