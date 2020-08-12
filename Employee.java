public abstract Employee{

private int empId;
private String name;
private double taxRate;

//no arg constructor
public Employee()
        {
        empId = 1;
        name = "Ali";
        taxRate = 10.2;
        }

public Employee(int empId, String name, double taxRate) {
        this.empId = empId;
        this.name = name;
        this.taxRate = taxRate;
        }

public int getEmpId() {
        return empId;
        }

public void setEmpId(int empId) {
        this.empId = empId;
        }

public String getName() {
        return name;
        }

public void setName(String name) {
        this.name = name;
        }

public double getTaxRate() {
        return taxRate;
        }

public void setTaxRate(double taxRate) {
        this.taxRate = taxRate;
        }

public abstract double calculateSalary();
public String toString()
        {
        return ("Your Emp id is : " + empId + "Your Emp name is : " +
        name + "Your Tax rate is : " taxRate);

        }

        }