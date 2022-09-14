# Lista de Exercícios
<img src="assets/images/Unicap_Icam_Tech-01.png" alt="drawing" width="200"/>

## Identificação
*Professor*: Diego Pinheiro e Daniel Bezerra

*Disciplina*: Programação 2

*Atividade*: Atividade 03 - Matrizes

## Instruções 
> 1. Sua implementação deve estar dentro da pasta src/*main/java (não coloque detro da pasta src/test*/java).
> 2. A submissão *não deve ser feita após o prazo* (nem 1 minuto a mais)

## Atividade Parte 1
### Questão 1
Crie uma Classe `CompoundInterest` e implemente um método para calcular cenários de juros compostos 
    
java
static double[][] calculate(double initialAmount, int numPeriods, double[] interestRates)


que recebe o montante inicial `initialAmount` (e.g., R$ 10,000.00), a quantidade de períodos `numPeriods`  para o qual se quer calcular o montante final (e.g., 6 meses ou 6 anos), e um vetor `interestRates` de taxas de juros que se deseja analisar (e.g., [1%, 2%, 3%]  ao mês ou ao ano) e retorna uma tabela (i.e., uma matriz) com uma coluna para cada taxa de juros (i.e., primeira coluna juros 1%, segunda coluna juros 2%, etc), contendo o montante inicial em todas as colunas da primeira linha, o montante acumulado após a aplicação da taxa de juros na segunda linha, e assim sucessivamente).

Considerando os seguintes parâmetros 

java
initialAmount = 10,000.00
numPerios = 3;
interestRates = [.10, .11, .12]


o retorno de 

java
calculate(initialAmount, numPeriods,interestRates)


é 

||||
|-|-|-|
|10.000,00|	10.000,00|	10.000,00|
|11.000.00|	11.100,00|	11.200,00| 
|12.100.00|	12.321.00|	12.544.00|
|13.310.00|	13.676.31|	14.049.28|



## Atividade Parte 2
### Questão 1
Implemente um método para multiplicar uma matriz por um número real chamado `matrixMultiplication(a, A)` que recebe o número real `a` e a matriz `A`, e retorna o produto `C = a x A`.

### Questão 2
Implemente um método para calcular a matriz transposta `matrixTranspose(A)` que recebe a matriz `A` e retorna a transposta de `A`. 

### Questão 3
Implemente um método para multiplicar matrizes chamado `matrixMultiplication(A,B)` que recebe as matrizes `A` e `B` e, caso o número de colunas da matriz A seja igual ao número de linhas da matriz `B`, retorna o produto `C = A x B`. Caso não seja possível, o programa deve levantar uma exceção. 

<img src="assets/images/dot.png"  width="200"/>


### Questão 4
Implemente um método para retornar uma submatriz chamado `subMatrix(A, i, j)` que recebe a matriz `A(n,m)`, o índice `i`, e o índice `j`, e retorna uma submatriz `S(n-1,m-1)` que é a matriz A excluindo a linha `i` e coluna `j`.

### Questão 5
Implemente o método `matrixDeterminant(A)` para retornar o determinante de uma matriz quadrada `A`. Implemente apenas o caso para `n` igual a `1` e `n` `igual `2`. 

### Questão 6
Implemente um método chamado `matrixCoFactor (A, i, j)` para retornar o cofator do elemento `(i,j)` de uma matriz `A`. O cofator de um elemento `(i,j)` de A cuja ordem é n é um número é dado pela equação a seguir, em que det e sub são os métodos `matrixDeterminant(A)` e `subMatrix(A, i, j)`, respectivamente.

<img src="assets/images/cij.png"  width="200"/>

### Questão 7
Incremente o  seu método `matrixDeterminant(A)` para o caso `n > 2` utilizando o Expansão de Laplace em que o determinante é calculado a partir da soma algébrica dos produtos dos elementos de uma linha `i` (i.e., qualquer linha e pode ser a primeira) pelos respectivos cofatores de acordo com a equação a seguir em que cofactor é o método `matrixCoFactor (A, i, j)`.

<img src="assets/images/det.png"  width="200"/>

### Questão 8
Implemente o método `matrixCoFactor(A)` que retorna a matriz de cofatores de `A`.

<img src="assets/images/cofactor.png"  width="200"/>

### Questão 9
Implemente o método `matrixAdjugate(A)` que retorna a matriz adjunta de `A` de utilizando a transposta da matriz de cofatores de acordo com a equação a seguir. Reutilize os métodos `matrixCoFactor(A)` e `matrixTranspose(A)`.

<img src="assets/images/adj.png"  width="200"/>

### Questão 10
Determinar se uma matriz é singular é muito importante e serve, por exemplo, para determinar se uma matriz é inversível. Implemente o método `matrixIsSingular(A)` que recebe uma matrix `A` e retorna true caso seja singular ou false caso contrário. Uma matriz é singular é se o seu determinante é zero. 

### Questão 11
Implemente o método `matrixInverse(A)` que retorna a inversa da matriz `A` de acordo com a equação a seguir. 

<img src="assets/images/inverse.png"  width="200"/>


## Atividade Parte 3

### Questão 1
Uma das aplicações da matriz inversa é na resolução de sistemas de equações. Suponha que você esteja procurando comprar um apartamento. Após você ter visitado 3 apartamentos, percebeu que:
-	O primeiro apartamento tinha 4 quartos, 4 banheiros, 120 metros quadrados e custava R$110,000;
-	O segundo apartamento tinha 6 quartos, 2 banheiro, 180 metros quadrados e custava R$ R$135,000;
-	O terceiro apartamento tinha 2 quarto, 4 banheiros, 80 metros quadrados, e custava R$75,000. 
Você se perguntou se o custo de um apartamento pode ser definido em função do número de quartos (x), do número de banheiros, e de seu tamanho (z).  Então, escreveu o sistema de equações a seguir. 

<img src="assets/images/eqs1.png"  width="400"/>

Para isso, você deve 
1.	Armazenar os coeficientes na matriz `A`;
2.	Armazenar as constantes na matriz `b`;
3. Encontrar a matriz inversa A<sup>-1</sup>
4. Multiplicar a matriz inversa A<sup>-1</sup> pela matriz de coeficientes `b`. 


### Questão 2

Uma das aplicações da matriz inversa é na resolução de sistemas de equações. Porém, não pode ser utilizada quando a matriz não é quadrada. Por exemplo, quando o número de linhas é maior que o número de colunas, o que é bem comum em Ciência dos Dados. 

Suponha que você esteja procurando comprar um apartamento. Após você ter visitado 3 apartamentos em um bairro não muito procurado, você percebeu que:
-	O primeiro apartamento tinha 1 quarto, 1 banheiro, 50 metros quadrados e custava R$75,000;
-	O segundo apartamento tinha 2 quartos, 1 banheiro, 50 metros quadrados e custava R$ R$125,500;
-	O terceiro apartamento tinha 2 quartos, 1 banheiro, 100 metros quadrados e custava R$126,000;

Após visitar os mesmos apartamentos em um bairro muito procurado, você percebeu que os mesmos 3 apartamentos custavam, respectivamente R$175,000, R$225,500 e R$226,000

Você se perguntou se o custo de um apartamento pode ser definido em função do número de quartos (x), do número de banheiros(y), de seu tamanho (z), e da sua localização em um bairro muito procurado (w).  Então, escreveu o sistema de equações a seguir para os 6 apartamentos visitados. 

<img src="assets/images/eqs2.png"  width="400"/>

Porém, como a matriz A não é quadrada, a sua inversa não está definida. Porém, como você está se tornando um Cientista dos Dados, você sabe que pode utilizar o Método dos Mínimos Quadrados (MMQ), ou Mínimos Quadrados Ordinários (MQO) ou OLS (do inglês Ordinary Least Squares). 

Para isso, você deve

1. Calcular a transposta A<sup>T</sup>;
2. Multiplicar a transposta A<sup>T</sup> por A para encontrar a matriz (A<sup>T</sup>A);
3. Calcular a inversa da matriz (A<sup>T</sup>A) ou seja (A<sup>T</sup>A)<sup>-1</sup>;
4. Calcular a pseudo-inversa (A<sup>T</sup>A)<sup>-1</sup>A<sup>T</sup>;
5. Multiplicar a pseudo-inversa pela matriz de constantes.