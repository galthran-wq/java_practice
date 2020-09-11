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

    public static void runTests() {
        TestDog test = new TestDog();
        test.addDog("some_name", 3);
        assert !test.dogs.isEmpty();
        assert test.dogs.get(0).name.equals("some_name");
        assert test.dogs.get(0).age == 3;
    }
}


public class num2 {
    public static void main(String[] args) {
        new TestDog();
    }
}
