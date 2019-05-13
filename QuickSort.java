
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

            /*******************************************************************
             * j será decrementado enqanto o elemento em sua posicao
             * for maior que o pivot
             * 
             * Caso o elemento seja menor, o mesmo é posto na posição de i
             * 
             * O if é um controle para que i ou j ultrapassem os limites do vetor
            *******************************************************************/
            
            while (vetor[j] > pivor && j >= 0) j--;
            if(vetor[j] < pivor) vetor[i] = vetor[j];

            while(vetor[i] <= pivor && i < j ) i++;
            if(vetor[i] > pivor) vetor[j] = vetor[i];

        }
        
        /***********************************************************************
        * 'i' e 'j' estão na mesma posição, o pivor estará em seu devido lugar
        * retorno de i indica a partição do array
        **********************************************************************/
        
        vetor[i] = pivor;
        return i;
    }

}
