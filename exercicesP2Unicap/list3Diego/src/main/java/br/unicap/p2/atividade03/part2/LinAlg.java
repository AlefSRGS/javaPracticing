package br.unicap.p2.atividade03.part2;

import javafx.css.Match;

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
    public static double matrixDeterminant(double[][] A){
        if(A.length<=2){
            double somDiagonalPrim = 1;
            double somDiagonalSec = 1;
            for(int lineA=0,columnA=0;lineA<A.length;lineA++,columnA++){
                somDiagonalPrim *= A[columnA][lineA];
            }for(int lineA=0,columnA =A[0].length-1;lineA<A.length;lineA++,columnA--){
                somDiagonalSec *= A[columnA][lineA];
            }
            double determinantA = somDiagonalPrim -  somDiagonalSec;
            return determinantA;
        }else{
            int line =0;
            double determinantA = 0;
            for(int column =0;column<A[0].length;column++){
                determinantA += A[line][column] * matrixCoFactor(A, line, column);
            }
            return determinantA;
        }
        
    }
    public static double matrixCoFactor(double[][] A, int i, int j){
        double cofatorA = Math.pow(-1, i+j) * matrixDeterminant(subMatrix(A, i, j));
        return cofatorA;
    }

}
    
    

