package org.example;

public class Main {
    public static void main(String[] args) {
        Person person = new Person("John", "Doe", 20);
        System.out.println("Firstname: " + person.getFirstName());

        System.out.println("LastName: " + person.getLastName());

        System.out.println("Age: " + person.getAge());
        System.out.println("Hello world");
        Person Ekin=new Person("Ekin","Eraydin",31);
        System.out.println(Ekin.firstName);
        System.out.println(Ekin.getAge());
        Person Umut=new Person("green","black",72.6);
        System.out.println(Umut.getEyeColor().toUpperCase());
        Person Oyku=new Person(45,"blonde");
        System.out.println(Oyku.getWeightoffPerson());
        Person Speeka=new Person("yellow","mixed",1.8,"Speeka","Star",1);
        System.out.println(Speeka.getHairColor());
        Wall wall = new Wall(5.0,4.0);
        System.out.println(wall.getWidth());
        System.out.println("area= " + wall.getArea());

        wall.setHeight(-1.5);

        System.out.println("width= " + wall.getWidth());

        System.out.println("height= " + wall.getHeight());

        System.out.println("area= " + wall.getArea());
    }








}
