package br.unicap.p2.atividade03.part1;

public class CompoundInterest {
        static double[][] calculate(double initialAmount, int numPeriods, double[] interestRates){
            double[][] finalMatrix = new double[numPeriods+1][interestRates.length];
            for(int line =0; line< numPeriods+1;line++){
                double atualMoney = 0;
                int indexInterestRates = 0;
                for(int column =0; column< interestRates.length;column++){
                    if(line == 0){
                        atualMoney = initialAmount;
                        finalMatrix[line][column] = atualMoney;
                    }else{
                        atualMoney = finalMatrix[line-1][column];
                        finalMatrix[line][column] = atualMoney + atualMoney*interestRates[indexInterestRates];
                        indexInterestRates++;
                    }
                }
            }
            return finalMatrix;
        }
    }