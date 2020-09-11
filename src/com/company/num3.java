package com.company;

import java.awt.*;

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


class TestCircle {

    public static void main(String[] args) {
        test_initialize();
        test_radius_getter();
        test_radius_setter();
        test_getArea();
        test_getLength();
        System.out.println(TestCircle.class.toString() + " SUCCESS");
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


class OrientedPair<T> {
    private T left;
    private T right;

    public OrientedPair(T left, T right) {
        this.left = left;
        this.right = right;

    }

    public T getLeft() {
        return left;
    }

    public T getRight() {
        return right;
    }
}


class Head {
    int size;

    public Head(int size) {
        this.size = size;
    }
}


class Hand {
    int length;

    public Hand(int length) {
        this.length = length;
    }
}


class Leg {
    int length;

    public Leg(int length) {
        this.length = length;
    }
}


class Human {
    Head head = new Head(40);
    OrientedPair<Hand> hands = new OrientedPair<>(
            new Hand(10),
            new Hand(10)
    );
    OrientedPair<Leg> legs = new OrientedPair<>(
            new Leg(10),
            new Leg(10)
    );
}


class TestHuman {
    public static void main(String[] args) {
        testInitialize();
        System.out.println(TestHuman.class.toString() + " SUCCESS");
    }

    public static void testInitialize() {
        Human test = new Human();
        assert test.hands.getLeft().length == 10;
        assert test.hands.getRight().length == 10;
        assert test.legs.getRight().length == 10;
        assert test.legs.getLeft().length == 10;
        assert test.head.size == 40;
    }
}


class Book {
    public Book(String author, String name, int publishingDate) {
        this.author = author;
        this.name = name;
        this.publishingDate = publishingDate;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPublishingDate() {
        return publishingDate;
    }

    public void setPublishingDate(int publishingDate) {
        this.publishingDate = publishingDate;
    }

    String author;
    String name;
    int publishingDate;

}


class TestBook {

    public static void main(String[] args) {
        test_initialize();
        test_getters();
        test_setters();
        System.out.println(TestBook.class.toString() + " SUCCESS");
    }

    private static Book getBook(String author, int publishingDate, String name) {
        return new Book(author, name, publishingDate);
    }

    public static void test_initialize() {
        Book test = getBook("some_name", 1, "another_name");
        assert test.author.equals("some_name");
        assert test.name.equals("another_name");
        assert test.publishingDate == 1;
    }

    public static void test_getters() {
        Book test = getBook("some_name", 1, "another_name");
        assert test.author.equals(test.getAuthor());
        assert test.name.equals(test.getName());
        assert test.getPublishingDate() == test.publishingDate;
    }

    public static void test_setters() {
        Book test = getBook("some_name", 1, "another_name");

        String newName = "new_name";
        String newAuthor = "new_name";
        int newPublishingDate = 6;
        test.setAuthor(newAuthor);
        test.setName(newName);
        test.setPublishingDate(newPublishingDate);

        assert test.author.equals(newAuthor);
        assert test.name.equals(newName);
        assert test.publishingDate == newPublishingDate;
    }
}


public class num3 {
    public static void main(String[] args) {
        TestCircle.main(args);
        TestBook.main(args);
        TestHuman.main(args);
    }
}

//abstract class Dish {
//    abstract String getDescription();
//}
//
//class Plate extends Dish {
//
//    double radius;
//    Color color;
//
//    public Plate(double radius, int r, int g, int b) {
//        this.color = new Color(r, g, b);
//        this.radius = radius;
//    }
//
//    public Plate(double radius, Color color) {
//        this.color = color;
//        this.radius = radius;
//    }
//
//    public String getDescription() {
//        return String.format(
//            "This is %s colored plate with radius = %a",
//            color.toString(),
//            radius
//        );
//    }
//}
//
//
//class Pan extends Dish {
//    double volume;
//
//    public Pan(double volume) {
//        this.volume = volume;
//    }
//
//    public String getDescription() {
//        return String.format("This is a pan with volume = %a", volume);
//    }
//}
//
//
//public class num3 {
//    public static void main(String[] args) {
//        Plate a = new Plate(10.7, Color.BLACK);
//        System.out.println(a.getDescription());
//
//        Pan b = new Pan(10.9);
//        System.out.println(b.getDescription());
//    }
//}