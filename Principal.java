
public class Principal {

    public static void main(String args[]) {
        int[] vetor = {10, 9, 8, 77, 7, 7, 6, 5, 4, 3, 2, 1, 0};

        Sort sort = new CoutingSort();
        sort.sort(vetor);
        System.out.println("\nCouting");
        show(vetor);

        sort = new MergeSort();
        sort.sort(vetor);
        System.out.println("\nMerge");
        show(vetor);

    }
    
    public static void show(int[] vetor){
        for (int i = 0; i < vetor.length; i++) {
            System.out.print(vetor[i] + " ");
        }
    }
}
