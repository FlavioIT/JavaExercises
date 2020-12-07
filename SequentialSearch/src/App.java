public class App {

    public static int sequencialSearch(int[] intArray, int searchNum, int len) {
        int pos = -1;
        for (int i = 0; i < len; i++){
            if(intArray[i] == searchNum){
                pos = i;
                break;
            }
        }
        return pos;
    }

    public static void main(String[] args) throws Exception {
        int[] intArray = new int[]{1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18,19,20};
        int position;

        position = sequencialSearch(intArray, 10, intArray.length);
        System.out.print(position);
    }
}
