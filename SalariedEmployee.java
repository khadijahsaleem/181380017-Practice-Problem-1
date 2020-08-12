public class SalariedEmployee extends Employee {

    private double salary;

    public SalariedEmployee(int empId, String name, double taxRate , double salary)
    {
        super(getName(),getEmpId(),getTaxRate());
        setSalary(salary);
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    @java.lang.Override
    public java.lang.String toString() {
        super.toString();
        return "SalariedEmployee{" +
                "salary=" + salary + "Your Salaried  employeed salary is : " + calculateSalary() +
                '}';
    }

    public double calculateSalary()
    {
        return ("Your salariedEmployeeSalary is : " + (salary-(salary*getTaxRate())));
    }

}