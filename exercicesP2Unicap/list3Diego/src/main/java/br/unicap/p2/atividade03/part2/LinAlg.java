package br.unicap.p2.atividade03.part2;

public class LinAlg {
    static double[][] matrixMultiplication(double a, double[][] A){
        for(int i =0;i<2;i++){
            for(int aux =0;aux<2;aux++){
                A[i][aux] *= a;
            } 
        }
        return A;
    }

    static double[][] matrixTranspose(double[][] A){
        double[][] transposeA = new double[A[0].length][A.length];
        for(int i =0;i<A[0].length;i++){
            for(int aux =0;aux<A.length;aux++){
                transposeA[aux][i] = A[i][aux];
            } 
        }
        return transposeA;
    }
    static double[][] matrixMultiplication(double[][] A, double[][] B){
        
        double[][] C = new double[A[0].length][A.length];
        for(int lineC=0; lineC<A[0].length;lineC++){
            for(int columnC =0;columnC<A.length;columnC++){
                C[lineC][columnC] = A[lineC][columnC] * B[lineC][columnC];
            }
        }
        if(A[0].length != B[0].length && A.length != B.length){
            System.out.print("Número de colunas de A diferente do numéro de linhas de B mas retornou ");
        }
        return C;
    }
    static double[][] subMatrix(double[][]A, int i, int j){
        double[][] S = new double[A[0].length-1][A.length-1];
        for(int lineA =0,lineS=0;lineA<A[0].length;lineA++){
            if(lineA == i){
                lineA++;
            }
            for(int columnA =0,columnS=0;columnA<A.length && lineA<A[0].length;columnA++){
                if(columnA == j){
                    columnA++;
                }else{
                    S[lineS][columnS] = A[lineA][columnA];
                    columnS++;
                }
            }
            lineS++;
        }
        return S;
    }
}
    
    

