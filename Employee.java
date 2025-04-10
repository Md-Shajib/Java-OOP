public class Employee {

    //instance variable 
    private String employeeName;
    private float salary;

    public Employee(String employeeName, float salary){
        this.employeeName = employeeName;
        this.salary = salary;
    }
    //getter method
    public void getName(){ System.out.println(employeeName); }
    public void getSalary(){ System.out.println(salary);}

    //setter method
    public void setName(String name) { this.employeeName = name; }
    public void setSalary(float salary) { this.salary = salary; }

    public void display(){
        System.out.println("Name: " + employeeName);
        System.out.println("Salary: " + salary);
    }
    
    public static void main(String[] args) {
        Employee ob1 = new Employee("Shajib", 50000);
        ob1.display();
        ob1.setName("Ratul Hasan");
        ob1.display();
    }
}