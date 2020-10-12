package Super;

class Employee{
    void display(){
        System.out.println("Name of the class is Employee");
    }

    void calcSalary(){
        System.out.println("Salary of employee is 10000");
    }
}

class Engineer extends Employee{
    void calcSalary(){
        super.calcSalary();
        System.out.println("Salary of engineer is 20000");
    }
}
class Work{
    public static void main(String[] args) {
        Engineer worker = new Engineer();
        worker.display();
        worker.calcSalary();
    }
}