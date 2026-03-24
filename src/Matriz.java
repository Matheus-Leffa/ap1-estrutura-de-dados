import java.util.Random;
import java.util.Scanner;

public class Matriz {
    private int[][] matriz;

    public Matriz(int[][] matriz){
        this.matriz = matriz;
    }

    public void preencherManual(){
        Scanner input = new Scanner(System.in);

        for(int i = 0; i < matriz.length; i++){
            for(int j = 0; j < matriz[i].length; j++){
                System.out.println("Digite o número na posição: " + i + " " + j);
                int numero = input.nextInt();
                matriz[i][j] = numero;
            }
        }
    }

    public void preencherAutomatico(){
        Random r = new Random();
        for(int i = 0; i < matriz.length; i++){
            for(int j = 0; j < matriz[i].length; j++){
                matriz[i][j] = r.nextInt(50);
            }
        }
    }

    public void exibirMatrizTabular(){
        for(int i = 0; i < matriz.length; i++){
            for(int j = 0; j < matriz[i].length; j++){
                System.out.printf("%4d", matriz[i][j]);
            }
            System.out.println();
        }
    }

    public void ordenarLinhasMatriz(){
        Ordenacao ordenacao = new Ordenacao();

        for(int i = 0; i < matriz.length; i++){
            for(int j = 0; j < matriz[i].length; j++){
                ordenacao.bubbleSort(matriz[i]);
            }
        }
    }

    public void ordenarColunasMatriz(int[][] matriz){
        Ordenacao ordenacao = new Ordenacao();

        ordenacao.bubbleSortColuna(matriz);
    }

    public void ordenarMatrizCompleta(){
        Ordenacao ordenacao = new Ordenacao();

        int linhas = matriz.length;
        int colunas = matriz[0].length;

        int[] vetor = transformarEmVetor();

        ordenacao.mergeSort(vetor, 0, vetor.length -1);

        reconstruirMatriz(vetor, linhas, colunas);
    }

    public int[] transformarEmVetor(){
        int linhas = matriz.length;
        int colunas = matriz[0].length;

        int[] vetor = new int[linhas * colunas];
        int k = 0;

        for(int i = 0; i < linhas; i++){
            for(int j = 0; j < colunas; j++){
                vetor[k++] = matriz[i][j];
            }
        }

        return vetor;
    }

    public void reconstruirMatriz(int[] vetor, int linhas, int colunas){
        int k = 0;

        for(int i = 0; i < linhas; i++){
            for(int j = 0; j < colunas; j++){
                matriz[i][j] = vetor[k++];
            }
        }
    }
}
