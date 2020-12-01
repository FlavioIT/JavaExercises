public class App {

    public static void bubbleSort(int [] sort_arr, int len){
        for (int i=0;i<len-1;++i){
            for(int j=0;j<len-i-1; ++j){
                if(sort_arr[j+1]<sort_arr[j]){
                    int swap = sort_arr[j];
                    sort_arr[j] = sort_arr[j+1];
                    sort_arr[j+1] = swap;
                }
            }
        }
    }
    public static void main(String[] args) throws Exception {
        int[] V = {1,5,9,2,4,6,8,0};

        bubbleSort(V, 8);
        for(int i = 0; i<8; ++i){
            System.out.print(V[i] + " ");
        }
    }
}
