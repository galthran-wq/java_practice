package com.company;


import java.util.ArrayList;


class Shape {
    String type;

    public Shape(String type) {
        this.type = type;
    }
}

class TestShape {

    public static void testCreate() {
        Shape test = new Shape("triangle");
        assert "triangle".equals(test.type);
    }

    public static void runTests() {
        testCreate();
    }
}


class Dog {
    String name;
    int age;

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int ageAsHuman() {
        return this.age * 7;
    }

    @Override
    public String toString() {
        return "Dog{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }

    public Dog(String name, int age) {
        this.name = name;
        this.age = age;
    }
}


class TestDog {
    ArrayList<Dog> dogs;

    public void addDog(String name, int age) {
        this.dogs.add(new Dog(name, age));
    }
}

class Circle {
    double radius;

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    public Circle(double radius) {
        this.radius = radius;
    }

    public double getArea() {
        return Math.PI * Math.pow(radius, 2);
    }

    public double getLength() {
        return 2 * Math.PI * radius;
    }
}


class CircleTest {

    public static void main(String[] args) {
        test_initialize();
        test_radius_getter();
        test_radius_setter();
        test_getArea();
        test_getLength();
        System.out.println("SUCCESS");
    }

    private static Circle getCircle(double r) {
        return new Circle(r);
    }

    public static void test_initialize() {
        Circle test = getCircle(10.7);
        assert test.radius == 10.7;
    }

    public static void test_radius_getter() {
        Circle test = getCircle(10.7);
        assert test.getRadius() == test.radius;
    }

    public static void test_radius_setter() {
        Circle test = getCircle(10.7);
        test.setRadius(20.7);
        assert test.radius == 20.7;
    }

    public static void test_getArea() {
        Circle test = getCircle(10.7);
        assert test.getArea() == test.radius * test.radius * Math.PI;
    }

    public static void test_getLength() {
        Circle test = getCircle(10.7);
        assert test.getArea() == test.radius * 2 * Math.PI;
    }

}


public class num2 {
    public static void main(String[] args) {
        CircleTest.main(args);
    }
}
