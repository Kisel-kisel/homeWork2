package homeWorks.homeWork2;

public class ResFouthMet {
    public static void main(String[] args) {
    FourthMethod name = new FourthMethod("Vlad");
    name.setItBoolean(false);
    name.setYearsInWork(30);
    name.setMinSalary(2000);
    name.setMaxSalary(10000);
     System.out.println(name.countOfPension());
}
}
