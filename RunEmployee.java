public class RunEmployee {

    public static void main(String[] args) {
	// write your code here

        Employee[] emp = new Employee[6];


        emp[0] =new HourlyEmployedSalary (2,"Ayesha" , 33.5 , 12.0 , 24.5);
        emp[1] = new HourlyEmployedSalary (3,"Ahmed" , 34.5 , 5.0 , 14.5);
        emp[2] = new  CommissionEmployeed (4,"Zuha" , 23.5 , 24.0 , 14.5);
        emp[3] = new CommissionEmployeed (5,"Mehak" , 13.5 , 4.0 , 4.5);
        emp[4] = new SalariedEmployee (6"Shahmeer" , 15.6 , 12000.0);
        emp[5] = new SalariedEmployee  (6"Shah" , 5.6 , 120000.0);


        for (int i = 0 ; i < 6  ; i++)
        {
            System.out.println(emp[i].toString() );

        }

    }
}