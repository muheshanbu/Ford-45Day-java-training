
abstract class Employee {

    // Attributes: name, employeeId, monthlySalary
    private String name;
    private int employeeId;
    private int monthlySalary;

    public Employee(String name, int employeeId, int monthlySalary) {
        this.name = name;
        this.employeeId = employeeId;
        this.monthlySalary = monthlySalary;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getEmployeeId() {
        return employeeId;
    }

    public void setEmployeeId(int employeeId) {
        this.employeeId = employeeId;
    }

    public int getMonthlySalary() {
        return monthlySalary;
    }

    public void setMonthlySalary(int monthlySalary) {
        this.monthlySalary = monthlySalary;
    }

    abstract double calculateAnnualSalary();
    
    }
    
    class Manager extends Employee {
    
    // Implement constructor and override calculateAnnualSalary() method
    Manager(String name,int employeeId,int monthlySalary){
        super(name, employeeId, monthlySalary);
    }

        @Override
        double calculateAnnualSalary() {
            double annualSalary = this.getMonthlySalary()*12;
            return annualSalary;

        }
    }
    
    class Developer extends Employee {

    Developer(String name,int employeeId,int monthlySalary){
        super(name, employeeId, monthlySalary);
    }

        @Override
        double calculateAnnualSalary() {
            double annualSalry = this.getMonthlySalary()*12;
            return annualSalry;
        }
        // Implement constructor and override calculateAnnualSalary() method
    
    }
    
    public class EmployeeManagement {
    
    public static void main(String[] args) {

        Manager manager = new Manager("NAME",1,50000);
        double man_sal = manager.calculateAnnualSalary();
        System.out.println("The annual salary of manager: " + man_sal);

        Developer developer = new Developer("name",2,30000);
        double dev_sal = developer.calculateAnnualSalary();
        System.out.println("The annual salary of developer is :" +dev_sal);
    
    // Instantiate Manager and Developer objects, display attributes and annual salary
    
    }
    
    }
