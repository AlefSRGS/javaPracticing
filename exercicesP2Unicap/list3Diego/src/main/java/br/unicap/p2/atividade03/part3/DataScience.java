package br.unicap.p2.atividade03.part3;

import br.unicap.p2.atividade03.part2.LinAlg;

public class DataScience {
    
    static double[][] question01() {
        double[][] A = {{4, 4, 120}, {6, 2, 180}, {2, 4, 80} };
        double[] B = {110000, 135000, 75000};
        double[][] newB = fixMN(B);
        double[][] inverse = LinAlg.matrixInverse(A);
        double[][] mult = LinAlg.matrixMultiplication(inverse, newB);

        return mult;
    }

    static double[][] question02() {
        double[][] A ={{1, 1, 50, 0}, {2, 1, 50, 0}, {2, 1, 100, 0}, {1, 1, 50, 1}, {2, 1, 50, 1}, {2, 1, 100, 1}};
        double[] B = {75500, 125500, 126000, 175500, 225500, 226000};
        double[][] newB = fixMN(B);
        double[][] transp = LinAlg.matrixTranspose(A);
        double[][] times = LinAlg.matrixMultiplication(transp, A);
        double[][] inverseMatr = LinAlg.matrixInverse(times);
        double[][] pseudoInv = LinAlg.matrixMultiplication(inverseMatr, transp);
        double[][] pseudoConst = LinAlg.matrixMultiplication(pseudoInv, newB);

        return pseudoConst;
    }

    static double[][] fixMN(double A[]) {
        double[][] newA = new double[A.length][1];
        for(int m = 0, n = 0; m < A.length; m++) {
            newA[m][n] = A[m];
        }
        return newA;

    }
}
