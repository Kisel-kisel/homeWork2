package homeWorks.homeWork2;

public class FourthMethod {
    private final String person;

    public FourthMethod(String person) {
        this.person = person;
    }


    private final static double COEFFICIENT = 0.02;
    private final static double middlePensionInCountry = 1500;
    private static boolean isItBoolean;
    public void setItBoolean(boolean itBoolean) {
        isItBoolean = itBoolean;
    }
    private static double yearsInWork;

    public static void setYearsInWork(double yearsInWork) {
        FourthMethod.yearsInWork = yearsInWork;
    }

    private static double minSalary;

    public static void setMinSalary(double minSalary) {
        FourthMethod.minSalary = minSalary;
    }

    private static double maxSalary;

    public static void setMaxSalary(double maxSalary) {
        FourthMethod.maxSalary = maxSalary;
    }



//    private double one  = UtilitClass.middleOfTwoNumbers(minSalary, maxSalary) * yearsInWork * COEFFICIENT;
//    private double two = UtilitClass.middleOfThreeNumbers(minSalary, maxSalary, middlePensionInCountry) * yearsInWork * COEFFICIENT;

    public double countOfPension() {
        double resualt = 0;
        if (isItBoolean) {
            resualt = UtilitClass.middleOfTwoNumbers(minSalary, maxSalary) * yearsInWork * COEFFICIENT;
        } else if (!isItBoolean) {
            resualt = UtilitClass.middleOfThreeNumbers(minSalary, maxSalary, middlePensionInCountry) * yearsInWork * COEFFICIENT;
        }
        return resualt;
    }

}
