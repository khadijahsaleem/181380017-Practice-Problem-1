public class HourlyEmployedSalary extends Employee{

    private double hours;
    private double hourlyRate;

    public HourlyEmployedSalary(int empId, String name, double taxRate, double hours , double hourlyRate) {
        super(getName(),getEmpId(),getTaxRate());
        setHours(hours);
        setHourlyRate(hourlyRate);
    }

    public double getHours() {
        return hours;
    }

    public void setHours(double hours) {
        this.hours = hours;
    }

    public double getHourlyRate() {
        return hourlyRate;
    }

    public void setHourlyRate(double hourlyRate) {
        this.hourlyRate = hourlyRate;
    }

    @java.lang.Override
    public java.lang.String toString() {
        super.toString();
        return "HourlyEmployedSalary{" +
                "hours=" + hours +
                ", hourlyRate=" + hourlyRate + "Your Hourly employeed salary is : " + calculateSalary() +
                '}';
    }

    public double calculateSalary()
    {
        double grossPay = hours * hourlyRate;
        double Tax = grossPay * getTaxRate();
        double Salary = grossPay - Tax;
    }
}