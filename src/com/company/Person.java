package com.company;

public class Person {

    private String name;
    private int age;

    public Person() { //defaultkonstruktorn
        name = "John/Jane Doe";
        age = 0;
    }

    public Person(String name, int age) {
        this.name = name;
        setAge(age);
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        if (age > 0) {
            this.age = age;
        } else {
            this.age = 0;
        }
    }

    public String getName() {
        return this.name;
    }

    public int getAge() {
        return this.age;
    }

    public void birthDay() {
        age++;
    }

    public void printInfo() {
        System.out.printf("%s is %d years old!\n", name, age);
    }
}
