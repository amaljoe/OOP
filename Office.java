//parent class of employee
class Employee{
    String name;
    int age;
    String phone;
    String address;
    double salary;

    //parent class constructor
    Employee(String name, int age, String phone, String address, double salary){
        this.name = name;
        this.age = age;
        this.phone = phone;
        this.address = address;
        this.salary = salary;
    }

    //to print the salary
    void printSalary(){
        System.out.println("Salary of " + name + " is Rs." + salary + "/-");
    }
}
//child class of officer
class Officer extends Employee {
    String specialisation;

    //constructor
    Officer(String name, int age, String phone, String address, double salary, String specialisation) {
        //call parent class constructor
        super(name, age, phone, address, salary);
        this.specialisation = specialisation;
    }
}

//child class of manager
class Manager extends Employee {
    String department;

    Manager(String name, int age, String phone, String address, double salary, String department){
        //call parent class constructor
        super(name, age, phone, address, salary);
        this.department = department;
    }
}

public class Office {
    public static void main(String[] args) {
        //create an instance of officer and manager
        Officer officer = new Officer("Amal", 22, "9119119111", "Baselios, Trivandrum, Kerala", 100000.0, "AI");
        Manager manager = new Manager("Joe", 32, "8125479572", "Kowdiar, Trivandrum, Kerala", 300000.0, "Software");
        //call the parent class method to print salary of both
        officer.printSalary();
        manager.printSalary();
    }
}


// Write a Java program which creates a class named 'Employee' having the following
// members: Name, Age, Phone number, Address, Salary. It also has a method named 'printSalary( )' which prints the salary of the Employee. Two classes 'Officer' and 'Manager'
// inherits the 'Employee' class. The 'Officer' and 'Manager' classes have data members 'specialization' and 'department' respectively. Now, assign name, age, phone number, address
// and salary to an officer and a manager by making an object of both of these classes and
// print the same. (Exercise to understand inheritance).