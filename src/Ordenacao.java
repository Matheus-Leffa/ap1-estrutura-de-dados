public class Ordenacao {

    public void bubbleSort(int[] vetor){
        int n = vetor.length;
        for(int i = 0; i < n -1; i++){
            for(int j = 0; j < n - i -1; j++){
                if(vetor[j] > vetor[j +1]){
                    int temp = vetor[j];
                    vetor[j] = vetor[j +1];
                    vetor[j +1] = temp;
                }
            }
        }
    }

    public void bubbleSortColuna(int[][] matriz){
        for(int j = 0; j < matriz[0].length; j++){
            for(int k = 0; k < matriz.length - 1; k++){
                for(int i = 0; i < matriz.length - k - 1; i++){
                    if(matriz[i][j] > matriz[i + 1][j]){
                        int temp = matriz[i][j];
                        matriz[i][j] = matriz[i + 1][j];
                        matriz[i +1][j] = temp;
                    }
                }
            }
        }
    }

    public void mergeSort(int[] vetor, int inicio, int fim){
        if(inicio < fim){
            int meio = (inicio + fim) / 2;

            mergeSort(vetor, inicio, meio);
            mergeSort(vetor, meio + 1, fim);

            merge(vetor, inicio, meio, fim);
        }
    }

    private void merge(int[] vetor, int inicio, int meio, int fim) {
        int[] temp = new int[fim - inicio + 1];

        int i = inicio;
        int j = meio + 1;
        int k = 0;

        while (i <= meio && j <= fim) {
            if (vetor[i] <= vetor[j]) {
                temp[k++] = vetor[i++];
            } else {
                temp[k++] = vetor[j++];
            }
        }

        while (i <= meio) {
            temp[k++] = vetor[i++];
        }

        while (j <= fim) {
            temp[k++] = vetor[j++];
        }

        for (int x = 0; x < temp.length; x++) {
            vetor[inicio + x] = temp[x];
        }
    }
}
