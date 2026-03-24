import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        boolean continuar = true;

        System.out.println("Sistema gerenciado de matrizes");
        System.out.println("Inicialize a matriz");
        System.out.println("Digite o número de linhas: ");
        int linhas = input.nextInt();
        input.nextLine();

        System.out.println("Digite o número de colunas: ");
        int colunas = input.nextInt();
        input.nextLine();

        int[][] numeros = new int[linhas][colunas];
        Matriz matriz = new Matriz(numeros);

        while (continuar){
            System.out.println("""
                1 - Preencher matriz manualmente
                2 - Preencher matriz automaticamente
                3 - Ordenar matiz por linha
                4 - Ordenar matriz por coluna
                5 - Ordenar matriz completa
                6 - Exibir matriz em formato tabular
                7 - Fechar programa
                Digite aqui: """);

            int opcao = input.nextInt();

            switch (opcao){
                case 1:
                    matriz.preencherManual();
                    break;
                case 2:
                    matriz.preencherAutomatico();
                    break;

                case 3:
                    matriz.ordenarLinhasMatriz();
                    break;

                case 4:
                    matriz.ordenarColunasMatriz(numeros);
                    break;

                case 5:
                    matriz.ordenarMatrizCompleta();
                    break;

                case 6:
                    matriz.exibirMatrizTabular();
                    break;

                case 7:
                    System.out.println("Finalizando o programa...");
                    continuar = false;
                    break;

                default:
                    System.out.println("Digite um valor válido!");
            }
        }











    }
}