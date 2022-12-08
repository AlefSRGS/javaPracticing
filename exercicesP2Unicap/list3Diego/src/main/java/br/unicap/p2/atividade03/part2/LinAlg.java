package br.unicap.p2.atividade03.part2;

public class LinAlg {
    static double[][] matrixMultiplication(int a, double[][] A){
        for(int i =0;i<2;i++){
            for(int aux =0;aux<2;aux++){
                A[i][aux] *= a;
            } 
        }
        return A;
    }

    static double[][] matrixTranspose(double[][] A){
        double[][] transposeA = new double[A[0].length][A.length]
        for(int i =0;i<2;i++){
            for(int aux =0;aux<2;aux++){
                transposeA[aux][i] = A[i][aux];
            } 
        }
        return transposeA;
    }
}
    
    

