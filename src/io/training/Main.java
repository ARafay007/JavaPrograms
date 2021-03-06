package io.training;
import io.training.aggregation.Employee;
import io.training.aggregation.Students;
import io.training.inheritance.Manager;
import io.training.inheritance.Peon;
import io.training.inheritance.Teacher;
import io.training.studentinfo.Student;
import io.training.singledesignpattern.Singleton;
import io.training.aggregation.Address;
import io.training.association.*;

public class Main {
    public static void main(String[] args){
//      "1. - Using encapsulation write a program in java that encapsulates Student's information (name, roll no etc)
        Student stdObj = new Student();
        stdObj.setName("John");
        stdObj.setRollNo("2k17-swe-72");
        System.out.println(stdObj.getName());
        System.out.println(stdObj.getRollNo());
        System.out.println();

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
        System.out.println();


//        3. Create an example of Inheritence.
//        3.1. Inherit a class.
        Teacher tObj = new Teacher("Kamran", "0345-9238273", "21st Street", "IICT", "Asst: Prof");
        tObj.showTeacherDetail();

        Manager mObj = new Manager("Rabee", "0352-7761776", "12th Street", "Finance", "Associate Manager");
        mObj.showHRDetails();

        Peon pObj = new Peon("Yasir", "0342-7678986", "22th Street", "Helper");
        pObj.showPeonDetails();

//        3.2. Compose a class.
//
//        3.2.1. Compose class with Aggregation.
        Address adr = new Address(17, "Khi", "PK");
        Students std = new Students("Rehan", adr);

        System.out.println(std.getStdName());
        System.out.println(std.getStdAdress().getStreetNum() + " " + std.getStdAdress().getcity() + " " + std.getStdAdress().getCountery());
        System.out.println();

        adr = new Address(2, "LHR", "PK");
        Employee emp = new Employee("Faraz", "0333-2123213", adr);

        System.out.println(emp.getEmpName());
        System.out.println(emp.getEmpContact());
        System.out.println(emp.getEmpAddress().getStreetNum() + " " + emp.getEmpAddress().getcity() + " " + emp.getEmpAddress().getCountery());

//        3.2.2. Compose class with Association.

        Nisum nisumObj = new Nisum("NISUM");
        Person personObj = new Person("Ahmed");

        System.out.println(personObj.getName() + " works at " + nisumObj.getName());

//        4. Abstract class and interface. (difference) interface mulitple inheritance (if both interfaces method same then what is the behaviour, abstract class and interface)
//        3. Reading Material: https://www.baeldung.com/java-composition-aggregation-association"
    }
}
