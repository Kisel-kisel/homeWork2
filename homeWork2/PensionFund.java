package homeWorks.homeWork2;

public class PensionFund {
    final static double COEFFICIENT = 0.02;
    String moneyForFree = "Free money";
    boolean isItBoolean=true;
    final String dateOfCreate;
    static double middlePensionInCountry = 1500;
    static double yearsInWork = 20;
    static double minSalary = 5000;
    static double maxSalary = 10000;


    public PensionFund(String moneyForFree, boolean isItBoolean, String dateOfCreate) {
        this.moneyForFree = moneyForFree;
        this.isItBoolean = isItBoolean;
        this.dateOfCreate = dateOfCreate;
    }

//    private double one  = UtilitClass.middleOfTwoNumbers(minSalary, maxSalary) * yearsInWork * COEFFICIENT;
//    private double two = UtilitClass.middleOfThreeNumbers(minSalary, maxSalary, middlePensionInCountry) * yearsInWork * COEFFICIENT;
//
//    public double countOfPension() {
//        double resualt = 0;
//        if (isItBoolean) {
//           resualt = one;
//        } else if (!isItBoolean) {
//            resualt = two;
//        }
//        return resualt;
//    }


}

