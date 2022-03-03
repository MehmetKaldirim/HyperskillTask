package comparableIntro;

class Person implements Comparable<Person> {
    private String name;
    private int age;
    private int height;
    private int weight;

    public Person(String name, int age, int height, int weight) {
        this.name = name;
        this.age = age;
        this.height = height;
        this.weight = weight;
    }

    public String getName() {
        return this.name;
    }

    public int getAge() {
        return this.age;
    }

    public int getHeight() {
        return this.height;
    }

    public int getWeight() {
        return this.weight;
    }

    @Override
    public int compareTo(Person otherPerson) {
        int compAge = Integer.valueOf(getAge()).compareTo(otherPerson.getAge());
        int compNames = Integer.valueOf(getName().compareTo(otherPerson.getName()));
        return compNames != 0 ? compNames : compAge;
    }
    /*
    // another good solution
    @Override
    public int compareTo(Person otherPerson) {
        return Comparator.comparing(Person::getName).
                thenComparing(Person::getAge).
                compare(this, otherPerson);
    }

     // this not work
    @Override
    public int compareTo(Person otherPerson) {
        // add your code here!
        return getName().compareTo(otherPerson.getName()) == -1 ? -1 :
                getName().compareTo(otherPerson.getName()) == 1 ? 1 : Integer.valueOf(getAge()).compareTo(otherPerson.getAge());

    }*/
}