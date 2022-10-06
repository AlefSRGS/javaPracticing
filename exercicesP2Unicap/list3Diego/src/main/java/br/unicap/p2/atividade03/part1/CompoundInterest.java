package br.unicap.p2.atividade03.part1;

public class CompoundInterest {

    public static double [][] calculate(double initialAmount, int numPeriods, double[] interestRates) {

        double[][] taxesTable = new double[numPeriods + 1][interestRates.length];
        
        for (int m = 0; m < numPeriods + 1; m++) {
            double amount = initialAmount;
            for(int n = 0; n < interestRates.length; n++) {
                initialAmount = amount;
                taxesTable[m][n] = initialAmount;
                for(int i = 0; i < interestRates.length; i++) {
                    double tax = interestRates[i];
                    initialAmount = initialAmount + (initialAmount * tax);
                }
            }
        }

        return taxesTable;
    }
}