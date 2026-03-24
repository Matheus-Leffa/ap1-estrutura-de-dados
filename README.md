Relatório Final – Estrutura de Dados
1. Descrição da Classe Matriz

A classe Matriz foi desenvolvida com o objetivo de encapsular a manipulação de uma matriz bidimensional de inteiros (int[][]), centralizando suas operações principais.

Atributos:
int[][] matriz
Representa a estrutura principal de dados, armazenando os valores da matriz.

Métodos e Responsabilidades:

A classe segue o princípio de responsabilidade única, concentrando operações relacionadas à manipulação da matriz.

✔ preencherManual()

Permite que o usuário insira manualmente os valores da matriz via entrada padrão (Scanner).
Utiliza dois loops aninhados:

externo → percorre linhas
interno → percorre colunas

Cada posição [i][j] recebe um valor informado pelo usuário.

✔ preencherAutomatico()

Preenche a matriz com valores aleatórios utilizando a classe Random.
Semelhante ao manual, porém:

usa Random
preenche com valores dentro de um intervalo definido

✔ exibirMatrizTabular()

Exibe a matriz formatada em forma de tabela, utilizando printf para alinhamento.
Utiliza:

System.out.printf("%4d", valor);

Isso garante alinhamento uniforme dos elementos, melhorando a legibilidade.

✔ ordenarLinhasMatriz()

Ordena cada linha individualmente utilizando o algoritmo Bubble Sort.
Cada linha é tratada como um vetor independente:

compara elementos adjacentes
realiza trocas quando necessário

✔ ordenarColunasMatriz()

Ordena cada coluna da matriz utilizando Bubble Sort adaptado para estrutura vertical.
Diferente das linhas, colunas não são vetores diretos. A solução foi:

fixar a coluna (j)
percorrer linhas (i)
comparar:
matriz[i][j] com matriz[i + 1][j]

A ordenação ocorre verticalmente.

✔ ordenarMatrizCompleta() (implementado com Merge Sort)

Ordena todos os elementos da matriz como um único conjunto:

Converte a matriz em vetor
Ordena com Merge Sort
Reconstrói a matriz ordenada
A matriz é tratada como um conjunto único de dados:

Etapas:
Flatten (2D → 1D)
A matriz é convertida em um vetor
Ordenação (Merge Sort)
Algoritmo recursivo divide e conquista:
divide o vetor em partes menores
ordena e mescla
Reconstrução (1D → 2D)
Os valores ordenados são reinseridos na matriz

Comparação entre Algoritmos de Ordenação
Bubble Sort:
Tipo: Iterativo
Complexidade:
Pior caso: O(n²)
Melhor caso: O(n)
Características:
Simples de implementar
Baixa eficiência para grandes volumes

Merge Sort:
Tipo: Recursivo (Divisão e Conquista)
Complexidade:
Sempre O(n log n)
Características:
Mais eficiente para grandes conjuntos
Usa memória extra (vetor auxiliar)

Quando usar cada um?

✔ Bubble Sort

Matrizes pequenas
Situações didáticas
Implementações simples

✔ Merge Sort

Grandes volumes de dados
Necessidade de eficiência
Sistemas mais robustos

Conclusões:

Durante o desenvolvimento deste projeto, foram enfrentados diversos desafios, principalmente relacionados à manipulação de estruturas bidimensionais e adaptação de algoritmos clássicos.

Dificuldades encontradas:
Entender a diferença entre linhas e colunas
Adaptar o Bubble Sort para colunas
Implementar corretamente a troca de valores
Compreender o funcionamento do Merge Sort

Aprendizados obtidos:
Melhor entendimento sobre estruturas de dados
Aplicação prática de algoritmos de ordenação
Importância da separação de responsabilidades (boas práticas)
Diferença entre abordagens iterativas e recursivas
Capacidade de transformar problemas complexos em etapas menores

Considerações finais:

O projeto permitiu consolidar conceitos fundamentais de programação e estrutura de dados, além de desenvolver raciocínio lógico para adaptação de algoritmos em diferentes contextos.

A experiência contribuiu significativamente para a evolução no entendimento de boas práticas e organização de código.
