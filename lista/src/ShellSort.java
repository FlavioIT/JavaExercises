public class ShellSort {

    public static void sort(int[] vetor) {
        int intervalo = vetor.length / 2;
        while (intervalo > 0) {
            for (int proximaPos = intervalo; proximaPos < vetor.length; proximaPos++)
                insert(vetor, proximaPos, intervalo);
            intervalo = (int) (intervalo / 2);
        }
    }

    private static void insert(int[] vetor, int proximaPos, int intervalo) {
        int proximoVal = vetor[proximaPos];
        while ((proximaPos > intervalo - 1) && (proximoVal < vetor[proximaPos - intervalo])) {
            vetor[proximaPos] = vetor[proximaPos - intervalo];
            proximaPos -= intervalo;
        }
        vetor[proximaPos] = proximoVal;
    }
}