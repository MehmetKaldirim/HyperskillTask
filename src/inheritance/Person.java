package inheritance;


import java.util.Arrays;
import java.util.Date;

class Person {
    protected String name;
    protected int yearOfBirth;
    protected String address;

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
// public getters and setters for all fields here
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
// public getters and setters for all fields here
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
// public getters and setters for all fields here
}

class Programmer extends Employee {
    protected String[] programmingLanguages;

    public String[] getProgrammingLanguages() {
        return programmingLanguages;
    }

    public void setProgrammingLanguages(String[] programmingLanguages) {
        this.programmingLanguages = programmingLanguages;
    }
}

class Manager extends Employee {
    protected boolean smile;

    public boolean isSmile() {
        return smile;
    }

    public void setSmile(boolean smile) {
        this.smile = smile;
    }

    public static void main(String[] args) {
        Programmer p = new Programmer();

        p.setName("John Elephant");
        p.setYearOfBirth(1985);
        p.setAddress("Some street, 15");
        p.setStartDate(new Date());
        p.setSalary(500_000L);
        p.setProgrammingLanguages(new String[]{"Java", "Scala", "Kotlin"});

        System.out.println(p.getName()); // John Elephant
        System.out.println(p.getSalary()); // 500000
        System.out.println(Arrays.toString(p.getProgrammingLanguages())); // [Java, Scala, Kotlin]
    }
}
