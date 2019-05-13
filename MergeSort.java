
public class MergeSort implements Sort{

    public int[] sort(int vetor[]) {

        System.err.println("\t** MergeSort \t**");
        
        int inicio = 0;
        int fim = vetor.length - 1;

        mergeSort(inicio, fim, vetor);

        return vetor;
    }

    public void mergeSort(int inicio, int fim, int[] vetor) {

        if (inicio < fim) {
            int meio = (inicio + fim) / 2;
            mergeSort(inicio, meio, vetor);
            mergeSort(meio + 1, fim, vetor);
            merge(inicio, meio, fim, vetor);
        }

    }

    public void merge(int inicio, int meio, int fim, int[] vetor) {

        int[] L = new int[meio - inicio + 1];
        int[] R = new int[fim - meio];

        int i, j;
        for (i = 0; i < L.length; i++) L[i] = vetor[i + inicio];

        for (i = 0; i < R.length; i++) R[i] = vetor[i + meio + 1];

        i = j = 0;

        for (int k = inicio; k <= fim; k++) {

            if (i >= L.length) {
                vetor[k] = R[j];
                j++;
            } else if (j >= R.length) {
                vetor[k] = L[i];
                i++;
            } else {
                if (L[i] <= R[j]) {
                    vetor[k] = L[i];
                    i++;
                } else {
                    vetor[k] = R[j];
                    j++;
                }
            }

        }

    }
}
