
public class QuickSort implements Sort{

    @Override
    public int[] sort(int vetor[]) {

        System.err.println("\t** QuickSort **");
        
        int inicio = 0;
        int fim = vetor.length - 1;

        quicksort(vetor, inicio, fim);
        return vetor;
    }

    public void quicksort(int[] vetor, int inicio, int fim) {

        if (inicio < fim) {
            int meio = particao(vetor, inicio, fim);

            quicksort(vetor, inicio, meio - 1);
            quicksort(vetor, meio + 1, fim);

        }

    }

    public int particao(int[] vetor, int inicio, int fim) {

        int pivor = vetor[inicio];
        int i = inicio, j = fim;

        while(i < j){

            /****
             * 
            */
            while (vetor[j] > pivor && j >= 0) j--;
            if(vetor[j] < pivor) vetor[i] = vetor[j];
            
            /****
             * 
            */
            while(vetor[i] <= pivor && i < j ) i++;
            if(vetor[i] > pivor) vetor[j] = vetor[i];

        }
        
        /****
        * 
        */
        vetor[i] = pivor;
        return i;
    }

}
