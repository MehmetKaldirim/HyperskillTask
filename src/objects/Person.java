package objects;

import java.util.Date;

class Person {

    protected String name;
    protected int yearOfBirth;
    protected String address;

    public static void printNames(Person[] persons) {
        for (Person person : persons) {
            System.out.println(person.getName());
        }
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getYearOfBirth() {
        return yearOfBirth;
    }

    public void setYearOfBirth(int yearOfBirth) {
        this.yearOfBirth = yearOfBirth;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }
// public getters and setters for all fields
}

class Client extends Person {

    protected String contractNumber;
    protected boolean gold;

    public String getContractNumber() {
        return contractNumber;
    }

    public void setContractNumber(String contractNumber) {
        this.contractNumber = contractNumber;
    }

    public boolean isGold() {
        return gold;
    }

    public void setGold(boolean gold) {
        this.gold = gold;
    }
// public getters and setters for all fields
}

class Employee extends Person {

    protected Date startDate;
    protected Long salary;

    public Date getStartDate() {
        return startDate;
    }

    public void setStartDate(Date startDate) {
        this.startDate = startDate;
    }

    public Long getSalary() {
        return salary;
    }

    public void setSalary(Long salary) {
        this.salary = salary;
    }


// public getters and setters for all fields

    public static void main(String[] args) {
        /*In this case, we used subclass references
         because the types of the references and the created object are the same.*/

        Person person = new Person(); // the reference is Person, the object is Person
        Client client = new Client(); // the reference is Client, the object is Client
        Employee employee = new Employee(); // the reference is Employee, the object is Employee

        /*In this case, we used the superclass reference because the references have the type
         of the superclass and the actual types of created objects are subclasses.*/
        Person clientFromSuper = new Client(); // the reference is Person, the object is Client
        Person employeeFromSuper = new Employee(); // the reference is Person, the object is Employee

        /*you cannot assign an object of one subclass to the reference of another subclass
         because they don't inherit each other:*/
        //Client whoIsIt = new Employee(); // it's impossible

        /*you cannot assign an object of the parent class to the reference of its subclass:*/
        //Client client = new Person(); // it's impossible too


        Person employeeFromPerson = new Employee();

        employeeFromPerson.setName("Ginger R. Lee"); // Ok
        employeeFromPerson.setYearOfBirth(1980); // Ok

        /*The superclass Person doesn't have the method setSalary of the class Employee.
         You cannot invoke the method through the superclass reference. The same rule
          holds for fields.*/
        ///employeeFromPerson.setSalary(30000); // Compile-time error, the base class "doesn't know" about the method

        /*if the object is an instance of this subclass, otherwise a ClassCastException will be thrown.
        Be careful when casting a class to its subclass*/


        Person personCreatAsClient = new Client();
        Client clientAgain = (Client) personCreatAsClient; // it's ok

        //Both are subclass u can not cats it from subclass to subclass
        //Employee employee1 = (Employee) personCreatAsClient; // the ClassCastException occurs here




        Person personForArray = new Employee();
        personForArray.setName("Ginger R. Lee");

        Client clientForArray = new Client();
        clientForArray.setName("Pauline E. Morgan");

        Employee employeeForArray = new Employee();
        employeeForArray.setName("Lawrence V. Jones");

        Person[] persons = {personForArray, clientForArray, employeeForArray};

        //"Array method Print from base class
        System.out.println("These are assign to Array from superclass");
        printNames(persons); // method can be from base or sub here
    }
}