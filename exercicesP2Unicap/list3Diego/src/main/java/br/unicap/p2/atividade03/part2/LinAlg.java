package br.unicap.p2.atividade03.part2;

public class LinAlg {

    public static double[][] matrixMultiplication(double a, double A[][]) {

        for (int m = 0; m < A.length; m++) {
            for(int n = 0; n < A[0].length; n++) {
                A[m][n] *= a;
            }
        }
        
        return A;

    }

    public static double[][] matrixTranspose(double A[][]) {

        int m, n;

        double[][] transpA = new double[A[0].length][A.length];
        for (m = 0; m < A.length; m++) {
            for(n = 0; n < A[0].length; n++) {
                transpA[n][m] = A[m][n];
            }
        }

        return transpA;
    }

    public static double[][] matrixMultiplication(double A[][], double B[][]) {
        if(A[0].length == B.length) {
            double[][] C = new double[A.length][B[0].length];
            for (int m = 0; m < A.length; m++) {
                for(int n = 0; n < B[0].length; n++) {
                    for(int k = 0; k < A[0].length; k++) {
                        C[m][n] += A[m][k] * B[k][n];
                    }
                }
            }
            return C;

        } else {
            throw new RuntimeException("Number of columns in A is different of number of rows in B");
        }
    }

    public static double[][] subMatrix(double A[][], double i, double j) {
        double[][] newAr = new double[A.length-1][A[0].length-1];
        
        for (int m = 0, y = 0; m < A.length; m++) {
            if(m != i) {
                for(int n = 0, x = 0; n < A[0].length; n++) {
                    if(n != j) {
                        newAr[y][x] += A[m][n];
                        x++;
                    }
                }
                y++;
            }
        }

        return newAr;
    }

    public static double matrixDeterminant(double A[][]) {

        if(A.length != A[0].length) {
            throw new RuntimeException("Matrix not squared");
        }
        
        double determinant = 0;

        if(A.length == 1) {
            double temp;
            temp = A[0][0];
            return temp;
        } else if(A.length == 2) {
            int m = 0, n = 0;
            double timeDet = 1;
            boolean matrix2MaxFAbov;
            while (matrix2MaxFAbov = m != A.length && n != A[0].length) {
                timeDet *= A[m][n];
                m++;
                n++;
            }
            determinant += timeDet;
            boolean matrix2MaxFBeyo;
            m = 1; n = 0; timeDet = 1;
            while(matrix2MaxFBeyo = m != -1 && n != A[0].length) {
                timeDet *= A[m][n];
                m--;
                n++;
            }
            determinant -= timeDet;
            //finish 2 array length
        } else if(A.length > 2) {
            for(int j = 0; j < A.length; j++) {
                int i = 1;
                double coFac = matrixCoFactor(A, i, j);
                determinant += A[i][j] * coFac;
            }
        }

        return determinant;
    }

    public static double matrixCoFactor(double A[][], int i, int j) {
        
        double[][] sub = subMatrix(A, i, j);
        double det = matrixDeterminant(sub);

        double coFac;
        coFac = Math.pow(-1, i + j) * det;

        return coFac;
    }

    public static double[][] matrixCoFactor(double A[][]) {

        double[][] determinantAr = new double[A.length][A[0].length];

        for(int i = 0; i < A.length; i++) {
            for(int j = 0; j < A[0].length; j++) {
                double [][] sub = subMatrix(A, i, j);
                double determinant = matrixDeterminant(sub);
                determinantAr[i][j] = determinant;
            }
        }
        double[][] determinantSig = cofacSinal(determinantAr);
        
        return determinantSig;
    }

    public static double[][] cofacSinal (double[][] sub) {
        if(sub.length == 3){
            double[][] temp = { {1, -1, 1},{-1, 1, -1},{1, -1, 1} };
            for(int i = 0; i < temp.length; i++) {
                for(int j = 0; j < temp[0].length; j++) {
                    sub[i][j] *= temp[i][j];
                }
            }
        } else {
            double[][] temp = { {1, -1}, {-1, 1} };
            for(int i = 0; i < temp.length; i++) {
                for(int j = 0; j < temp[0].length; j++) {
                    sub[i][j] *= temp[i][j];
                }
            }
        }
        return sub;
    }

    public static double[][] matrixAdjugate(double A[][]) {

        if(A.length == 1) {
            double[][] exception = {{1}};
            return exception;
            //it's correct? if not do it right
        }

        double[][] cof = matrixCoFactor(A);
        double[][] trans = matrixTranspose(cof);

        return trans;
    }

    public static boolean matrixIsSingular(double A) {
        if(A == 0) {
            return true;
        } else {
            return false;
        }
    }

    public static double[][] matrixInverse(double A[][]) {

        double[][] adj = matrixAdjugate(A);
        double det = matrixDeterminant(A);
        double fraction = 1/det;

        double[][] inA = matrixMultiplication(fraction, adj);

        boolean Sing = matrixIsSingular(det);

        if(Sing) {
            throw new RuntimeException("Matrix is singular");
        } else {
            return inA;
        }

    }

    
}
    
    

