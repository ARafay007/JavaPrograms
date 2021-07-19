package io.training;
import StudentInfo.Student;
import SingleDesignPattern.Singleton;

public class Main {
    public static void main(String[] args){
//      "1. - Using encapsulation write a program in java that encapsulates Student's information (name, roll no etc)
        Student stdObj = new Student();
        stdObj.setName("John");
        stdObj.setRollNo("2k17-swe-72");
        System.out.println(stdObj.getName());
        System.out.println(stdObj.getRollNo());


//      2. Write a program in java that implements Singleton design pattern.
//         The program should only make One object and upon creating another object, it should return the same object. Also confirm this behaviour by prinitng the object. Another way to determine same object is the ""=="" operator, it should return `true` if you have same object in both references.

        Singleton x = Singleton.getInstance();
        Singleton y = Singleton.getInstance();
        Singleton z = Singleton.getInstance();

        x.a = x.a.toUpperCase();
        System.out.println("x instance: " + x.a);
        System.out.println("x instance: " + y.a);
        System.out.println("x instance: " + z.a);

        if(z == y) System.out.println("true");
        else System.out.printf("false");

//        3. Create an example of Inheritence.
//        3.1. Inherit a class.
//        3.2. Compose a class.
//        3.2.1. Compose class with Aggregation.
//        3.2.2. Compose class with Association.
//        4. Abstract class and interface. (difference) interface mulitple inheritance (if both interfaces method same then what is the behaviour, abstract class and interface)
//        3. Reading Material: https://www.baeldung.com/java-composition-aggregation-association"








    }
}