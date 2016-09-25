package example.testpack;

import example.applepack.Apple;
import test.Car;

/**
 * Created by Alex on 9/25/2016.
 */
public class Main {
    public static void main(String[] args) {

        Apple apple1 = new Apple();
        Apple apple2 = new Apple();
        apple1.setWeight(0.2);
        apple2.setWeight(0.3);

        Car car1 = new Car();
        Car car2 = new Car();
        car1.setWeight(1000);
        car2.setWeight(800);

        System.out.println("Weights of apples: " + apple1.getWeight() + ", " + apple2.getWeight());
        System.out.println("Weights of cars: " + car1.getWeight() + ", " + car2.getWeight());
    }
}
