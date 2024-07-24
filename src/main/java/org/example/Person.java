package org.example;

public class Person {
    String firstName;
    String lastName;
    int age;
    String eyeColor;
    double weight;
    String hairColor;

    public Person (String firstName,String lastName,int age){
    this.firstName=firstName;
    this.lastName=lastName;
    this.age=age;
    }
    public Person (String eyeColor,String hairColor,double weight){
    this.eyeColor=eyeColor;
    this.hairColor=hairColor;
    }
    public Person (String eyeColor,String hairColor,double weight,String firstName,String lastName,int age){
    this(eyeColor,hairColor,weight);
    this.firstName=firstName;
    this.lastName=lastName;
    this.age=age;
    }
    public Person (double weight,String hairColor){
    this.weight=weight;
    this.hairColor=hairColor;
    }

    public  String getFirstName () {
        return this.firstName;
    }
    public String getLastName (){
        return  this.lastName;
    }
    public int getAge (){
        return this.age;
    }

    public boolean isTeen (){
        if (this.age >12&& this.age<20){
            return true;
        }else{
            return false;
        }
    }
    public String getEyeColor (){
        return this.eyeColor;
    }
    public String getHairColor (){
        return this.hairColor;
    }
    public double getWeightoffPerson (){
        return this.weight;
    }

}
