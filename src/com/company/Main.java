package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Person person=new Person("Anna", 29); //automatiskt anrop av Person(String name, int age)
        Person person1=new Person(); //anrop till defaultkonstruktorn

        person1.setName("Åsna");
        person1.printInfo();

        person.birthDay();
        System.out.println(person.getAge());
        Scanner scan=new Scanner(System.in);
        System.out.println("Ange namn");
        String n=scan.nextLine();
        person.setName(n);
    }
}
