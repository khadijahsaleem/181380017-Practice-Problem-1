public class CommissionedEmployee extends Employee
{
    private double sales;
    private double salesRate;

    public CommissionedEmployee(int empId, String name, double taxRate ,double sales, double salesRate) {
        super(getName(),getEmpId(),getTaxRate());
        this.sales = sales;
        this.salesRate = salesRate;
    }

    public double getSales() {
        return sales;
    }

    public void setSales(double sales) {
        this.sales = sales;
    }

    public double getSalesRate() {
        return salesRate;
    }

    public void setSalesRate(double salesRate) {
        this.salesRate = salesRate;
    }

    @java.lang.Override
    public java.lang.String toString() {
        return "CommissionedEmployee{" +
                "sales=" + sales +
                ", salesRate=" + salesRate +
                '}';
    }

    public double calculateSalary()
    {
        double grossPay = sales * salesRate;
        double Tax = grossPay * getTaxRate();
        double Salary = grossPay - Tax;
    }
}
