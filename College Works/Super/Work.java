package Super;


//class of employee
class Employee{
    //function to display class name
    void display(){
        System.out.println("Name of the class is Employee");
    }

    //function to print salary of employee
    void calcSalary(){
        System.out.println("Salary of employee is 10000");
    }
}

class Engineer extends Employee{
    //override calcSalary function of Employee class
    void calcSalary(){
        //call parent class method
        super.calcSalary();
        System.out.println("Salary of engineer is 20000");
    }
}
class Work{
    public static void main(String[] args) {
        //create an object of child class
        Engineer worker = new Engineer();
        worker.display();
        worker.calcSalary();
    }
}