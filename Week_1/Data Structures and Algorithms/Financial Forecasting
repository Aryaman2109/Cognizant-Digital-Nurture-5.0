public class FinancialForecast {

    // Calculates the future value using recursion
    public static double calculateFutureValue(double currentValue,
                                              double growthRate,
                                              int remainingYears) {

        // Base case: no more years left
        if (remainingYears == 0) {
            return currentValue;
        }

        // Increase the value for one year and continue recursively
        double updatedValue = currentValue * (1 + growthRate);

        return calculateFutureValue(updatedValue,
                growthRate,
                remainingYears - 1);
    }

    public static void main(String[] args) {

        double initialAmount = 10000;
        double yearlyGrowthRate = 0.10;
        int years = 5;

        double forecast = calculateFutureValue(initialAmount,
                yearlyGrowthRate,
                years);

        System.out.printf("Future Value after %d years: %.2f%n",
                years,
                forecast);
    }
}
