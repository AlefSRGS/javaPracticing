package br.unicap.p2.atividade03.part1;

public class CompoundInterest {
        static double[][] calculate(double initialAmount, int numPeriods, double[] interestRates){
            double[][] finalMatrix = new double[numPeriods+1][interestRates.length];
            for(int i = 0; i<interestRates.length; i++){
                double atualMoney = initialAmount;
                for(int aux = 0; i<numPeriods+1;aux++){
                    if(aux == 0){
                        finalMatrix[i][aux] = atualMoney;
                    }else{
                        finalMatrix[i][aux] = atualMoney + (atualMoney*interestRates[i])/100;
                    }
                }
            }

            return finalMatrix;
        }
    }