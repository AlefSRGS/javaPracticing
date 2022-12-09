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
        for(int i =0;i<2;i++){
            for(int aux =0;aux<2;aux++){
                transposeA[aux][i] = A[i][aux];
            } 
        }
        return transposeA;
    }
    static double[][] matrixMultiplication(double[][] A, double[][] B){
        
        double[][] C = new double[A[0].length][A.length];
        int columnA =0; int lineB =0;
        for(int lineC=0; lineC<A[0].length;lineC++){
            for(int columnC =0;columnC<A.length;columnC++){
                while(lineB < B[0].length && columnA < A.length){
                    C[lineC][columnC] += A[lineC][columnA]*B[lineB][columnC];
                    columnA++;
                    lineB++;
                }
            }
        }
        return C;
    }
}
    
    

