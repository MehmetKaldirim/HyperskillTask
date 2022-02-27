package modifiersAndGetterSetter;

public class Promotion {
    /*An instance of the Salary class can be created inside a method of Promotion,
     and the field can also be accessed by Promotion and its members because
      they have the same package.*/
    Salary salary;

    Promotion(Salary salary) {
        this.salary = salary;
    }

    public void promote() {
        salary.income += 1500;
    }
}