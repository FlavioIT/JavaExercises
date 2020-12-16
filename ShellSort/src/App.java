public class App {

    public static void printVetor(int[] v) {
        for (int i = 0; i < v.length; i++) {
            System.out.print(v[i] + " ");
        }
    }

    public static void main(String[] args) throws Exception {
        int[] a = { 15, 20, 0, 9, 541, 169, 221, 122, 5, 3, 80 };
        int[] b = { 15, 20, 0, 9, 541, 169, 221, 122, 5, 3, 80 };
        int[] c = { 15, 20, 0, 9, 541, 169, 221, 122, 5, 3, 80 };

        System.out.println("ShellSort:");
        printVetor(a);
        System.out.println("");
        ShellSort.sort(a);
        printVetor(a);
        System.out.println("");

        System.out.println("MergeSort:");
        printVetor(b);
        System.out.println("");
        MergeSort.sort(b, b.length);
        printVetor(b);
        System.out.println("");

        System.out.println("QuickSort:");
        printVetor(c);
        System.out.println("");
        QuickSort.sort(c, 0, 10);
        printVetor(c);
        System.out.println("");

    }
}
