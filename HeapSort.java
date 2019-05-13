
class HeapSort implements Sort{

    public int[] sort(int[] vetor) {
        
        System.err.println("\t** HeapSort \t**");
        
        heapSort(vetor);
        return vetor;
    }

    private void heapSort(int[] vetor) {
        //Construcao da Heap
        //Agora o maior valor do vetor está na primeira posição
        buildMaxHeap(vetor);

        for (int heapLen = vetor.length - 1; heapLen >= 0; heapLen--) {
            
            //Troca o primeiro elemento com o ultimo elemento da heap
            troca(vetor, 0, heapLen);
            
            //realiza o Max-heapfy e passa o comprimento da heap como parametro
            maxHeapFy(vetor, 0, heapLen);
        }
    }

    private void buildMaxHeap(int vetor[]) {
        /***********************************************************************
         * Aqui começa a construição da heap, iniciando da metade do vetor
         * (pois da metade para o fim os elementos são 'folha').
         * 
         * Realiza o maxHeapfy localmente a fim de que o pai de todas as subarvores
         * possua valor maior que seus filhos.
        ***********************************************************************/
        
        for (int i = vetor.length / 2; i >= 0; i--) {
            maxHeapFy(vetor, i, vetor.length);
        }
    }

    private void maxHeapFy(int[] vetor, int inicio, int tamanhoHeap) {

        /***********************************************************************
         * Atribui o elemento de maior valor para o pai de cada subarvore analisada.
         * O procedimento recebe um nó ('inicio') e faz com que os elementos de
         * menor valor sejam filhos/ folhas. Este ultmimo procedimento é realizado
         * recursivamente.
        ***********************************************************************/
        
        int pai = inicio, fEsq = 2 * pai + 1, fDir = 2 * pai + 2;
        int maior;

        if (fEsq < tamanhoHeap && vetor[fEsq] > vetor[pai]) maior = fEsq;
        else maior = pai;

        if (fDir < tamanhoHeap && vetor[fDir] > vetor[maior])  maior = fDir;
     
        if (maior != pai) {
            troca(vetor, pai, maior);
            maxHeapFy(vetor, maior, tamanhoHeap);
        }

    }

    private void troca(int[] vetor, int pai, int maior) {
        int aux = vetor[pai];
        vetor[pai] = vetor[maior];
        vetor[maior] = aux;
    }

}
