package comparableIntro;


import java.util.ArrayList;
import java.util.List;
import java.util.Collections;

public class Car implements Comparable<Car> {
    private int number;
    private String model;
    private String color;
    private int weight;

    public Car(int number, String model, String color, int weight) {
        this.number = number;
        this.model = model;
        this.color = color;
        this.weight = weight;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    @Override
    public int compareTo(Car otherCar) {
        return Integer.valueOf(getNumber()).compareTo(otherCar.getNumber());
    }

    @Override
    public String toString() {
        return "Car = {" + number  + " number " + model + " model  "+ color + " color " + weight + " weight " + "}";
    }
    public static void main(String[] args) {
        List<Car> cars = new ArrayList<>();
        Car car1 = new Car(876, "BMW", "white", 1400);
        Car car2 = new Car(345, "Mercedes", "black", 2000);
        Car car3 = new Car(470, "Volvo", "blue", 1800);
        cars.add(car1);
        cars.add(car2);
        cars.add(car3);

        Collections.sort(cars);
        System.out.println(cars.toString());
    }

}

